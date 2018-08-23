/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

import java.lang.Math;
/**
 *
 * @author WINDOWS 10
 */
public class Pra2 {
    public double jariJari,Diameter,LPBola,VBola;
    public void setJariJari(double jarijari){
        jariJari=jarijari;
    }
    
    public double showDiameter(){
        Diameter=2*jariJari;
        return Diameter;
    } 
    
    public double showLuasPermukaan(){
        LPBola =4*Math.PI*jariJari*jariJari;
        return LPBola;
    }
    public double showVolume(){
        VBola =Math.PI*jariJari*jariJari*jariJari*4/3;
        return VBola;
    }
}
