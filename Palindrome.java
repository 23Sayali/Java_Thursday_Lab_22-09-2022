//Q1: Write a program to accept a number from the user and check if a given number is palindrome or not.

import java.util.*;

class Palindrome{  
	public static void main(String args[]){
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n=sc.nextInt();             ////It is the number variable to be checked for palindrome  
		int r,sum=0,temp;    
                  
       temp=n;    
     while(n>0){    
      r=n%10;                               //getting remainder  
      sum=(sum*10)+r;    
      n=n/10;                               
  }
     if(temp==sum)                       //condition is checked for palindrome  
    	 System.out.println("Palindrome Number!!!");
     else
    	 System.out.println("Not Palindrome!!!!");    
  }  
}  
