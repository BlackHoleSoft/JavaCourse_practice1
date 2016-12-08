package com.antonkanashov.jcpr1;

public class Fac{
    
    public static void main(String[] args){        
        
        if(args.length < 1){
    		System.out.println("�� ���� ������� ��������� ���������!");    		
    	}else{
    		
    		try{
    			int num = Integer.parseInt(args[0]);        		
    			System.out.println(fac (num));
    		}catch(NumberFormatException e){
    			System.out.println("�� ���� ����� �������� ����o!");
    		}    		
    	}        
    }    
	
	private static int fac (int num)
	{
	    int result = num; 
	    while(num>1){
		
		   result *= --num;
		
		}
		   
		return result;
	}
}