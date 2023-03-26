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
public class Guia4_EjApr1_Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Crea una aplicación que le pida dos números al usuario y este pueda
//elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
//una función para cada operación matemática y deben devolver sus
//resultados para imprimirlos en el main.
        
         Scanner leer = new Scanner(System.in);
         System.out.println("\nIngresar numeros para operar");
         
         System.out.print("\nIngresar numero 1:   ");
         float num1 = leer.nextFloat(); 
         
         System.out.print("\nIngresar numero 2:   ");
         float num2 = leer.nextFloat(); 
         
         System.out.println("\nElija una opcion del Menu\n"
                    + "\nMENU\n"
                    + "1.Sumar\n"
                    + "2.Restar\n"
                    + "3.Multiplicar\n"
                    + "4.Dividir\n");
                 
            int opc = leer.nextInt();
            while (opc < 1 || opc > 4) {
                System.out.println("La opcion debe ser entre 1 y 5\n"
                        + "Ingresar nuevamente");
                opc = leer.nextInt();
            }
             System.out.println("La opcion elegida es "+opc);    
       switch (opc) {
                case 1:
                    
                    System.out.println("\nLa suma de " + num1 + " + " + num2 + " = " +sum(num1,num2));
                    break;
                case 2:
                    System.out.println("\nLa resta de " + num1 + " - " + num2 + " = " + rest(num1 , num2));
                    break;
                case 3:
                    System.out.println("\nLa multiplicacion de " + num1 + " * " + num2 + " = " + mult(num1 , num2));
                    break;
                case 4:
                    System.out.println("\nLa division de " + num1 + " / " + num2 + " = " + div(num1 , num2));
                    break;
       }
        
    }
    public static float sum(float n1, float n2){
        float s=(n1+n2);
        return s;
    }
    public static float rest(float n1, float n2){
        float r=(n1-n2);
        return r;
    }
    public static float mult(float n1, float n2){
        float m=(n1*n2);
        return m;
    }
    public static float div(float n1, float n2){
        float d=(n1/n2);
        return d;
    }
    
}
