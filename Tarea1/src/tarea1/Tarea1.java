
package tarea1;

import java.util.Scanner;
public class Tarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner num = new Scanner (System.in);
        System.out.println("Por favor ingrese un numero: ");
        int numero1 = num.nextInt();
        
        System.out.println("Por favor ingrese el segundo numero: ");
        int numero2 = num.nextInt();
        
        System.out.println("Los numeros que usted ingreso fueron: " + numero1 + " Y " + numero2 );
        
        // TODO code application logic here
    }
    
}
