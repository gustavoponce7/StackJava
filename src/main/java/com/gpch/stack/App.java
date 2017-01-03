package com.gpch.stack;

public class App {
	
	public static void main(String[] args) {
		
		MyStack myStack = new MyStack(10);
		myStack.push(10);
		myStack.push(20);
		myStack.push(30);
		myStack.push(40);
		myStack.push(50);
		myStack.push(60);
		myStack.push(70);
		myStack.push(80);
		myStack.push(90);
		myStack.push(100);
		myStack.push(110);
		myStack.push(120);
		myStack.push(130);
		myStack.push(140);

		String coma = "";
		while (!myStack.isEmpty()) {
			int value = myStack.pop();
			System.out.print(coma + value);
			coma = ", ";
		}		
	}
}
