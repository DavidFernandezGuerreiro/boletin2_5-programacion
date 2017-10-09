
package boletin2_5;

/**
 *
 * @author dfernandezguerreiro
 */
import java.util.Scanner;
public class Boletin2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float millas, metros=1852;
        Scanner sc=new Scanner (System.in);
        System.out.println(" Agregar millas : "); //Mensaje aparece y muestra el texto
        millas=sc.nextFloat(); //Para poder meter el valor de millas
        System.out.println("distancia metros = "+ (millas*metros)); //Solucion final
    }
    
}
