package Patterns;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Upto which number you want the square to be: ");
        int i = sc.nextInt();
        int j, k;
        for (j = 0; j < i; j++) {

            for (k = i; k > j; k--) {
                System.out.print(k + " ");

            }

            System.out.println();
        }
        sc.close();
    }
}
