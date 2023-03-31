/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_de_la_guia_1;

import java.util.Scanner;

/**
 *
 * @author Zere
 */
public class Ejercicio_de_la_guia_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String salida;
        
        System.out.println("Ingrese una frase a codificar");
        
        salida = Codificador(leer.nextLine());
        
        System.out.println(salida);
        
        
    }
    
    public static String Codificador(String frase){
        String fraseCod = "";
        
        for (int i = 0; i < frase.length(); i++) {
            switch(frase.substring(i, i+1).toLowerCase()){
                case "a":
                    if(i==0){
                        fraseCod="@";
                    }else{
                        fraseCod.concat("@");
                    }
                    break;
                case "e":
                    if(i==0){
                        fraseCod="#";
                    }else{
                        fraseCod.concat("#");
                    }
                    break;
                case "i":
                    if(i==0){
                        fraseCod="$";
                    }else{
                        fraseCod.concat("$");
                    }
                    break;
                case "o":
                    if(i==0){
                        fraseCod="%";
                    }else{
                        fraseCod.concat("%");
                    }
                    break;
                case "u":
                    if(i==0){
                        fraseCod="*";
                    }else{
                        fraseCod.concat("*");
                    }
                    break;
                default:
                    if(i==0){
                        fraseCod=frase.substring(i, i+1);
                    }else{
                        fraseCod.concat(frase.substring(i, i+1));
                    }
                    break;
            }
        }
        
        return fraseCod;
    }
}
