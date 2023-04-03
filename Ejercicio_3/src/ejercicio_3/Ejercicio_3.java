/*Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida 
* por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La función tendrá como
* parámetros, la cantidad de euros y la moneda a convertir que será una cadena, este no devolverá
* ningún valor y mostrará un mensaje indicando el cambio (void).
* El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
    
 */
package ejercicio_3;

import java.util.Scanner;

/**
 *
 * @author Zere
 */
public class Ejercicio_3 {
    
    public static void conversor(double monto, String moneda){
        switch(moneda.toLowerCase()){
            case "libras":
                System.out.println(monto +" convertido a libras es: "+ (monto*0.86));
                break;
            case "dolares":
                System.out.println(monto +" convertido a dolares es: "+ (monto*1.28611));
                break;
            case "yenes":
                System.out.println(monto +" convertido a yenes es: "+ (monto*129.852));
                break;
               
        }
    }
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double monto;
        String moneda;
        
        System.out.println("Ingrese el monto en euros a convertir");
        monto = leer.nextDouble();
        System.out.println("Ingrese la moneda a convertir");
        moneda = leer.next();
        
        conversor(monto, moneda);
        
    }
    
}
