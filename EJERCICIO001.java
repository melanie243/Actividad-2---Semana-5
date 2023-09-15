/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg001;

import java.util.Scanner;

/**
 *
 * @author melanieserpa
 */
public class EJERCICIO001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        int num = leer.nextInt();
        for(int x = 1; x <= 10; x++){
    		System.out.println(x + " x " + num + " = " + (x * num));
        }
    }
    
}
