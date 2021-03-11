package com.cg.lb06.ui;
import java.util.ArrayList;
import java.util.Collections;

public class Ex5 {
	public static int getSecondSmallest(int[] arr) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i:arr){
			list.add(i);
			}
		
		Collections.sort(list);
		return list.get(1);
		}
	public static void main(String[] args) {
		int[] arr= {6,7,8,9,4};
		System.out.println(getSecondSmallest(arr));
		}
}

