package com.umittas;

import java.util.Scanner;

/*
    FOR LOOP:
    Write a cashier program that will scan a given
    number of items and tally the cost.

 */
public class Cashier {
    //get number of items to scan
    public static void main(String[] args) {
        System.out.println("Enter the number of items you would like to scan:");
        Scanner input = new Scanner(System.in);
        int quantity = input.nextInt();


        double total = 0.0;

        //Create a loop to iterate through all of the items and accumulate the cost.
        for (int i = 0; i < quantity; i++) {
            System.out.println("Enter the cost of the item:");
            double price = input.nextDouble();

            total = total + price;
        }

        input.close();
        System.out.println("The total is $" + total);
    }
}
