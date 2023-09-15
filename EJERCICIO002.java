/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg002;

import java.util.Scanner;

/**
 *
 * @author melanieserpa
 */
public class EJERCICIO002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scanner = new Scanner(System.in);
        
        int sumaTotal = 0;
        int contador = 0;
        
        System.out.println("Ingresa un número (Si no, ingresa -1 para terminar): ");
        int numero = scanner.nextInt();
        
        while (numero != -1) {
            if (numero >= 0) {
                sumaTotal += numero;
                contador++;
            } else {
                System.out.println("Por favor, ingresa un número entero positivo.");
            }
            
            System.out.println("Ingresa un número (Si no, ingresa -1 para terminar): ");
            numero = scanner.nextInt();
        }
        
        scanner.close();
        
        if (contador > 0) {
            double promedio = (double) sumaTotal / contador;
            System.out.println("La suma total de los " + contador + " números ingresados es " + sumaTotal);
            System.out.printf("El promedio de los %d números ingresados es %.2f%n", contador, promedio);
        } else {
            System.out.println("No se ingresaron números válidos.");
        }
    }
}
