package day2;

// диапазон 2 чисел, найти числа что делятся без остатка на 5, но не на 10;
// но на while
/*

    Первое число:
    7
    Второе число:
    78
    15 25 35 45 55 65 75
 */

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();


        int i = a;
        while(i <= b) {
            if(i % 5 == 0 && i % 10 != 0) {
                System.out.print(i+" ");
            }
            i++;
        }
    }
}
