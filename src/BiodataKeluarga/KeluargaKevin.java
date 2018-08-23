/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BiodataKeluarga;
import java.util.Scanner;
/**
 *
 * @author WINDOWS 10
 */
public class KeluargaKevin {
        

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner a=new Scanner(System.in);
        
        System.out.print("Nama Ayah Saya :");
        String Ayah = a.next();
        System.out.print("Nama Ibu Saya :");
        String Ibu = a.next();
        System.out.print("Nama Saya :");
        String Saya = a.next();
        System.out.print("Nama Saudara :");
        String Saudara = a.next();
        System.out.print("Alamat :");
        String Alamat = a.next();
        System.out.print("Hobi :");
        String Hobi = a.next();
        System.out.print("Cita Cita :");
        String Cita = a.next();
        System.out.print("Umur :");
        int Umur = a.nextInt();
        System.out.println("");
        
        System.out.println("======== Hasil Data Diri =========");
        Kevin DataDiri = new Kevin();
        DataDiri.setNamaAyah(Ayah);
        DataDiri.setNamaIbu(Ibu);
        DataDiri.setNamaSendiri(Saya);
        DataDiri.setNamaSaudara(Saudara);
        DataDiri.setAlamat(Alamat);
        DataDiri.setHobi(Hobi);
        DataDiri.setCitaCita(Cita);
        DataDiri.setUmur(Umur);
        
        System.out.println("Nama Ayah Saya :"+DataDiri.getNamaAyah());
        System.out.println("Nama Ibu Saya :"+DataDiri.getNamaIbu());
        System.out.println("Nama Saya :"+DataDiri.getNamaSendiri());
        System.out.println("Nama Saudara :"+DataDiri.getNamaSaudara());
        System.out.println("Alamat :"+DataDiri.getAlamat());
        System.out.println("Hobi :"+DataDiri.getHobi());
        System.out.println("Cita Cita :"+DataDiri.getCitaCita());
        System.out.println("Umur :"+DataDiri.getUmur());
    }
    
}
