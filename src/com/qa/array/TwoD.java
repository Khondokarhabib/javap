package com.qa.array;

public class TwoD {
	public static void main(String[] args) {
		int[] []arr1= {{10,20,30,40,50,},{60,70,80,90,}};
		
		for(int []i:arr1) {
			for(int ii:i)
			System.out.print(ii+" ");
		}
		System.out.println();
	}

}
