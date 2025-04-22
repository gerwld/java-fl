package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int floors_total = scanner.nextInt();
        if (floors_total < 0) {
            System.out.println("Введено неправильное значение");
        } else if (floors_total > 8) {
            System.out.println("Высокоэтажка");
        } else if (floors_total > 4) {
            System.out.println("Cреднеэтажка");
        } else {
            System.out.println("Малоэтажка");
        }
    }
}
