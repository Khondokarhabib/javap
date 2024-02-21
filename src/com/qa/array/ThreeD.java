package com.qa.array;

public class ThreeD {
	
	
	
	
	
	public static void main(String[] args) {
		int[][][] arr1= {
				{{10,60,50}},//0
				     //0
				{{30,40,70}},//1
				     //0
				
				
				{{1,4,7}},//2
				
				{{23,24,100},{99,98,97},{55,66,77}}      };  //3
		              //0       //1        //2
		
		
		for (int i = 0; i < arr1.length; i++)
		      for (int j = 0; j < arr1[i].length; j++)
		        for (int z = 0; z < arr1[i][j].length; z++)
		          System.out.println("arr[" + i
		              + "]["
		              + j + "]["
		              + z + "] = "
		              + " " + arr1[i][j][z]);
//		System.out.println(arr1[1][0][1]+"  40   ");
//		System.out.println(arr1[2][0][0]+"  1   ");
		
		int arr[][][] = {
		{  //0  1  2
	        {1, 2, 3},       //0  [0 0 1=1]
	            //0               [0 0 1=2
	        
	        //0 1  2
	        {4, 5, 6}
	            //1
	        
	    },
		
	    {   //0 1  2
	        {7, 8, 9},      //1
	           //0
	        //0  1   2
	        {10, 11, 12}
	        
	            //1
	    }
	                       };
		
		
		
//		for (int i = 0; i < arr.length; i++) {
//		    for (int j = 0; j < arr[i].length; j++) {
//		        for (int k = 0; k < arr[i][j].length; k++) {
//		            System.out.print(arr[i][j][k] + " ");
//		        }
//		    }
//		}


	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
//
//	public static void main(String[] args) {
////		int[][][] arr= {{{10,60,50}},{{30,40,70}}};
//		
//		int arr[][][] = {{{1, 2, 3},
//	        {4, 5, 6}
//	    },
//	    {
//	        {7, 8, 9},
//	        {10, 11,12}
//	    }
//	};
//		//int[][][] arr= {{{1,3,6}},{{10,60,50},{30,40,70}}};
////		System.out.println(arr [0][0][0]);
////		System.out.println(arr [0][0][1]);
////		System.out.println(arr [0][0][2]);
////		System.out.println(arr [0][1][0]);
////		System.out.println(arr [0][1][1]);
////		System.out.println(arr [0][1][2]);
////		//System.out.println(arr [0][0][]);
//		for(int i[][]:arr) {
//			
//		for(int j[]:i) {
//			System.out.println();
//			for(int k:j) {
//			
//				System.out.println(k);
//			}
//		}
//
//	}
//
//	}}
	
