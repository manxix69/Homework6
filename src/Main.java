public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("Task 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println("Task 3");
//        0 не является четным числом - на 0 делить нельзя поэтому вывожу только четные как указано в задании
        for (int i = 0 + 2; i <= 17; i += 2) {
            System.out.println(i);
        }

        System.out.println("Task 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println("Task 5");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }

        System.out.println("Task 6");
        for (int i = 7; i < 100; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Task 7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Task 8");
        int monthlySavings = 29000;
        int totalSavings = 0;
        for (int i = 1; i <= 12; i++) {
            totalSavings = totalSavings + monthlySavings;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalSavings + " рублей");
        }

        System.out.println("Task 9");
        monthlySavings = 29000;
        totalSavings = 0;
        for (int i = 1; i <= 12; i++) {
            totalSavings = totalSavings + totalSavings / 100;
            totalSavings = totalSavings + monthlySavings;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalSavings + " рублей");
        }

        System.out.println("Task 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + (i * 2));
        }

    }
}