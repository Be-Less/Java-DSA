package Patterns;

import java.util.Scanner;

public class NumberSquare2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter upto which number you want the numbers to be: ");
        int num = sc.nextInt();
        int j = 0;
        for (int i = 0; i < num; i++) {
            for (j = 0; j < num; j++) {
                System.out.print((i + 1) + " ");
            }

            System.out.println();
        }
        sc.close();
    }
}
