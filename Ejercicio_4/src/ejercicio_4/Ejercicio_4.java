/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_4;

import java.util.Scanner;

/**
 *
 * @author Zere
 */
public class Ejercicio_4 {

    public static boolean esPrimo(int n){
        int cont=0;
        for (int i = 1; i <= n; i++){
            if(n%i == 0){
                cont++;
            }
        }
        return cont==2;
    }
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        
        System.out.println("Ingrese un numero");
        num = leer.nextInt();
        
        if (esPrimo(num)){
            System.out.println("El numero ingresado es un numero primo");
        }else{
            System.out.println("El numero ingresado no es un numero primo");
        }
    }
    
}
