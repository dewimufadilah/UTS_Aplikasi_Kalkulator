/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class do_while_ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double jarak, tarif, totalBiaya;
        final double TARIF_PER_KM = 3500.0;
        final double BONUS_JARAK = 20.0;
        final double PERSENTASE_BONUS = 0.1;
        boolean isValid = false;

        do {
            System.out.print ("Aplikasi Kalkulator menggunakan Do While\n");
            System.out.print ("=======================================\n");
            System.out.print ("\n");
            System.out.print("Masukkan jarak tempuh (km): ");
            jarak = input.nextDouble();

            if (jarak > 0) {
                isValid = true;
                if (jarak <= BONUS_JARAK) {
                    totalBiaya = jarak * TARIF_PER_KM;
                } else {
                    totalBiaya = (BONUS_JARAK * TARIF_PER_KM) + ((jarak - BONUS_JARAK) * TARIF_PER_KM * (1 + PERSENTASE_BONUS));
                }
                System.out.println("Total biaya perjalanan: Rp" + totalBiaya);
            } else {
                System.out.println("Input tidak valid! Silakan masukkan jarak yang benar.");
            }
        } while (!isValid);
    }
}

