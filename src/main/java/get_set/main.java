/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package get_set;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        tarifGrab biayagrab = new tarifGrab();
        
        System.out.print ("Aplikasi Kalkulator menggunakan Get-set\n");
        System.out.print ("=======================================\n");
        System.out.print ("\n");
        System.out.print("Masukkan jarak tempuh (km): ");
        biayagrab.setJarak(input.nextDouble());

        System.out.println("Total biaya perjalanan: Rp" + biayagrab.getTotalBiaya());
}
}
