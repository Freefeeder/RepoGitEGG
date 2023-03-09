/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license

Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
El programa deberá después mostrar el resultado de la suma
 */

package mycompanny.ejercicio1_1;

import java.util.Scanner;

/**
 *
 * @author 54911
 */
public class Ejercicio1_1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Ingresa el primer numero:");
        num1 = leer.nextInt();
        System.out.println("Ingresa el segundo numero:");
        num2 = leer.nextInt();
        
        int suma = num1 + num2;
        double division = num1 / num2;
        boolean comparacion = num1 > num2;
        
        System.out.println(num1 + " + " + num2 + " = " + suma);
        System.out.println(num1 + " / " + num2 + " = " + division);
        System.out.println(num1 + " > " + num2 + " ? " + comparacion);
    }
}
