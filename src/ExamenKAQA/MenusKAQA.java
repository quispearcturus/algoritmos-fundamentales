/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenKAQA;

import java.util.Scanner;

/**
 *
 * @author kevin quispe
 */
public class MenusKAQA {
    
public static void main(String[] args) {
        System.out.println("INGRESE LA OPCIÓN DEL ALGORITMO QUE DESEA PROBAR");
       Scanner leer=new Scanner(System.in);
        int opcion =leer.nextInt();
        while (opcion!=0) {            
            switch(opcion){
            case 1: companiaKAQA.plus1(); break;
            case 2: CalculadoraKAQA.plus2();break;
            case 3: OrdenacionKAQA.plus2(); break;
            case 4: BusquedaKAQA.imprimir(args); break;
            
            default: System.out.println("Opción Inválida!!");break;
            }  
            System.out.println("INGRESE LA OPCIÓN DEL ALGORITMO QUE DESEA PROBAR");            
            opcion =leer.nextInt();
        }
}
}

