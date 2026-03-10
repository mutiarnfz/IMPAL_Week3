/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.no1;

import java.util.Scanner;

/**
 *
 * @author Mutiara Nafiza
 */
public class NO1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sisi a: ");
        int a = input.nextInt();

        System.out.print("Masukkan sisi b: ");
        int b = input.nextInt();

        System.out.print("Masukkan sisi c: ");
        int c = input.nextInt();

        int max = Math.max(a, Math.max(b, c));

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Tidak ada segitiga dapat dibangun.");
        }
        else if (max >= (a + b + c - max)) {
            System.out.println("Tidak ada segitiga dapat dibangun.");
        }
        else if (a == b && b == c) {
            System.out.println("Segitiga Sama Sisi (Equilateral)");
        }
        else if (a == b || b == c || a == c) {
            System.out.println("Segitiga Sama Kaki (Isosceles)");
        }
        else if (max * max == (a * a + b * b + c * c - max * max)) {
            System.out.println("Segitiga Siku-Siku (Right Triangle)");
        }
        else {
            System.out.println("Segitiga Bebas (Scalene)");
        }
    }
}
