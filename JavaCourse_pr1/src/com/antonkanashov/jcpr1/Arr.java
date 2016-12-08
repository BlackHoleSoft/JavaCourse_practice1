package com.antonkanashov.jcpr1;

import java.util.Random;

public class Arr{
    
    public static void main(String[] args){
	    int[] arr = generate();
	    //bubbleSort(arr);
	    oddEvenSort(arr);
		for (int i = 0; i < arr.length; i++) System.out.println(arr[i]);
    }    
	
	private static int[] generate ()
	{
	    Random r = new Random();
	    int[] result = new int[10] ; 
	       for (int i = 0; i < 10; i++)
		   {
			    result[i]=r.nextInt();
		   }
		return result;
	}
	
	private static void bubbleSort(int[] array){
		for(int max=array.length; max>=2; max--){
			for(int i=0; i<max-1; i++){
		    	if(array[i+1] < array[i]){
		    		int tmp = array[i+1];
		    		array[i+1] = array[i];
		    		array[i] = tmp;
		    	}
		    }
		}	    
	}
	
	private static void oddEvenSort(int[] array){ //четно-нечетная сортировка
		for(int i=0; i<array.length; i++){
			for(int j=((i % 2)>0)?0:1; j<array.length-1; j+=2){
		    	if(array[j+1] < array[j]){
		    		int tmp = array[j+1];
		    		array[j+1] = array[j];
		    		array[j] = tmp;
		    	}
		    }
		}	    
	}
}