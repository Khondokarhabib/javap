package com.jashim.qa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyLists {
public static void main(String[] args) {
		
		List<Integer> number = new ArrayList<>();
		number.add(10);
		number.add(15);
		number.add(5);
		number.add(1);
		number.add(200);
		number.add(150);
		number.add(55);
		number.add(10);
		
		Collections.sort(number);
		
		for(Integer sortedNumber : number){
			System.out.println(sortedNumber);
		}
	}

}
