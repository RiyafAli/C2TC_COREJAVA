package com.tns.day6.usingfinal;

public class FinalClassDemo {
	public static void main(String[] args) {
		// Create the object of final class
		FinalClass f1 = new FinalClass(); 
		// Call show() method using object reference variable.
		f1.show();
	}
	class FinalClass {
		void show() {
			System.out.println("Final class cannot be inherited");
		}
	}
}
