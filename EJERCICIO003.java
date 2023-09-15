/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg003;

/**
 *
 * @author melanieserpa
 */
public class EJERCICIO003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int i = 0;
        
        do {
            int x = 2 * i - 10;

            if (x < 0) {
                x = (-1) * x;
            }

            int y = 0;

            System.out.println("x = " + x + ", y = " + y);
            
            i++;
        } while (i < 10);
    }
}

