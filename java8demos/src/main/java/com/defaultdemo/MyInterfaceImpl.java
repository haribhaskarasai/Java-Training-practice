package com.defaultdemo;

public class MyInterfaceImpl implements MyInterface, MyInterface2 {

	@Override
	public void display() {
		System.out.println("Display run time polymorphism");

	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return MyInterface2.super.add(a, b);
	}
	

}
