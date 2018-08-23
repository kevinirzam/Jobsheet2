/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

import java.util.Scanner;
/**
 *
 * @author WINDOWS 10
 */
public class UjiPra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner a = new Scanner(System.in);
        System.out.println("Masukkan Jari Jari : ");
        int Jariku=a.nextInt();
        
        Pra2 data = new Pra2();
        data.setJariJari(Jariku);
        data.showDiameter();
        data.showLuasPermukaan();
        data.showVolume();
        
        System.out.print("Memiliki Diameter :"+data.Diameter+
                " || Luas Permukaan : "+data.LPBola+
                " || Volume : "+data.VBola);
    }
    
}
