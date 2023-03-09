/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license

Escribir un programa que pida una frase y la muestre 
toda en mayúsculas y después toda en minúsculas. 
 */

package mycompanny.ejercicio3_1;

import java.util.Scanner;

/**
 *
 * @author 54911
 */
public class Ejercicio3_1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingresa tu frase:");
        frase = leer.nextLine();
        
        System.out.println(frase.toUpperCase());
    }

    private static boolean toUpperCase(String frase) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
