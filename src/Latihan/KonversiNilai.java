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
public class KonversiNilai {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.println("Masukan nilai Web :");
        int nilai = masukan.nextInt();
        if (nilai >= 90 && nilai <= 100)
            System.out.println("Nilai A");
        else if (nilai >= 75 && nilai <= 100)
            System.out.println("Nilai B");
        else if (nilai >= 50 && nilai <= 100)
            System.out.println("Nilai C");
        else if (nilai >= 35 && nilai <= 100)
            System.out.println("Nilai D");
        else if(nilai>100)
            System.out.println("Nilai Tidak boleh melebihi 100!");
        else 
            System.out.println("Nilai E");
    }
}
