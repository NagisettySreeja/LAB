package com.cg.lb02.ui;
import java.util.Scanner;

public class Ex3 {
	public void getSorted(int arr[], int n) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of array");
		n=scan.nextInt();
		int []b=new int[n];
		int j=n;
		 for (int i = 0; i < n; i++) { 
	            b[j - 1] = arr[i]; 
	            j = j - 1; 
	        }
	        System.out.println("Reversed array is: \n"); 
	        for (int k = 0; k < n; k++) { 
	            System.out.println(b[k]);
	      }
	    } 
	    public static void main(String[] args) 
	    { 
	        int [] arr = {10, 20, 30, 40, 50}; 
	       new Ex3().getSorted(arr, arr.length); 
	    } 
	}
