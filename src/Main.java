/*
Question : Given an array you have to find the given target.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int target,SizeOfArray,start,count = 0;
        System.out.println("Enter the size of given array :");
        SizeOfArray = input.nextInt();
        System.out.println("Enter the target for finding in array :");
        target = input.nextInt();
        System.out.println("Enter the element inside given array :");
        int[] arr = new int[SizeOfArray];
        for (start = 0; start < arr.length; start++){
            arr[start] = input.nextInt();
        }
        System.out.println("Printing the result : ");
        for (start = 0; start < arr.length - 1; start++){
           if (target == arr[start]){
               System.out.println(start);
               count++;
           }
       }
       if (count < 1){
           System.out.println(-1);
       }
    }
}
