/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author WINDOWS 10
 */
public class Pra1 {

    /**
     * @param args the command line arguments
     */
    public double penumpang;
    public double maxPenumpang;
    public double counter;
    public double penumpangBaru;
    
    public void Bus(double maxPenumpang){
        this.maxPenumpang=maxPenumpang;
        penumpang = 0;
    }
    
    public void addPenumpang(double penumpang){
        double simpan = this.penumpang+penumpang;
        if(simpan>maxPenumpang){
            System.out.println("Maaf Kursi Penuh");
        }
        else this.penumpang=simpan;
    }
    
    public void getPenumpang(int password){
        if(password==10){
            System.out.println("Password Benar");
        }
        else System.out.println("Password Salah");
    }
    
    public void getAverage(double beratTotal){
        double beratRata=beratTotal/penumpang;
        System.out.println("Berat Rata-Rata Penumpang Yang Di tambahkan adalah "+beratRata);
    }
    
    public void cetakPenumpang(){
        System.out.println("Jumlah Penumpang Yang Di Tambahkan : "+penumpang);
        System.out.println("Jumlah Penumpang Maksimum :" + maxPenumpang);
    }
}
