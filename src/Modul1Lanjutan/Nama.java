/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul1Lanjutan;

/**
 *
 * @author SMK TELKOM
 */
public class Nama {
    public static void main(String[] args) {
        
        int k,l,m,n;
        
        for(k=1;k<=4;k++){
            for(l=1;l<=1;l++){
                System.out.print("@");
            }
            for(m=3;m<=3;m++){
                if(k==m){
                    System.out.print("@");
                }
                else{
                    System.out.print(" ");
                }
            }
            
            for(n=5;n<=5;n++){
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
