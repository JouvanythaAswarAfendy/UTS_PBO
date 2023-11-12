/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;
import java.util.List;

/**
 *
 * @author HP
 */
public class User extends Pengguna {
    public User(String nama, String alamat) {
        super(nama, alamat);
    }

    public void lihatBuku(List<Buku> bukuList) {
        System.out.println("Daftar buku :");
        for (Buku buku : bukuList) {
            System.out.println(buku.getJudul() + " | " + buku.getGenre());
        }
    }
}