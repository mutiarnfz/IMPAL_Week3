/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.no1b;

import java.util.Scanner;

/**
 *
 * @author Mutiara Nafiza
 */
public class NO1B {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a, b, c;
        double max;

        System.out.print("Masukkan sisi a: ");
        a = input.nextDouble();

        System.out.print("Masukkan sisi b: ");
        b = input.nextDouble();

        System.out.print("Masukkan sisi c: ");
        c = input.nextDouble();

        max = Math.max(a, Math.max(b, c));

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Tidak ada segitiga dapat dibangun.");
        }
        else if (max >= (a + b + c - max)) {
            System.out.println("Tidak ada segitiga dapat dibangun.");
        }
        else if (Math.abs(a-b) <= 0.01*Math.max(a,b) &&
                 Math.abs(b-c) <= 0.01*Math.max(b,c)) {
            System.out.println("Segitiga Sama Sisi (Equilateral)");
        }
        else if (Math.abs(a-b) <= 0.01*Math.max(a,b) ||
                 Math.abs(b-c) <= 0.01*Math.max(b,c) ||
                 Math.abs(a-c) <= 0.01*Math.max(a,c)) {
            System.out.println("Segitiga Sama Kaki (Isosceles)");
        }
        else if (Math.abs(max*max - (a*a + b*b + c*c - max*max)) 
                <= 0.01*Math.max(max*max, (a*a + b*b + c*c - max*max))) {
            System.out.println("Segitiga Siku-Siku (Right Triangle)");
        }
        else {
            System.out.println("Segitiga Bebas");
        }
    }
}
