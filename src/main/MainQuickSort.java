package main;

import java.util.Arrays;
import java.util.Random;

import troca.Quicksort;

public class MainQuickSort {
	public static void main(String[] args) {
		
		int[] arr = new int[100000];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(900) + 100; // N�meros aleat�rios de 100 a 999 (3 d�gitos)
        }
       
        System.out.println("Vetor desordenado: ");
        System.out.println(Arrays.toString(arr));
       
        long startTime = System.currentTimeMillis();
       
        Quicksort.quickSort(arr, 0, arr.length-1);
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        // Imprime o vetor ordenado e o tempo de execu��o
        System.out.println("Vetor ordenado: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Tempo de execu��o (ms): " + duration);
	} // end main
} // end class

