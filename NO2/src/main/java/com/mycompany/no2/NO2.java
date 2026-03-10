/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.no2;

import java.util.Scanner;

/**
 *
 * @author Mutiara Nafiza
 */
public class NO2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int computerAmount;
        int peripherals;
        boolean businessHours;
        boolean dropOff;

        double baseFee = 0;
        double additionalFee = 0;

        System.out.print("Jumlah komputer: ");
        computerAmount = input.nextInt();

        System.out.print("Jumlah peripheral: ");
        peripherals = input.nextInt();

        System.out.print("Apakah dalam business hours? (true/false): ");
        businessHours = input.nextBoolean();

        System.out.print("Customer drop off & pick up? (true/false): ");
        dropOff = input.nextBoolean();

        if (computerAmount == 1 || computerAmount == 2) {
            baseFee = 50;
            additionalFee = 0;
        }
        else if (computerAmount >= 3 && computerAmount <= 10) {
            baseFee = 100;
            additionalFee = 10 * peripherals;
        }
        else if (computerAmount > 10) {
            baseFee = 500;
            additionalFee = 10 * peripherals;
        }

        if (!businessHours) {
            baseFee = baseFee * 2;
        }

        double totalBaseFee = baseFee;

        if (dropOff) {
            totalBaseFee = totalBaseFee / 2;
        }

        double total = totalBaseFee + additionalFee;

        System.out.println("Total biaya servis: $" + total);

    }
}
