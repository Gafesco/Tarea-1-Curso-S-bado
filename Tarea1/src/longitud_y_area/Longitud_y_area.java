
package longitud_y_area;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Longitud_y_area {
    
    public static void main(String[] args) {
        
        Scanner valorR = new Scanner (System.in);
        System.out.println("Ingresar el valor de radio a operar: ");
        int valor_radio = valorR.nextInt();
        
        float pi =  (float) (3.1416);
        float longitud_circunferencia = (float) (2*pi*valor_radio);
        float area_circunferencia = (float) (pi*(valor_radio*valor_radio));
        
        System.out.println("El radio de la circunferencia es: " + valor_radio);
        System.out.println("La longitud de la circunferencia es: " + longitud_circunferencia);
        System.out.println("El area de la circunferencia es: " + area_circunferencia);
        
         
        
        
    }
}
