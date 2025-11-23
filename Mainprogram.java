/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */

import java.util.ArrayList;
import java.util.Scanner;

//kelas utama (MainProgram)
public class Mainprogram {
    public static void main (String[] args){
        //variabel lokal untuk input
        try ( //variabel lokal scanner
                Scanner scanner = new Scanner(System.in)) {
            //variabel lokal untuk input
            ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
            
            int pilihan;
            do {
                //menu sederhana
                System.out.println("===== MENU ===== ");
                System.out.println("1. Tambah Data Mahasiswa");
                System.out.println("2. Tampilkan Data Mahasiswa");
                System.out.println("3. Keluar");
                System.out.println("Pilih Menu : ");
                pilihan = scanner.nextInt();
                scanner.nextLine();
                
                switch (pilihan){
                    case 1 -> {
                        //menambah data buku
                        System.out.print("Masukkan Nama: ");
                        String nama = scanner.nextLine();
                        System.out.print("Masukkan NPM: ");
                        String npm = scanner.nextLine();
                        System.out.print("Masukkan jurusan: ");
                        String jurusan = scanner.nextLine();
                        //membuat objek baru dengan kontruktor berparameteer
                        Mahasiswa mahasiswaBaru;
                        mahasiswaBaru = new Mahasiswa(nama, npm, jurusan);
                        //menambah ke list buku
                        daftarMahasiswa.add(mahasiswaBaru);
                        
                        System.out.println("Data Mahasiswa Berhasil ditambahkan");
                    }

                        
                    case 2 -> {
                        //menampilkan semua data buku
                        if (daftarMahasiswa.isEmpty()){
                            System.out.println("Belum ada data mahasiswa");
                        }
                        else{
                            System.out.println("Daftar mahasiswa: ");
                            for (Mahasiswa m : daftarMahasiswa){
                                m. tampilkanData();
                            }
                        }
                    }
                        
                    case 3 -> System.out.println("Keluar dari program");
                        
                    default -> System.out.println("Pilihan tidak valid");
                }
            }while (pilihan != 3);
        }
    }

    private static class Mahasiswa {



        public Mahasiswa() {
        }

        private Mahasiswa(String nama, String npm, String jurusan) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void tampilkanData() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}