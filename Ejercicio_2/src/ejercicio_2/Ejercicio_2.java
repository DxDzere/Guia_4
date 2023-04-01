/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_2;

import java.util.Scanner;

/**
 *
 * @author Zere
 */
public class Ejercicio_2 {

    public static void Persona(String n, int e){
        System.out.println(n + "tiene " + e + " años.");
        
        if (e<18) {
            System.out.println(n + " no es mayor de edad.");
        }else{
            System.out.println(n + " es mayor de edad.");
        }
        
    }
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre, rpta;
        int edad;
        
        do{
            System.out.println("Ingrese el nombre de la persona");
            nombre = leer.next();
            System.out.println("Ingrese la edad de la persona");
            edad = leer.nextInt();
            
            Persona(nombre, edad);
            
            System.out.println("Desea ingresar otra persona?");
            rpta = leer.next();
            
        }while(!rpta.toLowerCase().equals("no"));
        
    }
    
}
