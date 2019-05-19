/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenKAQA.tarea;

/**
 *
 * @author kevin quispe
 */
public class OrdenacionRecursivo2KAQA {
        public void ordenamiento(int[]vector,int izq, int der){
		

		  int pivote=vector[izq]; 
		  int i=izq; 
		  int j=der; 
		  int aux;

		  while(i<j){                                
			  if(vector[i]<=pivote && i<j){
				  i++;                               
			  }
			  if(vector[j]>pivote){
				  j--;                              
			  }
		    
			  if (i<j) {                                                 
		         aux= vector[i];                  
		         vector[i]=vector[j];
		         vector[j]=aux;
		     }
		   }
		  
		   vector[izq]=vector[j]; 
		   vector[j]=pivote; 
		   
		   if(izq<j-1)
			   ordenamiento(vector,izq,j-1); 
		   if(j+1 <der)
			   ordenamiento(vector,j+1,der); 
}

