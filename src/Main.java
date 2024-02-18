import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total <= 2_459_000) {
            total = total + salary;
            total = total + total / 100;
            i = i + 1;
            System.out.println(" Месяц " + i + " сумма накоплений равна " + total + " рублей ");
        }
        System.out.println();
        int a = 0;
        while (a < 10) {
            a = a + 1;
            System.out.print(" " + a);
        }
        System.out.println();
        int start = 11;
        for (; start > 1; ) {
            start = start - 1;
            System.out.print(" " + start);
        }
        System.out.println();
        System.out.println();
        int years = 10;
        int population = 12_000_000;
        int birthRate = population * 17 / 1000;
        int deathRate = population * 8 / 1000;
        for (; i < 10; ++i) {
            population = population + birthRate - deathRate;
            System.out.println(" Год " + (i + 1) + " население " + population);
        }
        System.out.println();
        int deposit = 15000;
        int capital = 12_000_000;
        int monthNumber = 0;
        while (deposit < capital) {
            deposit *= 1.07;
            ++monthNumber;
            System.out.println(" Месяц = " + monthNumber + " , сумма накоплений = " + deposit);
        }
        System.out.println();
        int money = 15000;
        int quantity = 12_000_000;
        int month = 0;
        while (money < quantity) {
            money *= 1.07;
            ++month;
            if (month % 6 == 0) {
                System.out.println(" Месяц = " + month + " , сумма накоплений = " + money);
            }
        }
        System.out.println();
        int startMoney = 15000;
        int monthCount = 9 * 12;
        for (int b = 1; b <= monthCount; b++) {
            startMoney *= 1.07;
            if (b % 6 == 0) {
                System.out.println(" Месяц " + b + " накопления " + startMoney);
            }
        }
        System.out.println();
        for (int friDay = 4; friDay <= 31; friDay = friDay + 7 ) {
            System.out.println(" Сегодня пятница " + friDay + "  число. Необходимо подготовить отчет ");
        }
        System.out.println();
        int currentYear = 2024;
        int startComet = currentYear - 200;
        int finalComet = currentYear + 100;
        for (int b = startComet; b <= finalComet; b ++){
            if (b % 79 == 0)
                System.out.println( " Появление кометы в " + b );
        }

    }
}































            








































