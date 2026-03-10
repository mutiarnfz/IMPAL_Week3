/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.no3;

import java.util.Scanner;

/**
 *
 * @author Mutiara Nafiza
 */
public class NO3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String accountNumber;
        double amount;

        System.out.print("Masukkan account number: ");
        accountNumber = input.nextLine();

        System.out.print("Masukkan amount of sale: ");
        amount = input.nextDouble();
        if ((accountNumber.equals("1001") || accountNumber.equals("1003"))) {
            System.out.println("Invoice Produced");
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Amount of Sale: $" + amount);
        } else if (accountNumber.equals("1002")) {
            System.out.println("Error: Account tidak valid.");
        } else {
            System.out.println("Error: Account tidak ditemukan.");
        }
    }
}
