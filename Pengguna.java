/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author HP
 */
public abstract class Pengguna {
    private String nama;
    private String alamat;

    public Pengguna(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public void login() {
        System.out.println("Anda berhasil login.\n");
    }

    public void logout() {
        System.out.println("Anda berhasil logout.\n");
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }
}