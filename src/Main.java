public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }


    public static void task1() {
        System.out.println("Задание №1");
        int target = 2459000;
        int payPerMonth = 15000;
        int deposit = 0;
        while (deposit <= target) {
            deposit = deposit + payPerMonth;
            System.out.println("Сумма накоплений = " + deposit + " вклад №" + deposit / 15000);
        }
        System.out.println("Всего понадобилось " + deposit / 15000 + " вклада");
        System.out.println(target - deposit < 0);
    }

    public static void task2() {
        System.out.println("Задание №2");
        int i = 0;
        while (i < 10) {
            i = (i + 1);
            System.out.print(i);
        }
        System.out.println();
        int m;
        for (m = 10; m >= 1; m = m - 1) {
            System.out.print(m);
        }
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задание №3");
        int year = 1;
        int yFuturePopCount = 12000000;
        int yNatality;
        int yMortality;
        int increase;
        for (year = 1; year <= 10; year = year + 1) {
            yNatality = yFuturePopCount / 1000 * 17;
            yMortality = yFuturePopCount / 1000 * 8;
            increase = (yNatality - yMortality);
            yFuturePopCount += increase;
            System.out.println(+year + " год, численность населения составляет " + yFuturePopCount + " человек.");
        }
    }
    public static void task4() {
        System.out.println("Задание №4");
        int needToSave = 12000000;
        double total = 15000;
        double precent = 1.07;
        for (int month = 1; total <= needToSave; month++) {
            total = (int) (total * precent);
            System.out.println("Сумма накоплений равна " + total + " за " + month + " месяцев");
        }
    }
    public static void task5() {
        System.out.println("Задание №5");
        int month = 0;
        double precent = 1.07;
        int needToSave = 12000000;
        int i = 0;
        double total = 15000;
        for (i = 0; total <= needToSave; i++) {
            total = (int) (total * precent);
            month = month + 1;
            if (month % 6 == 0)
                System.out.println("Сумма накоплений равна " + total + " за " + month + " месяцев");
        }}


    public static void task6() {
        System.out.println("Задание №6");
        int month = 0;
        int deposit = 15000;
        double percent = 1.07;
        int i = 1;
        for (i = 1; i <= 108; i++) {
            deposit = (int) (deposit * percent);
            month = month + 1;
            if (i % 6 == 0)
                System.out.println("за " + month + " месяц, сумма накоплений равна " + deposit + " рублей");
        }
    }

    public static void task7() {
        System.out.println("Задание №7");
        int fDay;
        for (fDay = 1; fDay <=31; fDay = fDay + 7) {
            System.out.println("Сегодня пятница, " + fDay + " -е число. Необходимо подготовить отчет");}}


    public static void task8() {
        System.out.println("Задание №8");
        int year = 0;
        int age = 1823;
        int age2 = 2123;
        for (year = 0; year <= age2; year = year + 79)
            if (year >= age) {
                System.out.println(year);
            }
    }

}