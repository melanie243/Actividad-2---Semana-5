/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg0000001;

import java.util.Scanner;

/**
 *
 * @author melanieserpa
 */
public class Ejercicio0000001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        try {
            int num = leer.nextInt();
            if (num >= 2 && num <= 20){
                for (int x = 1; x <= 10; x++){
                    System.out.println(x + " x " + num + " = " + (x * num));
                }
            }
            else{
                System.out.println("Numero no valido.");
            }
        }
        catch(Exception ex){
            System.out.println("Numero no valido.");
        }
    }
    
}
