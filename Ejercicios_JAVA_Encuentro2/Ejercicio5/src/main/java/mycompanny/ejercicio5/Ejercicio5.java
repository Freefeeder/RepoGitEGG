/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license

Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble,
el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
 */

package mycompanny.ejercicio5;

import java.util.Scanner;

/**
 *
 * @author 54911
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        double num;
        System.out.println("Ingresa un numero:");
        num = leer.nextDouble();
        
        System.out.println("El doble de " + num + " es: " + Math.pow(num, 2));
        System.out.println("El triple de " + num + " es: " + Math.pow(num, 3));
        System.out.println("La raiz cuadrada de " + num + " es: " + Math.sqrt(num));
    }
}
