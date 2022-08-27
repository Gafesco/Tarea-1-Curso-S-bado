
package grados_f;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class grados_fa {
    
    
        public static void main(String[] args) {
          Scanner grad = new Scanner (System.in) ;
          System.out.println("Ingrese el numero de grados para realizar la conversion: ");
          int grados = grad.nextInt();
          
          int F= (32+ (9*grados/5));
          
          System.out.println(grados + " Centigrados es igual a: " + F + " Fahrenheit");
          
          
            
            
            
        }
}
