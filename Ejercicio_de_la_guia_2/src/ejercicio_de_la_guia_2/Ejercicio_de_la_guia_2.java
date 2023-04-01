/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_de_la_guia_2;

import java.util.Scanner;

/**
 *
 * @author Zere
 */
public class Ejercicio_de_la_guia_2 {
    public static void esMultiplo(int n1, int n2){
        if(n1%n2 == 0){
            System.out.println("el numero "+n1+" es multiplo de "+n2);
        }else{
            System.out.println("el numero "+n1+" no es multiplo de "+n2);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        
        System.out.println("Ingrese 2 numeros");
        System.out.print("Numero 1: ");
        num1 = leer.nextInt();
        System.out.print("Numero 2: ");
        num2 = leer.nextInt();
        
        esMultiplo(num1,num2);
    }
    
}
