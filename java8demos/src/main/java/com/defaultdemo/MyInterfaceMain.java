package com.defaultdemo;

public class MyInterfaceMain {

	public static void main(String[] args) {
		MyInterface myInterface = new MyInterfaceImpl();
		myInterface.display();
		int a = myInterface.add(2, 3);
		System.out.println("Value : " + a);
		System.out.println("static final variable : " + MyInterface.VAR);
		int b = MyInterface.sub(5, 3);
		System.out.println(b);
	}

}
