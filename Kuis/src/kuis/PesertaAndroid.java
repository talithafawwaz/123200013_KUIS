/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuis;

import kuispbo.Android;
/**
 *
 * @author HP
 */
public class PesertaAndroid  implements Android{

    String nik, namaPeserta;
    double nilaiTesTulis, nilaiTesCoding, nilaiTesWawancara;
    PesertaAndroid(String nik,String namaPeserta, double nilaiTesTulis, double nilaiTesCoding, double nilaiTesWawancara){
        this.nik = nik;
        this.namaPeserta = namaPeserta;
        this.nilaiTesTulis = nilaiTesTulis;
        this.nilaiTesCoding = nilaiTesCoding;
        this.nilaiTesWawancara = nilaiTesWawancara;
    }
    @Override
    public double nilaiTesTulis() {
        // TODO Auto-generated method stub
        this.nilaiTesTulis = this.nilaiTesTulis * 0.2;
        return this.nilaiTesTulis;
    }
    @Override
    public double nilaiTesCoding() {
        // TODO Auto-generated method stub
        this.nilaiTesCoding = this.nilaiTesCoding * 0.5;
        return this.nilaiTesCoding;
    }
    @Override
    public double nilaiTesWawancara() {
        // TODO Auto-generated method stub
        this.nilaiTesWawancara = this.nilaiTesWawancara * 0.3;
        return this.nilaiTesWawancara;
    }

    public double getHasil(){
        double nilaiAkhir = nilaiTesTulis() + nilaiTesCoding() + nilaiTesWawancara();
        return nilaiAkhir;
    }

    public void setnilaiTesTulis(double nilai){
        nilaiTesTulis = nilai;
    }
    public void setnilaiTesCoding(double nilai){
        nilaiTesCoding = nilai;
    }
    public void setnilaiTesWawancara(double nilai){
        nilaiTesWawancara = nilai;
    }
   
    public String keterangan(){
        String ket;
        if(this.getHasil() < 85){
            ket = "GAGAL";
        }else{
            ket = "LOLOS";
        }
        return ket;
    } 
}