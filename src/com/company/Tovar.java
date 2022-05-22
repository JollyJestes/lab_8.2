package com.company;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Tovar {
    private String kolvo;
    private String name;
    private int price;
    private int yearOfMan;
    private int manufacture;


    public void function() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введьте 5 названий товара:");
        String g1 = scanner.nextLine();
        String g2 = scanner.nextLine();
        String g3 = scanner.nextLine();
        String g4 = scanner.nextLine();
        String g5 = scanner.nextLine();

        int t1 = (int) (Math.random() * 999);
        int t2 = (int) (Math.random() * 999);
        int t3 = (int) (Math.random() * 999);
        int t4 = (int) (Math.random() * 999);
        int t5 = (int) (Math.random() * 999);
        //price
        int pr1 = (int) (Math.random() * 4000);
        int pr2 = (int) (Math.random() * 4000);
        int pr3 = (int) (Math.random() * 4000);
        int pr4 = (int) (Math.random() * 4000);
        int pr5 = (int) (Math.random() * 4000);
        //age
        int r = 1900;
        int ym1 = r + (int) (Math.random() * 120);
        int ym2 = r + (int) (Math.random() * 120);
        int ym3 = r + (int) (Math.random() * 120);
        int ym4 = r + (int) (Math.random() * 120);
        int ym5 = r + (int) (Math.random() * 120);


        if (t1 > t2) {
            if (t1 > t3) {
                if (t1 > t4) {
                    if (t1 > t5) {
                        System.out.println("Kolvo " + "(" + g1 + ")" + ":\t" + t1 + "\n" + "price:\t" + pr1 + "₴" + "\n" + "yearOfMan:\t" + ym1);
                    }
                }
            }
        }

        if (t2 > t1) {
            if (t2 > t3) {
                if (t2 > t4) {
                    if (t2 > t5) {
                        System.out.println("Kolvo " + "(" + g2 + ")" + ":\t" + t2 + "\n" + "price:\t" + pr2 + "₴" + "\n" + "yearOfMan:\t" + ym2);
                    }
                }
            }
        }


        if (t3 > t1) {
            if (t3 > t2) {
                if (t3 > t4) {
                    if (t3 > t5) {

                        System.out.println("Kolvo " + "(" + g3 + ")" + ":\t" + t3 + "\n" + "price:\t" + pr3 + "₴" + "\n" + "yearOfMan:\t" + ym3);
                    }
                }
            }
        }

        if (t4 > t1) {
            if (t4 > t2) {
                if (t4 > t3) {
                    if (t4 > t5) {
                        System.out.println("Kolvo " + "(" + g4 + ")" + ":\t" + t4 + "\n" + "price:\t" + pr4 + "₴" + "\n" + "yearOfMan:\t" + ym4);
                    }
                }
            }
        }
        if (t5 > t1) {
            if (t5 > t2) {
                if (t5 > t3) {
                    if (t5 > t4) {
                        System.out.println("Kolvo " + "(" + g5 + ")" + ":\t" + t5 + "\n" + "price:\t" + pr5 + "₴" + "\n" + "yearOfMan:\t" + ym5);
                    }
                }
            }
        }

        //manufacture
        int man = (int) (Math.random() * 30 + 1);
        if (man < 5) {
            System.out.println("manufacture:\tGreece");
        }
        if (5 < man) {
            if (man <= 10) {
                System.out.println("manufacture:\tItaly");
            }
        }
        if (man > 10) {
            if (man <= 15) {
                System.out.println("manufacture:\tKorea, South");
            }
        }
        if (man > 15) {
            if (man <= 20) {
                System.out.println("manufacture:\tLatvia");
            }
        }
        if (man > 20) {
            if (man < 30) {
                System.out.println("manufacture:\tUkraine");
            }
        }
        File myFile = new File(" Tovar.txt");

        try {
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(myFile)));

            if (t1 > t2) {
                if (t1 > t3) {
                    if (t1 > t4) {
                        if (t1 > t5) {
                            writer.println("Kolvo " + "(" + g1 + ")" + ":\t" + t1 + "\n" + "price:\t" + pr1 + "₴" + "\n" + "yearOfMan:\t" + ym1 + "\n" + "manufacture:\tUkraine");
                        }
                    }
                }
            }
            if (t2 > t1) {
                if (t2 > t3) {
                    if (t2 > t4) {
                        if (t2 > t5) {
                            writer.println("Kolvo " + "(" + g2 + ")" + ":\t" + t2 + "\n" + "price:\t" + pr2 + "₴" + "\n" + "yearOfMan:\t" + ym2 + "\n" + "manufacture:\tKorea, South");
                        }
                    }
                }
            }
            if (t3 > t1) {
                if (t3 > t2) {
                    if (t3 > t4) {
                        if (t3 > t5) {

                            writer.println("Kolvo " + "(" + g3 + ")" + ":\t" + t3 + "\n" + "price:\t" + pr3 + "₴" + "\n" + "yearOfMan:\t" + ym3 + "\n" + "manufacture:\tItaly");
                        }
                    }
                }
            }
            if (t4 > t1) {
                if (t4 > t2) {
                    if (t4 > t3) {
                        if (t4 > t5) {
                            writer.println("Kolvo " + "(" + g4 + ")" + ":\t" + t4 + "\n" + "price:\t" + pr4 + "₴" + "\n" + "yearOfMan:\t" + ym4 + "\n" + "manufacture:\tGreece");
                        }
                    }
                }
            }
            if (t5 > t1) {
                if (t5 > t2) {
                    if (t5 > t3) {
                        if (t5 > t4) {
                            writer.println("Kolvo " + "(" + g5 + ")" + ":\t" + t5 + "\n" + "price:\t" + pr5 + "₴" + "\n" + "yearOfMan:\t" + ym5 + "\n" + "manufacture:\tLatvia");
                        }
                    }
                }
            }
            writer.flush();
            writer.close();
        } catch (
                IOException ex) {
            ex.printStackTrace();
        }
    }

}


