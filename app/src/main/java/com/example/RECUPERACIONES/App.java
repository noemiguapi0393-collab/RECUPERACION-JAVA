// Definicion del paquete del proyecto
package com.example.RECUPERACIONES;
import java.util.Scanner;

// Programa desarrollado por Noemi para la recuperacion de Git y Java
public class App {
    public static void main(String[] args) {
        // Inicio de la ejecucion principal del programa
        Scanner teclado = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println(" ¡Hola Noemi! Iniciando calculadora...  ");
        System.out.println("     TEOREMA DE PITÁGORAS (SISTEMA)      ");
        System.out.println("*****************************************");
        System.out.println("Nota: Use solo numeros mayores a cero.");
        System.out.println(".........................................");
        System.out.println(">>> Leyendo datos del usuario...");
        System.out.print("Por favor, digite el primer Cateto (A): ");
        double catetoA = teclado.nextDouble();
        System.out.print("Por favor, digite el segundo Cateto (B): ");
        double catetoB = teclado.nextDouble();
        System.out.println(">>> Procesando operacion matematica...");
        double hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
        System.out.println("-----------------------------------------");
        System.out.println("=== IMPRIMIENDO RESULTADOS FINALES ===");
        System.out.println("* Hipotenusa obtenida: " + hipotenusa);
        System.out.println("_________________________________________");
        System.out.println("Programa finalizado correctamente."); // <-- TEXTO MODIFICADO
        System.out.println("*****************************************");
        teclado.close();
    }
}
// Fin de la clase App y del archivo fuente