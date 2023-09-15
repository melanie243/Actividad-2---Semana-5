/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg001;

import java.util.Scanner;

public class EJERCICIO001 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        int num = leer.nextInt();
        
        if (num > 20) {
            System.out.println("El numero que ingreso es invalido");
        } else {
            for (int x = 1; x <= 10; x++) {
                System.out.println(x + " x " + num + " = " + (x * num));
            }
        }
    }
}
