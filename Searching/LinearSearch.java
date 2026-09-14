package Searching;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many numbers you want to give?");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the numbers:");

        for (int i = 0; i < n; i++) {
            System.out.print("Enter [" + i + "] = ");
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter the number you want to find:");
        int target = sc.nextInt();

        int result = linearSearch(nums, target);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at Index: " + result);
        }

        sc.close();
    }

    public static int linearSearch(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == target) {
                return i;
            }
        }

        return -1;
    }
}