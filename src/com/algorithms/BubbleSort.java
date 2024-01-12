package com.algorithms;

public class BubbleSort {

	public static void main(String[] args) {
		int input[] = {24,39,5,97,31,-77,10};
		
		for(int lastUnsortedIndex=input.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--){
			for(int i = 0; i < lastUnsortedIndex; i++) {
				if(input[i] > input[i+1]) {
					int temp = input[i];
					input[i] = input[i+1];
					input[i+1] = temp;
				}
			}
		}
		
		for(int j : input) {
			System.out.println(j);
		}
	}
}
