/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license

Dada una cantidad de grados centígrados se debe 
mostrar su equivalente en grados Fahrenheit. 
La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */

package mycompanny.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author 54911
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        double C;
        System.out.println("Ingresa los grados C°");
        C = leer.nextInt();
        double F;
        F = 32 + (9 * C / 5);
        System.out.println("Los grados C°" + C + " son " + F + " Farenheit");
        
    }
}
