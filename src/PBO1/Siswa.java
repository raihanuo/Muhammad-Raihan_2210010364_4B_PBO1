/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO1;

/**
 *
 * @author USER
 */
public class Siswa extends Orang {
    private int nis;
    private String kelas;
    public Siswa(String nama, int umur, int nis, String kelas) {
        super(nama, umur);
        this.nis = nis;
        this.kelas = kelas;
    }
    public int getNIS() {
        return nis;
    }
    public void setNIS(int nis) {
        this.nis = nis;
    }
    public String getKelas() {
        return kelas;
    }
    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("NIS: " + nis + " | Kelas: " + kelas + " | ");
    }
}