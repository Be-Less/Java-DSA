package Patterns;

import java.util.Scanner;

public class StarRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter How many rows of * you want: ");
        int rows = sc.nextInt();
        System.out.println("Enter How many colums of * you want: ");
        int columns = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}