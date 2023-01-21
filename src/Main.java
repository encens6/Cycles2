public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int start = 5;
        do {
            System.out.println(start);
            start = start - 1;
        }
        while (start >= 0);

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
        System.out.println("Task 1:");

        int targetEconomi = 2459000;
        int economiPerMonth = 15000;
        int currentEconomi = 0;
        int month = 0;

        while (currentEconomi < targetEconomi) {
            month++;
            currentEconomi += economiPerMonth;
            System.out.println("Month " + month + ", the economi amount is " + currentEconomi + " roubles");
        }

        System.out.println("It takes " + month + " months to accumulate " + targetEconomi + " roubles.");

    }

    public static void task2() {
        System.out.println("Task 2:");

        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }

    }

    public static void task3() {
        System.out.println("Task 3:");

        int population = 12000000;
        int birthRate = 17;
        int deathRate = 8;
        int year;

        for (year = 1; year <= 10; year++) {
            int births = (population * birthRate) / 1000;
            int deaths = (population * deathRate) / 1000;
            population += births - deaths;
            System.out.println("Year " + year + ", the amount of population is " + population);
        }

    }

    public static void task4() {
        System.out.println("Task 4:");

        double targetSavings = 12000000.0;
        double savingsPerMonth = 15000.0;
        double interestRate = 0.07;
        int month = 0;

        while (savingsPerMonth < targetSavings) {
            month++;
            savingsPerMonth += savingsPerMonth * interestRate;
            System.out.println("Month " + month + ", the savings amount is " + savingsPerMonth + " roubles");
        }
        System.out.println("It takes " + month + " months to save " + targetSavings + " roubles.");

    }

    public static void task5() {
        System.out.println("Task 5:");

        double targetSavings = 12000000.0;
        double savingsPerMonth = 15000.0;
        double interestRate = 0.07;
        int month = 0;

        while (savingsPerMonth < targetSavings) {
            month++;
            savingsPerMonth += savingsPerMonth * interestRate;
            if(month % 6 == 0){
                System.out.println("After " + month + " months, the savings amount is " + savingsPerMonth + " roubles");
            }
        }
        System.out.println("It takes " + month + " months to save " + targetSavings + " roubles.");

    }

    public static void task6() {
        System.out.println("Task 6:");
        double savingsPerMonth = 15000.0;
        double interestRate = 0.07;
        int years = 9;

        for (int year = 1; year <= years; year++) {
            for (int i = 0; i < 12; i++) {
                savingsPerMonth += savingsPerMonth * interestRate;
                if ((i + 1) % 6 == 0) {
                    System.out.println("After " + (year * 12 + i + 1) + " months, the savings amount is " + savingsPerMonth + " roubles.");
                }
            }
        }

    }

    public static void task7() {
        System.out.println("Task 7:");

        int daysInMonth = 31;
        int firstFriday = 0;
        int dayOfWeek = 5;

        for(int i = 0; i < daysInMonth; i++){
            if(dayOfWeek == 5 && firstFriday == 0) firstFriday = i + 1;
            if(i+1 == firstFriday || (i+1 > firstFriday && (i+1 - firstFriday) % 7 == 0)) {
                System.out.println("Today is Friday, " + (i+1) + "th day. We must prepare a report.");
            }
            dayOfWeek = (dayOfWeek + 1) % 7;
        }


    }

    public static void task8() {
        System.out.println("Task 8:");

        int currentYear = 2023;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;

        for(int i = startYear; i <= endYear; i++) {
            if(i % 79 == 0) {
                System.out.println(i);
            }
        }

    }
}