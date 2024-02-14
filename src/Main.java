import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(" Висококосный год " + i);
        }

        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        for (int i = 2; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        int saved = 29000;
        int vbanku = 0;
        for (int i = 1; i <= 12; i++) {
            vbanku = vbanku + saved;
            System.out.println(" Месяц " + i + " сумма накоплений равна " + vbanku + " рублей ");}

        int stored = 29000;
        int deposit = 0;
        for (int i = 1; i <=12; i++){
            deposit = deposit + deposit/100;
            deposit = deposit + stored;
            System.out.println(" Месяц " + i + " сумма накоплений равна " + deposit + " рублей ");
        }



        for (int i = 1; i <=10 ; i ++)
            System.out.println("2 * " + i + " = " + 2 * i);


    }
}





























