/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuis;

import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args){
        // TODO code application logic here
        Scanner input =  new Scanner(System.in);
        System.out.println("FORM PENDAFTARAN PT. UDIN");
        System.out.println("1. Android Development");
        System.out.println("2. Web Development");
        System.out.print("Pilih Jenis Menu Form : ");
        int pilmenu = Integer.parseInt(input.nextLine());
        String nik, nama;
        String ket;
        double[] nilai = new double[4];
        int menu_utama;
        switch (pilmenu) {
            case 1:
                System.out.println("+++ Form Pendaftaran +++ ");
                System.out.print(" Input NIK : ");
                nik = input.nextLine();
                System.out.print(" Input Nama : ");
                nama = input.nextLine();
                
                System.out.print(" Input Nilai Tes Tulis : ");
                nilai[0] = input.nextDouble();
                System.out.print(" Input Nilai Tes Coding : ");
                nilai[1] = input.nextDouble();
                System.out.print(" Input Nilai Wawancara : ");
                nilai[2] = input.nextDouble();
                PesertaAndroid PesertaAndroid = new PesertaAndroid(nik, nama, nilai[0], nilai[1], nilai[2]);
                do{
                    System.out.println(" Menu ");
                    System.out.println(" 1. Edit");
                    System.out.println(" 2. Tampil");
                    System.out.println(" 3. Exit");
                    System.out.print(" Pilih : ");
                    menu_utama  = input.nextInt();
                    switch(menu_utama) {
                        case 1:
                            System.out.println(" FORM EDIT ");
                            System.out.print(" Input Nilai Tes Tulis : ");
                            nilai[0] = input.nextDouble();
                            PesertaAndroid.setnilaiTesTulis(nilai[0]);
                            System.out.print(" Input Nilai Tes Coding : ");
                            nilai[1] = input.nextDouble();
                            PesertaAndroid.setnilaiTesCoding(nilai[1]);
                            System.out.print(" Input Nilai Tes Wawancara : ");
                            nilai[2] = input.nextDouble();
                            PesertaAndroid.setnilaiTesWawancara(nilai[2]);
                            break;
                            
                        case 2: 
                            double hasil = PesertaAndroid.getHasil();
                            System.out.println(" Nilai Akhir    : " + hasil);
                            if(hasil < 85){
                                ket = "GAGAL";
                            }else{
                                ket = "LOLOS";
                            }
                            
                            System.out.println(" KETERANGAN     : " + ket ); 
                            if(hasil < 85){
                                System.out.println(" Mohon maaf untuk nik "+ PesertaAndroid.nik + " atas nama " + PesertaAndroid.namaPeserta + " telah ditolak sebagai Android");
                            }else {
                                System.out.println(" Selamat untuk nik "+ PesertaAndroid.nik + " atas nama " + PesertaAndroid.namaPeserta + " diterima sebagai Android");
                            }
                            break;
                           
                        case 3: 
                            System.exit(0);
                            break;
                        default: System.out.println("Opsi tidak ada, Mohon masukkan opsi yang benar");
                            break;
                        }
                }while(menu_utama != 3);
                break;
            case 2: 
                System.out.println("+++ Form Pendaftaran +++ ");
                System.out.print(" Input NIK : ");
                nik = input.nextLine();
                System.out.print(" Input Nama : ");
                nama = input.nextLine();
               
                System.out.print(" Input Nilai Tes Tulis : ");
                nilai[0] = input.nextDouble();
                System.out.print(" Input Nilai Tes Coding : ");
                nilai[1] = input.nextDouble();
                System.out.print(" Input Nilai Tes Wawancara : ");
                nilai[2] = input.nextDouble();
                PesertaWeb PesertaWeb = new PesertaWeb(nik, nama, nilai[0], nilai[1], nilai[2]);
                do{
                    System.out.println(" Menu ");
                    System.out.println(" 1. Edit");
                    System.out.println(" 2. Tampil");
                    System.out.println(" 3. Exit");
                    System.out.print(" Pilih : ");
                    menu_utama  = input.nextInt();
                    switch (menu_utama) {
                        case 1:
                            System.out.println(" FORM EDIT ");
                            System.out.print(" Input Nilai Tes Tulis : ");
                            nilai[0] = input.nextDouble();
                            PesertaWeb.setnilaiTesTulis(nilai[0]);
                            System.out.print(" Input Nilai Tes Coding : ");
                            nilai[1] = input.nextDouble();
                            PesertaWeb.setnilaiTesCoding(nilai[1]);
                            System.out.print(" Input Nilai Tes Wawancara : ");
                            nilai[2] = input.nextDouble();
                            PesertaWeb.setnilaiTesWawancara(nilai[2]);
                            break;
                            
                        case 2: 
                            double hasil = PesertaWeb.getHasil();
                            System.out.println(" Nilai Akhir    : " + hasil);
                            if(hasil < 85){
                                ket = "GAGAL";
                            }else{
                                ket = "LOLOS";
                            }
                            
                            System.out.println(" KETERANGAN     : " + ket );
                            if(hasil < 85){
                                System.out.println(" Mohon maaf untuk nik "+ PesertaWeb.nik + " atas nama " + PesertaWeb.namaPeserta + " telah ditolak sebagai Web");
                            }else {
                                System.out.println(" Selamat untuk nik "+ PesertaWeb.nik + " atas nama " + PesertaWeb.namaPeserta + " diterima sebagai Web");
                            }
                            break;
                            
                        case 3: 
                            System.exit(0);
                            break;
                        default: System.out.println(" Opsi tidak ada, Mohon masukkan opsi yang benar");
                            break;
                    }
                   
                }while(menu_utama != 3);
               
                break;
            default: System.out.println(" Opsi tidak ada, Mohon masukkan opsi dengan benar");
                break;
        }
        input.close();
    }
}