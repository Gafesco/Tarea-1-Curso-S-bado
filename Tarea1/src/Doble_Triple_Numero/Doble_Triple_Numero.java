
package Doble_Triple_Numero;
import java.util.Scanner;


public class Doble_Triple_Numero {
    
      public static void main(String[] args) {
          
          Scanner numero = new Scanner (System.in);
          System.out.println ("Ingrese un numero: ");
          int numer = numero.nextInt();
          
          int total1 = (numer*2);
          int total2 = (numer*3);
          
          System.out.println("El numero ingresado es: "+ numer);
          System.out.println ("El doble de " + numer + " es: " + total1);
          System.out.println ("El triple de " +numer + " es: " + total2);
          

                  
          
          
          
          
      }
    
}
