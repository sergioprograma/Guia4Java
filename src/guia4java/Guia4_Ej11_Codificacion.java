/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia4Java;

import java.util.Scanner;

/**
 *
 * @author usand
 */
public class Guia4_Ej11_Codificacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
//Escribir un programa que procese una secuencia de caracteres ingresada por
//teclado y terminada en punto, y luego codifique la palabra o frase ingresada de
//la siguiente manera: cada vocal se reemplaza por el carácter que se indica en
//la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se
//mantienen sin cambios.
//a e i o u
//@ # $ % *
//Realice un subprograma que reciba una secuencia de caracteres y retorne la
//codificación correspondiente. Utilice la estructura “según” para la
//transformación.
//Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
//La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.  


        Scanner leer = new Scanner(System.in);
        String cat;
        String subprog;
        
        System.out.println("Ingrese una palabra o frase con un punto final. \n");
        String frase = leer.nextLine();
//        String frase="sergito.";
        while (!".".equals(frase.substring(frase.length()-1, frase.length()))) {
          System.out.println("\nDebe llevar punto al final.Ingresar nuevamente\n");
            frase = leer.nextLine();
        }
            for (int i = 0; i < frase.length(); i++) {
            cat= frase.substring(i, i+1);
            subprog = cambiarletra(cat);
            
            System.out.print(cambiarletra(cat));
            }
            System.out.println("\n");
    }
        public static String cambiarletra(String cat){
            switch  (cat){
                case "a": 
                case "A":
                    cat="@";
                    break;
                case "e": 
                case "E":
                    cat="#";
                    break;
                case "i": 
                case "I":
                    cat="$";
                    break;
                case "o": 
                case "O":
                    cat="%";
                    break;
                case "u": 
                case "U":
                    cat="*";
                    break;
                    
            }
            return cat;
            
        }

    
} 