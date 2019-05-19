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
public class BusquedaKAQA {
    
    public int busqueda(int[] v, int valorB){  
      int posicion=0;
      for (int i = 0; i < v.length; i++) {
          if(v[i]==valorB){
              posicion= i;
              break;
          }else{           
          }
      }
      return posicion;
  }
    public int numero(int n){
        
        return n;
    
    }       
    public static void imprimir(String[] args) {
        BusquedaKAQA Arturo=new BusquedaKAQA();
        int[] vector={1,10,9,8,11,7,6,12,2,3,4,5};
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un numero de mes para buscarlo: ");
        int n=leer.nextInt();
        System.out.println(" del vector"+"El numero de mes "+n+" fue encontrado en la posicion "+Arturo.busqueda(vector, n));
    }
    public static void main(String[] args) {
        imprimir(args);
    }
    
}
