package main;

import java.util.Arrays;
import java.util.Random;

import troca.Quicksort;

public class MainQuickSort {
	public static void main(String[] args) {
		
		int[] arr = new int[100000];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(900) + 100; // Números aleatórios de 100 a 999 (3 dígitos)
        }
       
        System.out.println("Vetor desordenado: ");
        System.out.println(Arrays.toString(arr));
       
        long startTime = System.currentTimeMillis();
       
        Quicksort.quickSort(arr, 0, arr.length-1);
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        // Imprime o vetor ordenado e o tempo de execução
        System.out.println("Vetor ordenado: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Tempo de execução (ms): " + duration);
	} // end main
} // end class

