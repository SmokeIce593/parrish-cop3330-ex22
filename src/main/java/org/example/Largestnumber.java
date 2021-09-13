/*
 *  UCF COP3330 Fall 2021 Assignment 22 Solution
 *  Copyright 2021 Cameron Parrish
 */

package org.example;
import java.util.Scanner;


public class Largestnumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int first = input.nextInt();

        System.out.print("Enter the second number: ");
        int second = input.nextInt();

        System.out.print("Enter the third number: ");
        int third = input.nextInt();

        // If none of the numbers equal eachother
        if (first != second && second != third && first != third){
            if (first > second && first > third){
                System.out.printf("The largest number is %d.", first);
            }

            else if (second > first && second > third){
                System.out.printf("The largest number is %d.", second);
            }

            else{
                System.out.printf("The largest number is %d.", third);
            }
        }

    }
}
