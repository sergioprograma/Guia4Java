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
public class Guia4_EjApr4_NumerosPrimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Crea una aplicación que nos pida un número por teclado y con una
//función se lo pasamos por parámetro para que nos indique si es o no un
//número primo, debe devolver true si es primo, sino false.
//Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
//Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo,
//17 si es primo.
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("\nIngrese un numero entero positivo para evaluar si es primo:  ");
        int num = leer.nextInt();
        
        while (num<=0) {
          System.out.println("\nEl numero no puede ser primo. Ingresar de nuevo\n");
            num = leer.nextInt();
        }
        System.out.println("\nLa condicion de que "+num+" sea primo es " +confirmaPrimo(num)+"\n");
        // TODO code application logic here
    }
    public static boolean confirmaPrimo(int nu) {
        boolean primo=false;
        int j=0;
        
        for (int i = nu; i >= 1 ; i--) {             
            if ((nu%i)==0) {
                j++;         
            }            
        }
        if (j==2) {
            primo=true;
        }
        return primo;
    }
}
