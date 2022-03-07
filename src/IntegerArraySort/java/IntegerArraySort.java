package IntegerArraySort.java;

import java.util.Scanner;

public class IntegerArraySort {
	public static void main(String[] args) {
		int n;  
		Scanner sc=new Scanner(System.in);  
		System.out.println("Nhap so luong so trong day so, toi da 50 (Input the number of elements in the array, maximum 50): ");
		//input the number of elements in the array  
		n=sc.nextInt();  
		//creates an array in the memory of length 10  
		int[] array = new int[50];  
		System.out.println("Nhap cac phan tu trong day so (Input the numbers): ");
		for(int i=0; i<n; i++)  
		{  
		//reading array elements from the user   
			array[i]=sc.nextInt();  
		}  
		System.out.println("Day phan tu da sap xep (Sorted Array): ");
		int temp;
		for (int i = 1; i < n; i++) {
	    for (int j = i; j > 0; j--) {
	    	if (array[j] < array [j - 1]) {
	    		temp = array[j];
	    		array[j] = array[j - 1];
	    		array[j - 1] = temp;
	    		}
	    	}
	   }
	   for (int i = 0; i < n; i++) {
		   System.out.println(array[i]);
	   }
	  }
}
