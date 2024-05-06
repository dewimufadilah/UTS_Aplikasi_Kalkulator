/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class if_else_ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double jarak, tarif, totalBiaya;
        double TARIF_PER_KM = 3500;
        double BONUS_JARAK = 20;
        double PERSENTASE_BONUS = 0.1;
        
        System.out.print ("Aplikasi Kalkulator menggunakan If-Else\n");
        System.out.print ("=======================================\n");
        System.out.print ("\n");
        System.out.print("Masukkan jarak tempuh (km): ");
        jarak = input.nextDouble();

        if (jarak <= BONUS_JARAK) {
            totalBiaya = jarak * TARIF_PER_KM;
        } else if (jarak > BONUS_JARAK) {
            totalBiaya = (BONUS_JARAK * TARIF_PER_KM) + ((jarak - BONUS_JARAK) * TARIF_PER_KM * (1 + PERSENTASE_BONUS));
        } else {
            System.out.println("Input tidak valid!");
            return;
        }

        System.out.println("Total biaya perjalanan: Rp" + totalBiaya);
    }
}
