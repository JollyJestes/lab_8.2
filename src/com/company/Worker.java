package com.company;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Worker {
    private int lastName;
    private String name;
    private int surname;
    private int position;
    private int gender;
    private int employmentDate;

    public Worker() {
    }

    public void function() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Фамилия сотрудников(введите 3 фамилии)");
        String ln1 = scanner.nextLine();
        String ln2 = scanner.nextLine();
        String ln3 = scanner.nextLine();
        System.out.println("Имя сотрудников(введите 3 имени)");
        String nm1 = scanner.nextLine();
        String nm2 = scanner.nextLine();
        String nm3 = scanner.nextLine();
        System.out.println("Отчества сотрудников(введите 3 отчества)");
        String srn1 = scanner.nextLine();
        String srn2 = scanner.nextLine();
        String srn3 = scanner.nextLine();
        System.out.println("Должность сотрудников(введиите 3 должности)");
        String pos1 = scanner.nextLine();
        String pos2 = scanner.nextLine();
        String pos3 = scanner.nextLine();

        int r = 1990;

        int em1 = r + (int) (Math.random() * 33);
        int m1 = (int) (Math.random() * 12 + 1);
        int d1 = (int) (Math.random() * 31 + 1);
        if (m1 == 2) {
            boolean b1 = d1 != 30;
            boolean p1 = d1 != 31;
        }
        int q1 = 2022 - em1;
        if (q1 > 10) {
            System.out.println("Фамилия:\t" + ln1 + "\n" + "Имя:\t" + nm1 + "\n" + "Отчество:\t" + srn1 + "\n" + "Должность:\t" + pos1);
            int gen1 = (int) (Math.random() * 2 + 1);
            if (gen1 == 1) {
                System.out.println("Пол:\tFemale");
            } else {

                System.out.println("Пол:\tMan");
            }
            System.out.println("Дата приёма на работу:\t" + d1 + " " + m1 + " " + em1);
            System.out.println("Стаж:\t" + q1);
            System.out.println("_____________________________________");//Декор
        }
        int em2 = r + (int) (Math.random() * 33);
        int m2 = (int) (Math.random() * 12 + 1);
        int d2 = (int) (Math.random() * 31 + 1);
        if (m2 == 2) {
            boolean b1 = d2 != 30;
            boolean p1 = d2 != 31;
        }
        int q2 = 2022 - em2;
        if (q2 > 10) {
            System.out.println("Фамилия:\t" + ln2 + "\n" + "Имя:\t" + nm2 + "\n" + "Отчество:\t" + srn2 + "\n" + "Должность:\t" + pos2);
            int gen2 = (int) (Math.random() * 2 + 1);
            if (gen2 == 1) {
                System.out.println("Пол:\tFemale");
            } else {

                System.out.println("Пол:\tMan");
            }
            System.out.println("Дата приёма на работу:\t" + d2 + " " + m2 + " " + em2);
            System.out.println("Стаж:\t" + q2);
            System.out.println("_____________________________________");//Декор
        }
        int em3 = r + (int) (Math.random() * 33);
        int m3 = (int) (Math.random() * 12 + 1);
        int d3 = (int) (Math.random() * 31 + 1);
        if (m3 == 2) {
            boolean b1 = d3 != 30;
            boolean p1 = d3 != 31;
        }
        int q3 = 2022 - em3;
        if (q3 > 10) {
            System.out.println("Фамилия:\t" + ln3 + "\n" + "Имя:\t" + nm3 + "\n" + "Отчество:\t" + srn3 + "\n" + "Должность:\t" + pos3);
            int gen3 = (int) (Math.random() * 2 + 1);
            if (gen3 == 1) {
                System.out.println("Пол:\tFemale");
            } else {

                System.out.println("Пол:\tMan");
            }
            System.out.println("Дата приёма на работу:\t" + d3 + " " + m3 + " " + em3);
            System.out.println("Стаж:\t" + q3);
            System.out.println("_____________________________________");//Декор
        }
        File myFile = new File(" Worker.txt");

        try {
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(myFile)));
            writer.println("Фамилия:\t" + ln1 + "\n" + "Имя:\t" + nm1 + "\n" + "Отчество:\t" + srn1 + "\n" + "Должность:\t" + pos1
                    + "\n" + "Пол:\tFemale" + "\n" + "Дата приёма на работу:\t" + d1 + " " + m1 + " " + em1
                    + "\n" + "Стаж:\t" + q1 + "\n" + "_____________________________________"
                    + "\n" + "Фамилия:\t" + ln2 + "\n" + "Имя:\t" + nm2 + "\n" + "Отчество:\t" + srn2 + "\n" + "Должность:\t" + pos2
                    + "\n" + "Пол:\tMan" + "\n" + "Дата приёма на работу:\t" + d2 + " " + m2 + " " + em2
                    + "\n" + "Стаж:\t" + q2 + "\n" + "_____________________________________"
                    + "\n" + "Фамилия:\t" + ln3 + "\n" + "Имя:\t" + nm3 + "\n" + "Отчество:\t" + srn3 + "\n" + "Должность:\t" + pos3
                    + "\n" + "Пол:\tFemale" + "\n" + "Дата приёма на работу:\t" + d3 + " " + m3 + " " + em3
                    + "\n" + "Стаж:\t" + q3 + "\n" + "_____________________________________");
            writer.flush();
            writer.close();
        } catch (
                IOException ex) {
            ex.printStackTrace();
        }

    }
}
