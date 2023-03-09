/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license

Escribir un programa que pida tu nombre, 
lo guarde en una variable y lo muestre por pantalla.
 */

package mycompanny.ejercicio2_1;

import java.util.Scanner;

/**
 *
 * @author 54911
 */
public class Ejercicio2_1 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.println("Ingresa tu nombre:");
        nombre = leer.next();
        
        System.out.println("Hola " + nombre);
    }
}
