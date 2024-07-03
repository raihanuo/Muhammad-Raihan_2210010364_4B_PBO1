/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO1;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Utama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Siswa[] daftarSiswa = new Siswa[30];
        
        int index = 0;
        
        while (true) {
            System.out.println("--------------------------------------------------");
            System.out.println("1. Tambah siswa");
            System.out.println("2. Tampilkan siswa");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi : ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();
            if (pilihan == 1) {
                if (index >= daftarSiswa.length) {
                    System.out.println("Daftar siswa penuh!");
                    break;
                }
                try {
                    System.out.print("Masukkan nama \t: ");
                    String nama = scanner.nextLine();
                    
                    System.out.print("Masukkan umur \t: ");
                    int umur = Integer.parseInt(scanner.nextLine());
                    
                    System.out.print("Masukkan NIS \t: ");
                    int nis = Integer.parseInt(scanner.nextLine());
                    
                    System.out.print("Masukkan kelas \t: ");
                    String kelas = scanner.nextLine();
                    
                    daftarSiswa[index] = new Siswa(nama, umur, nis, kelas);
                    index++;
                    
                    System.out.println("--------------------------------------------------");
                    System.out.println("Siswa berhasil ditambahkan!");
                } catch (NumberFormatException e) {
                    System.out.println("Kesalahan masukkan angka : " + e);
                } catch (Exception e) {
                    System.out.println("Kesalahan : " + e);
                }
            } else if (pilihan == 2) {
                if (daftarSiswa[0] != null) {
                    for (Siswa siswa : daftarSiswa) {
                        if (siswa != null) {
                            System.out.println("--------------------------------------------------");
                            siswa.tampilkanInfo();
                        }
                    }
                } else {
                    System.out.println("--------------------------------------------------");
                    System.out.println("Belum ada siswa yang terdaftar!");
                }
            } else if (pilihan == 3) {
                break;
            } else {
                System.out.println("Pilihan tidak ditemukan!");
            }
        }
        scanner.close();
    }
}