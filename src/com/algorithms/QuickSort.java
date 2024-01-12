package com.algorithms;

public class QuickSort {

	public static void main(String[] args) {
		int input[] = {24,39,5,97,31,-77,10};
	}
	
	public static void quickSort(int input[], int start, int end) {
		if(end - start < 2) {
			return;
		}
		int pivot = partition(input, start, end);
		quickSort(input, start, pivot - 1);
		quickSort(input, pivot + 1, end);
	}
	
	public static int partition(int input[], int start, int end) {
		while()
	}
}
