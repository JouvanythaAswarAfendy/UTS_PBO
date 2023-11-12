/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Admin extends Pengguna {
    public Admin(String nama, String alamat) {
        super(nama, alamat);
    }

    public void tambahBuku(List<Buku> bukuList) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan judul buku: ");
        String judul = input.nextLine();
        System.out.print("Masukkan genre buku: ");
        String genre = input.nextLine();
        bukuList.add(new Buku(judul, genre));
        System.out.println("Buku berhasil ditambahkan.");
    }

    public void lihatBuku(List<Buku> bukuList) {
        System.out.println("Daftar buku :");
        for (Buku buku : bukuList) {
            System.out.println(buku.getJudul() + " | " + buku.getGenre());
        }
    }

    public void hapusBuku(List<Buku> bukuList) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan judul buku yang akan dihapus: ");
        String judul = input.nextLine();
        for (Buku buku : bukuList) {
            if (buku.getJudul().equals(judul)) {
                bukuList.remove(buku);
                System.out.println("Buku berhasil dihapus.");
                return;
            }
        }
        System.out.println("Buku tidak ditemukan.");
    }
 }