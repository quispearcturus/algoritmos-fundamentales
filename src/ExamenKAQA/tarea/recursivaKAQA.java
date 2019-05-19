/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenKAQA.tarea;

import java.util.Arrays;

/**
 *
 * @author kevin quispe
 */
public class recursivaKAQA {

    
    public static void main(String[] args) {
        int[] array = { 2, 7, 25, 57, 8, 5, 72, 17, 60, 48, 97 };
		Arrays.sort(array);
 
		System.out.println(Arrays.toString(array));
		System.out.println(busca(array, 8));
		System.out.println(busca(array, 17));
		System.out.println(busca(array, 97));
	}

	private static int busca(int[] array, int chave) {
		return recursivaKAQA(array, 0, array.length - 1, chave);
	}

	private static int recursivaKAQA(int[] array, int menor, int maior,
			int chave) {
		int media = (maior + menor) / 2;
		int valorMeio = array[media];

		if (menor > maior)
			return -1;
		else if(valorMeio == chave) 
			return media;
		else if (valorMeio < chave)
			return recursivaKAQA(array, media+1, maior, chave);
		else
			return recursivaKAQA(array, menor, media-1, chave);
	}
    }

