/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class BukuDemo {
    public static void main(String[] args) {
        List<Buku> bukuList = new ArrayList<>();
        bukuList.add(new Buku("Harry Potter and the Philosopher's Stone", "Fantasy"));
        bukuList.add(new Buku("Dilan", "Romance"));
        bukuList.add(new Buku("The Great Gatsby", "Classic"));

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jenis pengguna (User/Admin)  : ");
        String jenisPengguna = input.nextLine();

        Pengguna pengguna;
        if (jenisPengguna.equalsIgnoreCase("User")) {
            System.out.print("Masukkan Nama     : ");
            String nama = input.nextLine();
            System.out.print("Masukkan Alamat   : ");
            String alamat = input.nextLine();
            pengguna = new User(nama, alamat);
        } else {
            System.out.print("Masukkan Nama     : ");
            String nama = input.nextLine();
            System.out.print("Masukkan Alamat   : ");
            String alamat = input.nextLine();
            pengguna = new Admin(nama, alamat);
        }

        pengguna.login();
        if (pengguna instanceof User user) {
            user.lihatBuku(bukuList);
        } else {
            Admin admin = (Admin) pengguna;
            admin.lihatBuku(bukuList);
            System.out.print("Apakah Anda ingin menambahkan atau menghapus buku? (Tambah/Hapus/Tidak): ");
            String pilihan = input.nextLine();
            if (pilihan.equalsIgnoreCase("Tambah")) {
                admin.tambahBuku(bukuList);
                admin.lihatBuku(bukuList);
            } else if (pilihan.equalsIgnoreCase("Hapus")) {
                admin.hapusBuku(bukuList);
                admin.lihatBuku(bukuList);
            }
        }
        System.out.print("\nKetik N untuk Logout  : ");
        String pilihan = input.nextLine();
        pengguna.logout();
    }
}