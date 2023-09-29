public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }

        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        for (int year = 1904; year <= 2096; year++) {
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
                System.out.println(year + "год является високосным");
        }
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i+ " ");
        }
        System.out.println();
        int number = 1;
        for (int i = 0; i < 10; i++) {
            System.out.print(number+ " ");
            number *= 2;
        }
        System.out.println();
        int rub = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + rub;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " руб.");
        }

        int rubles = 29000;
        int totall = 0;
        for (int i = 1; i <= 12; i++) {
            totall = totall + totall / 100;
            totall = totall + rubles;
            System.out.println("Месяц " + i + " сумма накоплений равна " + totall + " руб.");
        }

        int num = 2;
        for (int i = 1; i <= 10; i++) {
            int result = num * i;
            System.out.println(num + "*" + i + "=" + result);
        }
    }
}
