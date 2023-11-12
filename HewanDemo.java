/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class HewanDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String jenisHewan;

        System.out.print("Masukkan jenis hewan (Kucing/Anjing): ");
        jenisHewan = input.nextLine();

        Hewan hewan;
        if (jenisHewan.equalsIgnoreCase("Kucing")) {
            hewan = new Kucing();
        } else {
            hewan = new Anjing();
        }

        hewan.bersuara();

        if (hewan instanceof Hewan) {
            System.out.println("Hewan ini adalah mamalia.");
        } else {
            System.out.println("Hewan ini bukan mamalia.");
        }
    }
    
}
