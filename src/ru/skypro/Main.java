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
        for (y = yearCometStart; y <= yearCometStop; y = y + 79) {
            System.out.println(y + " год.");
        }
    }
}
