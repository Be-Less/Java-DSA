package Patterns;

import java.util.Scanner;

public class StarPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter How Big of a Star you want:");
        int n = sc.nextInt();
        int m = n / 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == m || j == m) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
        sc.close();
    }

}
