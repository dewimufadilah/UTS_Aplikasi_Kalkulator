/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class ternary_ {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double jarak, totalBiaya, bonus;
        double TARIF_PER_KM = 3500;
        double BONUS_JARAK = 20;
        double PERSENTASE_BONUS = 0.1;

        System.out.print ("Aplikasi Kalkulator menggunakan Ternary\n");
        System.out.print ("=======================================\n");
        System.out.print ("\n");
        System.out.print("Masukkan jarak tempuh (km): ");
        jarak = input.nextDouble();

        totalBiaya = jarak <= BONUS_JARAK
                ? jarak * TARIF_PER_KM
                : (BONUS_JARAK * TARIF_PER_KM) + ((jarak - BONUS_JARAK) * TARIF_PER_KM * (1 + PERSENTASE_BONUS));

        bonus = jarak > BONUS_JARAK ? (jarak - BONUS_JARAK) * TARIF_PER_KM * PERSENTASE_BONUS : 0;

        System.out.println("Bonus: Rp" + bonus);
        System.out.println("Total biaya perjalanan: Rp" + totalBiaya);
    }
}

