package com.sort;

public class TestSort {
	public static void display(long array[]){
		for(long arr : array){
			System.out.print(arr+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		long[]arr = new long[]{1,3,4,1,2,5};
		display(arr);
		InsertSort.sort(arr);
		display(arr);
	}
}
