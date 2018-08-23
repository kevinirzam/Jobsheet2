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
public class UjiPra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] abc) {
        Pra1 bus = new Pra1();
        bus.Bus(20);
        bus.getPenumpang(17);
        bus.getPenumpang(10); 
       //add
        bus.addPenumpang(5);
        bus.cetakPenumpang();
        bus.getAverage(260);
        
        bus.addPenumpang(7);
        bus.cetakPenumpang();
        bus.getAverage(300);
    }
    
}
