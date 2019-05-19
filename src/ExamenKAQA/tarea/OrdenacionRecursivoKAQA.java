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
public class OrdenacionRecursivoKAQA {
     public static void main(String[] args) {
        
        OrdenacionRecursivoKAQA o = new OrdenacionRecursivoKAQA();
		int vector[]={56,-7,0,65,12,20,6,33};
		o.ordenamiento(vector, 0 ,vector.length-1);
		
		for(int i =0; i<vector.length; i++){
			System.out.print(vector[i]+ " ");
		}
	}

    private void ordenamiento(int[] vector, int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
