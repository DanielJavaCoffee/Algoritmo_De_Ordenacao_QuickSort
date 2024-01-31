package troca;

import java.util.Random;

public class Quicksort {

	public static void quickSort(int[] arr, int esquerda, int direita) {
		if (esquerda < direita) {
			int indicePivo = particaoAleatoria(arr, esquerda, direita);
			quickSort(arr, esquerda, indicePivo - 1);
			quickSort(arr, indicePivo + 1, direita);
		}
	}

	public static int partition(int[] arr, int start, int end) {
		int pivot = arr[(start + end) / 2];
		int i = start - 1;
		for (int j = start; j < end; j++) {
			if (arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i + 1];
		arr[i + 1] = arr[end];
		arr[end] = temp;
		return i + 1;
	}

	private static int particaoAleatoria(int[] arr, int esquerda, int direita) {
		Random aleatorio = new Random();
		int indicePivo = aleatorio.nextInt(direita - esquerda + 1) + esquerda;
		int valorPivo = arr[indicePivo];
		troca(arr, indicePivo, direita);
		int indiceArmazenamento = esquerda;
		for (int i = esquerda; i < direita; i++) {
			if (arr[i] < valorPivo) {
				troca(arr, i, indiceArmazenamento);
				indiceArmazenamento++;
			}
		}
		troca(arr, indiceArmazenamento, direita);
		return indiceArmazenamento;
	}

	private static void troca(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
