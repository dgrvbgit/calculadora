/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Programa Calculadora");
        System.out.println("Ingrese el primer número:");
        double num1 = sc.nextDouble();

        System.out.println("Ingrese el segundo número:");
        double num2 = sc.nextDouble();

        System.out.println("Seleccione la operación a realizar:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        int opcion = sc.nextInt();
        double resultado = 0;

        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            default:
                System.out.println("Opción no válida");
                return; 
        }

        System.out.println("El resultado es: " + resultado);
    }
}

//prueba commit1
