/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;

/**
 *
 * @author SMK TELKOM
 */
public class Inputan {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int a, b;
        System.out.println("Masukkan nilai a :");
        a = masukan.nextInt();
        System.out.println("Masukkan nilai b :");
        b = masukan.nextInt();
        System.out.println();
        System.out.println("Nilai variabel yang ada pada program :");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
