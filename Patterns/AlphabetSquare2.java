package Patterns;

import java.util.Scanner;

public class AlphabetSquare2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] alphabets = new char[26];

        System.out.println("Enter upto which alphabet you want to print: ");
        char alphabet = sc.next().charAt(0);
        alphabet = Character.toUpperCase(alphabet);
        if (alphabet < 'A' || alphabet > 'Z') {
            System.out.println("Please enter an alphabet between A and Z.");
        } else {
            int num = alphabet - 'A' + 1;
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num; j++) {
                    alphabets[i] = (char) ('A' + i);
                    System.out.print(alphabets[i] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
