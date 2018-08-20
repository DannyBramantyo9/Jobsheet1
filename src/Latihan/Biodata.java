/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author SMK TELKOM
 */
public class Biodata {
    public static void main(String[] args) throws IOException{
        Scanner masukan = new Scanner(System.in);
        String nama,tl,ttl,jeniskel,alamat,moto;
        int NIS;
        System.out.println("Masukkan Data Diri Anda");
        System.out.println("Masukkan Nama Anda :");
        nama = masukan.nextLine();
        System.out.println("Masukkan Nis Anda :");
        NIS = masukan.nextInt();
        System.out.println("Masukkan Tempat lahir Anda :");
        tl = masukan.next();
        System.out.println("Masukkan Tanggal lahir Anda :");
        ttl = masukan.next();
        System.out.println("Masukkan Jenis Kelamin Anda :");
        jeniskel = masukan.next();
        System.out.println("Masukkan Alamat Anda :");
        alamat = masukan.next();
        System.out.println("Masukkan Moto Anda :");
        moto = masukan.next();
        System.out.println("===========================");
        System.out.println("Nama :"+nama);
        System.out.println("NIS :"+NIS);
        System.out.println("Tanggal Lahir :"+ttl);
        System.out.println("Tempat LAhir :"+tl);
        System.out.println("Jenis Kelamin :"+jeniskel);
        System.out.println("Alamat : "+alamat);
        System.out.println("Moto : "+moto);
    }
 
}
