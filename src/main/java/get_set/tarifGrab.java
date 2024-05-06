/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package get_set;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class tarifGrab {
    private double jarak;
    private double tarif;
    private double totalBiaya;
    private double TARIF_PER_KM = 3500;
    private double BONUS_JARAK = 20;
    private double PERSENTASE_BONUS = 0.1;

    public void setJarak(double jarak) {
        this.jarak = jarak;
    }

    public double getJarak() {
        return jarak;
    }

    public double getTarif() {
        return tarif;
    }

    public double getTotalBiaya() {
        if (jarak <= BONUS_JARAK) {
            totalBiaya = jarak * TARIF_PER_KM;
        } else {
            totalBiaya = (BONUS_JARAK * TARIF_PER_KM) + ((jarak - BONUS_JARAK) * TARIF_PER_KM * (1 + PERSENTASE_BONUS));
        }
        return totalBiaya;
    }
}
