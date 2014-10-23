package com.array;

public class TestMyArray {
	public static void main(String[] args) {
		MyOrderArray array = new MyOrderArray();
		array.insert(3);
		array.display();
		array.insert(5);
		array.display();
		array.insert(4);
		array.display();
		array.insert(1);
		array.insert(1);
		array.display();

		System.out.println(array.binarySearch(3));
		
		/*int array1[] = new int[]{3,10,9,5,7,3};
		int array2[] = new int[array1.length];
		for(int i=0;i<array1.length;i++){
			int j;
			for(j=0;j<i;j++){
				if(array1[i]<array2[j]){
					break;
				}
			}
			for(int k=i;k>j;k--){
				array2[k]=array2[k-1];
			}
			array2[j]=array1[i];
		}
		//Êä³ö
		for(int i=0;i<array2.length;i++){
			System.out.print(array2[i]+" ");
		}*/
	}
	
}
