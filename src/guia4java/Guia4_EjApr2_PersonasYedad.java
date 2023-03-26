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
public class Guia4_EjApr2_PersonasYedad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        dataPersonas();
        
//        Diseñe una función que pida el nombre y la edad de N personas e
//imprima los datos de las personas ingresadas por teclado e indique si
//son mayores o menores de edad. Después de cada persona, el programa
//debe preguntarle al usuario si quiere seguir mostrando personas y frenar
//cuando el usuario ingrese la palabra “No”.
        // TODO code application logic here
    }
    public static void dataPersonas(){
        Scanner leer = new Scanner(System.in);
        int i=1;
        String op="";
         String per="";
         int edad=0;
         
        do{ 
            
        System.out.print("\nIngresar nombre de la persona N°"+i+": ");
        
        per = leer.nextLine(); 
        
        System.out.print("\nIngresar edad persona "+i+": ");
         edad = leer.nextInt(); 
         
            if (edad>=18) {
                System.out.println("\nLa persona "+i+" de nombre "+per+" es mayor de edad");
                
            }else System.out.println("\nLa persona "+i+" de nombre "+per+" no es mayor de edad");
            
            System.out.print("\nDesea seguir ingresando personas? Por Si por No:  ");    
             op = leer.nextLine(); 
            i++;
             while (!op.equalsIgnoreCase("No")&&!op.equalsIgnoreCase("Si")){
                 System.out.println("\nLa opcion debe ser con Si o No. Ingresar nuevamente\n");
                 op = leer.nextLine(); 
             }
//             if (op.equalsIgnoreCase("no")) 
//                 
//                 break;            
 
             
        } while (!op.equalsIgnoreCase("No"));
         
         
         
    }
    
    
}
