//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        for (int i = 1; i < 11; i++ ) {
            System.out.println("Целые числа " + i);
        }

        System.out.println("Задача 2");

        for (int i = 10; i > 0; i--) {
            System.out.println("Целые числа наоборот " + i);
        }

        System.out.println("Задача 3");

        for (int i = 0; i < 17; i = i + 2) {
            System.out.println("Четные числа " + i);
        }

        System.out.println("Задача 4");

        for (int i = 10; i > -11; i--) {
            System.out.println("От большего числа к меньшему " + i);
        }

        System.out.println("Задача 5");

        for (int i = 1904; i < 2100; i = i + 4) {
            System.out.println( i + " год является високосным");
        }

        System.out.println("Задача 6");

        for (int i = 7; i < 105; i = i + 7) {
            System.out.println("Последовательность чисел " + i);
        }

        System.out.println("Задача 7");

        int number = 1;
        for (int i = 0; i < 10; i++ ) {
            System.out.println("Последовательность чисел " + number);
            number = number * 2;
        }

        System.out.println("Задача 8");

        int save = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + save;
            System.out.println( "Месяц " + i + ", сумма накоплений равна " + total + " рублей" );
        }
        System.out.println("Сумма всего накопленных за 12 месяцев " + total + " рублей");

        System.out.println("Задача 9");

        int save1 = 29000;
        double total1 = 0;
        for (int i = 1; i <= 12; i++) {
            total1 = total1 * 1.01;
            total1 = total1 + save1;
            System.out.println( "Месяц " + i + ", сумма накоплений равна " + total1 + " рублей" );
        }

        System.out.println("Задача 10");

        int two = 2;
        for (int i = 1; i <= 10; i++) {
            int result = two * i;
            System.out.println(two + "*" + i + "=" + result);
        }
    }
}