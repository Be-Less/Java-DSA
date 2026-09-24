package Patterns;

import java.util.Scanner;

public class StarTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of stars you want in the initial row: ");
        int n = sc.nextInt();

        // Upward Right Angled Traingle
        System.out.println("Upwards");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Downward Right ANgled Triangle
        System.out.println("Downwards");
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Acute Angled Triangle
        System.out.println("Acute Triangle");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");

            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            System.out.println();

        }
        sc.close();
    }
}
