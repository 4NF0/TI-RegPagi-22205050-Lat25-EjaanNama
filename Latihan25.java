/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan25;
import java.util.Scanner;
/**
 *
 * @author nm
 */
public class Latihan25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    System.out.print("Masukkan nama depan anda untuk di eja: ");
    String namadepan = scanner.next();

    System.out.println("Ejaan nama \"" + namadepan + "\" adalah: ");
    for (int i = 0; i < namadepan.length(); i++) {
            char huruf = namadepan.charAt(i);
            System.out.println("Huruf ke-" + (i + 1) + " = " + huruf);
        }
    }
    
}
