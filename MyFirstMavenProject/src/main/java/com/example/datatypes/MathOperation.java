/**
 * 
 */
package com.example.datatypes;

/**
 * @author Swetha
 *
 */
public class MathOperation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = add();
		sub(value);
		mul();
		div();
		
	}
	//Addition 
		public static int add(){
			int a = 10;
			int b = 20;
			int c = a + b;
			System.out.println("The Sum of two numbers:" + c);
			return c;
		}
		//subtract
		public static void sub(int x){
			int b = 20;
			int c = x - b;
			System.out.println("The Subtraction of two numbers:" + c);
		}
		//Multiplication
		public static void mul(){
			int a = 10;
			int b = 20;
			int c = a * b;
			System.out.println("The product of two numbers:" + c);
		}
		//Division
			public static void div(){
				int a = 20;
				int b = 10;
				int c = a / b;
				System.out.println("The divison of two numbers:" + c);
			}
	}

