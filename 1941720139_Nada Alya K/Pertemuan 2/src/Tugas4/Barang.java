/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4;

/**
 *
 * @author Nada Alya
 */
public class Barang {
    public int hargaDasar;
    public float diskon;
    public String kode, namaBarang;
    
    public void tampilData(){
        System.out.println("Kode : " + kode);
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga Dasar : " + "Rp. " + hargaDasar);
        System.out.println("Diskon : " + diskon + "%");
        System.out.println("Harga Jual : " + "Rp. "+ hitungHargaJual());
    }
    public int hitungHargaJual(){
        int hargaJual = hargaDasar - (int) ((diskon / 100) * hargaDasar);
        return hargaJual;
    }
}
