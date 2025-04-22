package day2;

// диапазон 2 чисел, найти числа что делятся без остатка на 5, но не на 10;
/*
    Первое число:
    7
    Второе число:
    78
    15 25 35 45 55 65 75
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Первое число:");
        int number1 = scanner.nextInt();

        System.out.println("Второе число:");
        int number2 = scanner.nextInt();

        for(int i = number1; i <= number2; i++) {
            if(i % 5 == 0 && i % 10 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
