package com.project1;

public class Phone {
	static String color1= "Blue"; // variables
	static String type = "Toy";
	int price;
	
	// Five kind methods..
	
	Phone(){}; //constructor without parameter.
	
	Phone( String a, String b, int c){
		color1= a;
		type=b;         //constructor with parameter
		price=c;
	}
	
	public  void getCol(){
		System.out.println("Phone color is "+color1+ " .");
		
	}  
	// passing value in the method
	
	public static void whatKindPhone(String a){
		type= a;
		System.out.println("This phone is a "+a+" phone .");
	}
	
	public  void priceOfPhone(){
		System.out.println("This phone in only "+price+" .");
		
	}

}
