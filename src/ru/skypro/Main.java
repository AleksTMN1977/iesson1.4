package ru.skypro;

public class Main {

    public static void main(String[] args) {

        // Задача1.
        {
            int i = 0;
            while (i < 10) {
                i++;
                System.out.print(i + " ");
            }
            System.out.println();
            for (int n = 10; n > 0; n = n - 1) {
                System.out.print(n + " ");
            }
        }

        //Задача2
        System.out.println();
        for (int f = 2; f < 31; f = f + 7) {
            System.out.println("Сегодня пятница " + f + "-e число. Необходимо подготовить отчет");
        }

        //Задача3
        int y = 0;
        int yearCometStart = 2022 - 200;
        int yearCometStop = 2022 + 100;
        for (y = 0; y <= yearCometStop; y = y + 79) {
            if (y >= yearCometStart) {
                System.out.println(y + " год.");
            }
        }

        //Задача4
        for (int a = 1; a <= 30; a++) {
            if (a % 3 != 0 && a % 5 != 0) {
                System.out.println(a + ":");
            } else if (a % 3 == 0 && a % 5 == 0) {
                System.out.println(a + ": ping pong");
            } else if (a % 3 == 0) {
                System.out.println(a + ": ping");
            } else if (a % 5 == 0) {
                System.out.println(a + ": pong");
            }
        }

        //Задача 5
        int any = 1;
        int x = 0;
        int z = 1;
        for (; any <= 5; x = x + z, z = x + z, any++) {
            System.out.print(" " + x + " " + z);
        }
    }
}