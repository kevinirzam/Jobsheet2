/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BiodataKeluarga;

/**
 *
 * @author WINDOWS 10
 */
public class Kevin {

    public Kevin() {
    }
    
    
    private String namaAyah,namaIbu,namaSendiri,namaSaudara,alamat,Hobi,CitaCita;
    private int umur;
    
    //Nama Bokap
    public void setNamaAyah(String namaBokap){
        namaAyah=namaBokap;
    }
    public String getNamaAyah(){
        return namaAyah;
    }
    
    //Nama Nyokap
    public void setNamaIbu(String namaNyokap){
        namaIbu=namaNyokap;
    }
    public String getNamaIbu(){
        return namaIbu;
    }
    
    //Nama Sendiri
    public void setNamaSendiri(String namaGue){
        namaSendiri=namaGue;
    }
    public String getNamaSendiri(){
        return namaSendiri;
    }
    
    //Nama Saudara
    public void setNamaSaudara(String namaSaudaraGue){
        namaSaudara=namaSaudaraGue;
    }
    public String getNamaSaudara(){
        return namaSaudara;
    }
    
    //Alamat
    public void setAlamat(String namaAlamatGue){
        alamat=namaAlamatGue;
    }
    public String getAlamat(){
        return alamat;
    }
    
    //Hobi
    public void setHobi(String hobiGue){
        Hobi=hobiGue;
    }
    public String getHobi(){
        return Hobi;
    }
    
    //Nama Cita Cita
    public void setCitaCita(String CitaCitaGue){
        CitaCita=CitaCitaGue;
    }
    public String getCitaCita(){
        return CitaCita;
    }
    
    //Nama Umur
    public void setUmur(int umurGue){
        umur=umurGue;
    }
    public int getUmur(){
        return umur;
    }
}
