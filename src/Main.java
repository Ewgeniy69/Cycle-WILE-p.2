public class Main {
    public static void main(String[] args) {
//        int start = 5;
//        while (start > 0) {
//            System.out.print(start);
//            start = start - 1;
//        }
//        System.out.println();
//        // Аналогичный пример, только с циклом FOR
//        for (int i = 5; i > 0; i--) {
//            System.out.print(i);
//        }
//        System.out.println();
//
//        int days = 10;
//        if (days == 0) {
//            System.out.println("Желаем приятной поездки");
//        } else {
//            while (days > 0) {
//                days--;
//                System.out.println("До конца поездки осталось " + days + " дн.");
//            }
//            System.out.println("Путешествие окончено, пора домой");
//        }
//        if (days == 0) {
//            System.out.println("Желаем приятной поездки");
//        } else {
//            for (int i = 10; i > 0; i--) {
//                System.out.println("До конца поездки осталось " + i + " дн.");
//            }
//            System.out.println("Путешествие окончено, пора домой");
//        }
//
//        int salary = 65535;
//        int total = 0;
//        int i = 0;
//        for (; total < 1_000_000; i++) {
//            total = total + total / 100;
//            total = total + salary;
//            if (i % 5 == 0) {
//                System.out.println("Месяц " + i + " Итого " + total);
//            }
//        }
//
//        int i1 = 1;
//        do {
//            System.out.println(i1);
//            i1++;
//        }
//        while (i1 < 7);
        System.out.println("Домашняя работа");
        System.out.println("Задача № 1");

        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total = total + salary;
            i++;
            System.out.println("Месяц - " + i + " сумма накоплений = " + total);
        }
        System.out.println("Задача № 2");

        int point = 1;
        while (point <= 10) {
            System.out.print(point + " ");
            point++;
        }
        System.out.println();
        for (int a = 10; a >= 1; a--) {
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println("Задача № 3");

        int population = 12_000_000;
        int born = 17;
        int die = 8;
        int bonusPopulationForYear = born - die;
        for (int b = 1; b <= 10; b++) {
            int growInYear = population * bonusPopulationForYear / 1000;
            population = population + growInYear;
            System.out.println("Год - " + b + " численность населения составляет - " + population);
        }

        System.out.println("Задача 4-5");
        int sum = 15000;
        int month = 0;
        while (sum < 12_000_000) {
            int percent = sum * 7 / 100;
            sum += percent;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц - " + month + " Накопления - " + sum);
            }
        }

        System.out.println("Задача 6");

        sum = 15000;
        int years = 9;
        int monthsInYear = 12;
        int totalMonths = years * monthsInYear;
        for (int x = 1; x <= totalMonths; x++) {
            int percent = sum * 7 / 100;
            sum += percent;
            if (x % 6 == 0) {
                System.out.println("Каждое полугодие накопления составляют - " + sum + " рублей");
            }
        }

        System.out.println("Задача № 7");
        int firstDay = 5;
        month = 31;
//        for (int r = firstDay; r <= month; r += 7)
        while (firstDay <= month) {
            System.out.println("Сегодня пятница, " + firstDay + "-е число. Необходимо подготовить отчет");
            firstDay += 7;

        }
        System.out.println("Задача № 8");
        int yearNow = 2026;
        int period = 79;
        int startYear = yearNow - 200;
        int finishYear = yearNow + 100;
        for (int t = startYear; t <= finishYear; t++) {
            if (t % period == 0) {
                System.out.println(t);
            }

        }

        System.out.println("Задачи от ИИ 1");
        int summ = 0;
        for (int q = 1; q <= 100; q++) {
            if (q % 2 == 0) {
                summ += q;
            }
        }
        System.out.println(summ);
        System.out.println("Задачи от ИИ 2");

        i = 10;
        while (i >= 1) {
            System.out.print(i + " ");
            i--;
        }

        System.out.println();
        System.out.println("Задачи от ИИ 3");
        int pro = 1;
        int i2 = 1;
        while (i2 <= 7) {
            pro *= i2;
            i2++;
        }
//        for (int i2 = 1; i2 <= 7; i2++) {
//            pro *= i2;
        System.out.println(pro);
        System.out.println("Задачи от ИИ 4");

        int tar = 5;
        for (int i3 = 1; i3 <= 10; i3++) {
            int result = tar * i3;
            System.out.println(tar + " * " + i3 + " = " + result);
        }
        System.out.println("Задачи от ИИ 5");
        int number = 12345;
        sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println(sum);
        System.out.println("Задачи от ИИ 6");
        int x = 101;
        while (x % 7 != 0) {
            x++;
        }
        System.out.println(x);

        System.out.println("Задачи от ИИ 7");
        for (int f = 5; f >= 1; f--) {
            for (int g = 1; g <= f; g++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Задачи от ИИ 8");
        sum = 10000;
        month = 0;
        while (sum < 50000) {
            sum += sum * 5 / 100;
            month++;
            if (month % 3 == 0) {
                System.out.println("Месяц - " + month + ". Накопления - " + sum);
            }

        }
        System.out.println("Для накопления 50000 потребуется " + month + " месяца");

        System.out.println("Задачи от ИИ 9");
        i = 5;
        do {
            System.out.println(i);
            i--;
        } while (i >= 1);

        System.out.println("Задачи от ИИ 10");
        for (int friday = 3; friday <= 31; friday += 7) {
            System.out.println("Сегодня Пятница - " + friday + " число");
        }
    }
}


