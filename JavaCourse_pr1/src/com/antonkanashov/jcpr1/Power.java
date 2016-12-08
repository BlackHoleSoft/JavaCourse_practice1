package com.antonkanashov.jcpr1;

public class Power{
    
    public static void main(String[] args){
    	
    	if(args.length < 2){
    		System.out.println("Не были введены аргументы программы!");    		
    	}else{
    		
    		try{
    			int num = Integer.parseInt(args[0]);
        		int p = Integer.parseInt(args[1]);
        		System.out.println(pow (num, p));
    		}catch(NumberFormatException e){
    			System.out.println("На вход нужно подавать числа!");
    		}    		
    	}        
    }    
	
	private static int pow (int num, int p)
	{
	    int result = num ; 
	    for(int i = 0; i<p; i++)
           result *=num;
		   
		return result;
	}
}