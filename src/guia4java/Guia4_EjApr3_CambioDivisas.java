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
public class Guia4_EjApr3_CambioDivisas {
//    Crea una aplicación que a través de una función nos convierta una
//cantidad de euros introducida por teclado a otra moneda, estas pueden
//ser a dólares, yenes o libras. La función tendrá como parámetros, la
//cantidad de euros y la moneda a convertir que será una cadena, este no
//devolverá ningún valor y mostrará un mensaje indicando el cambio
//(void).
//El cambio de divisas es:
//i. * 0.86 libras es un 1 €
//ii. * 1.28611 $ es un 1 €
//iii. * 129.852 yenes es un 1 €

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String moneda = "";
        String cambio;
        Scanner leer = new Scanner(System.in);
        System.out.print("\nElija una de moneda para cambiar Euros\n"
                + "1.DOLARES\n"
                + "2.YENES\n"
                + "3.LIBRAS\n\n");

        int opc = leer.nextInt();
        while (opc < 1 || opc > 3) {
            System.out.print("La opcion debe ser entre 1 y 3\n"
                    + "Ingresar nuevamente:  ");
            System.out.println(""
                    + "1.DOLARES\n"
                    + "2.YENES\n"
                    + "3.LIBRAS\n\n");

            opc = leer.nextInt();

            
        }
        switch (opc) {
            case 1:
                moneda = "DOLARES";
                break;
            case 2:
                moneda = "YENES";
                break;
            case 3:
                moneda = "LIBRAS";
                break;

        }
        System.out.print("\nIngrese la cantidad de Euros a cambiar:  ");
            float cantidad = leer.nextFloat();
        System.out.println("\nLa opcion elegida es cambio por " +moneda+"\n");
        
        cambio(moneda, cantidad);
    }
    
    
    
    
    public static void cambio(String mon, float cant) {
        
        switch (mon) {
                case "DOLARES":  
                    System.out.println("\nLos "+cant+" Euros corresponden a " +Math.round((cant*1.28611)*100.0)/100.0 +" U$S \n");                  
                    break;
                case "YENES":
                   System.out.println("\nLos "+cant+" Euros corresponden a " +Math.round((cant*129.852)*100.0)/100.0 +" YENES \n");
                    break;
                case "LIBRAS":
                  System.out.println("\nLos "+cant+" Euros corresponden a "+Math.round((cant*0.86)*100.0)/100.0 +" LIBRAS \n");
                    break;
                
       }
    }   
        
}
