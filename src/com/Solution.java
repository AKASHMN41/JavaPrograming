package com;

import java.util.Scanner;

public class Solution  extends Calsi{
 public static void main(String [] args) {
	 System.out.println(" WEL COME TO BUSSINES LOGIC");
	 System.out.println("1:sum\n2:sub\n3:mul:\n4:div\n5:exit");
	  Solution s=new Solution();
	  Scanner sc=new Scanner (System.in);
	  System.out.println(" Enter the choice");
	  int choice =sc.nextInt();
	  while(true) {
	  switch(choice) {
	  case 1: 
		  System.out.println(" Enter the value of a");
		  int a=sc.nextInt();
		  System.out.println(" Enter the value of b");
		  int b=sc.nextInt();
		   int sum1=s.sum(a, b);
		  System.out.println(" sum of two number is..." +sum1);
		  break;
	  case 2:
		  //System.out.println(" Enter the choice");
		  //System.out.println(" Enter the choice");
		  //int choicee =sc.nextInt();
		  System.out.println(" Enter the value of a");
		  int aa=sc.nextInt();
		  System.out.println(" Enter the value of b");
		  int bb=sc.nextInt();
		   int sub1=s.sub(aa, bb);
		  System.out.println(" sum of two number is...."+sub1);
		  break;
		 //System.exit(0);
	  
	  case 3:
		  System.out.println(" Enter the value of a");
		  int aaa=sc.nextInt();
		  System.out.println(" Enter the value of b");
		  int bbb=sc.nextInt();
		   int mul1=s.mul(aaa, bbb);
		  System.out.println(" sum of two number is....."+mul1);
		  break;
	  case 4:
		  System.out.println(" Enter the value of a");
	  int aaaa=sc.nextInt();
	  System.out.println(" Enter the value of b");
	  int bbbb=sc.nextInt();
	   int div1=s.sum(aaaa, bbbb);
	  System.out.println(" sum of two number is"+div1);
	  break;
	  default :
		  System.out.println("INVALID CHOICE");
		  break;
	  case 5:
		  System.out.println("Thank you");
		  //System.exit(0);
	  }
 }
}
}