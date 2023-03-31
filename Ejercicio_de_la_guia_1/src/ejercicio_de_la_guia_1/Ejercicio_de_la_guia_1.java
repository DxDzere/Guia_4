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
        int cont=0;
        
        do{
            switch(frase.substring(cont, cont+1).toLowerCase()){
                case "a":
                    if(cont==0){
                        fraseCod="@";
                    }else{
                        fraseCod = fraseCod.concat("@");
                    }
                    break;
                case "e":
                    if(cont==0){
                        fraseCod="#";
                    }else{
                        fraseCod = fraseCod.concat("#");
                    }
                    break;
                case "i":
                    if(cont==0){
                        fraseCod="$";
                    }else{
                        fraseCod = fraseCod.concat("$");
                    }
                    break;
                case "o":
                    if(cont==0){
                        fraseCod="%";
                    }else{
                        fraseCod = fraseCod.concat("%");
                    }
                    break;
                case "u":
                    if(cont==0){
                        fraseCod="*";
                    }else{
                        fraseCod = fraseCod.concat("*");
                    }
                    break;
                default:
                    if(cont==0){
                        fraseCod=frase.substring(cont, cont+1);
                    }else{
                        fraseCod = fraseCod.concat(frase.substring(cont, cont+1));
                    }
                    break;
            }
            cont++;
        }while(cont<frase.length());
        
        return fraseCod;
    }
}
