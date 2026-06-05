package com.example.RECUPERACIONES;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println(" ¡Hola Noemi! Iniciando calculadora...  ");
        System.out.println("     CÁLCULO DE LA HIPOTENUSA            ");
        System.out.println("*****************************************");
        System.out.println("-----------------------------------------");
        System.out.print("Por favor, digite el primer Cateto (A): ");
        double catetoA = teclado.nextDouble();
        System.out.print("Por favor, digite el segundo Cateto (B): ");
        double catetoB = teclado.nextDouble();
        double hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
        System.out.println("-----------------------------------------");
        System.out.println("=== IMPRIMIENDO RESULTADOS FINALES ==="); // <-- TEXTO CAMBIADO
        System.out.println("-> El valor de la Hipotenusa es: " + hipotenusa);
        System.out.println("=========================================");
        System.out.println("Cálculo terminado con éxito. ¡Adiós!");
        teclado.close();
    }
}