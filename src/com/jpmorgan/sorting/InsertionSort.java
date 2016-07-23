package com.jpmorgan.sorting;

import java.util.Arrays;

public class InsertionSort {
	
	public static void main(String[] args) {
		int []array = {7,5,9,4,11,2,8};
		System.out.println("Original =>"+Arrays.toString(array));
		for(int i = 1; i < array.length; i++){
			int j = i ;
			for(j=i ; j>0 && array[j]<array[j-1]; j-- ){				
				if(array[j]<array[j-1]){
					int temp =array[j];
					array[j]=array[j-1];
					array[j-1]=temp;
				}
				System.out.println("\t After sub-passes "+j+"=>"+Arrays.toString(array));
			}
			System.out.println("After passes "+i+" value j "+j+"=>"+Arrays.toString(array));
		}	
	}

}
