/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Enoc Mena
 */

package com.ex22;
import java.util.Scanner;

public class Ex22 {

    public static void main(String[] args) {

        int num1, num2, num3;

        //Asks user for numbers to compare
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = scan1.nextInt();

        Scanner scan2 = new Scanner(System.in);
        System.out.print("Enter second number: ");
        num2 = scan2.nextInt();

        Scanner scan3 = new Scanner(System.in);
        System.out.print("Enter third number: ");
        num3 = scan3.nextInt();

        //Checks to see if all numbers all the same and exits
        if(num1 == num2 && num1 == num3) {

            System.exit(0);

        }

        //Checks if first number is greater than second && third
        if(num1 > num2 && num1 > num3) {

            System.out.print(num1 + " is the biggest number.");

        }

        //Checks if second number is greater than the third
        else if(num2 > num3) {

            System.out.print(num2 + " is the biggest number.");

        }

        //If other statements fail then the third number is the biggest
        else {

            System.out.print(num3 + " is the biggest number.");

        }

    }

}
