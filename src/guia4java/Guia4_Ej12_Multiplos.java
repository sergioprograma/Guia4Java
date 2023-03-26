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
public class Guia4_Ej12_Multiplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Crea un procedimiento EsMultiplo que reciba los dos números pasados por el
//usuario, validando que el primer número múltiplo del segundo e imprima si el
//primer número es múltiplo del segundo, sino informe que no lo son.

        
        Scanner leer = new Scanner(System.in);
         System.out.println("\nIngresar numeros a validar");
         System.out.print("\nIngresar numero 1:   ");
         float num1 = leer.nextFloat(); 
         
         System.out.print("\nIngresar numero 2:   ");
         float num2 = leer.nextFloat(); 
        // TODO code application logic here
        multi(num1,num2);
    }
    public static void multi(float n1, float n2){
        if (n1%n2==0) 
            System.out.println("\n"+n1+" es multiplo de "+n2+"\n");
            
        else System.out.println("\n"+n1+" no es multiplo de "+n2+"\n");
}
    
}
