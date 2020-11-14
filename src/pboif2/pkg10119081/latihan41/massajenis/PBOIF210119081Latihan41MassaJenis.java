/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119081.latihan41.massajenis;

/**
 *
 * @author Elza Abiezal
 * Nama  : Muhammad Elza Abiezal
 * Kelas : IF-2
 * NIM   : 10119081
 * Deskripsi program : Program ini berisi program untuk menampilkan perhitungan kubus
 */
public class PBOIF210119081Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Kubus kbs = new Kubus();
        
        
        
        System.out.println("=====Massa Jenisn Kubus===== ");
        kbs.setSisi(50);
        System.out.println("Sisi : " + kbs.getSisi());
        kbs.setMassa(250);
        System.out.println("Massa : " + kbs.getMassa());
        System.out.println("=====Hasil Perhitungan");
        System.out.println("volume : " + kbs.hitungVolume(kbs.getSisi()));
        System.out.println("Massa Jenis : " + kbs.hitungMassaJenis(kbs.getMassa(),kbs.hitungVolume(kbs.getSisi())));
    }
    
}
