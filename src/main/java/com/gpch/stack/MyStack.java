package com.gpch.stack;

//LIFO - Last Input, First Output
public class MyStack {

	private int maxSize;
	private int[] stackArray;
	private int top;

	public MyStack(int s) {
		maxSize = s;
		stackArray = new int[maxSize];
		top = -1;
	}

	public void push(int value) {
		if (isFull()){
			System.out.println("Unable to add: " + value + " Full Stack");
		}else{
			stackArray[++top] = value;
		}
	}

	public int pop() {
		return stackArray[top--];
	}

	public int peek() {
		return stackArray[top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top + 1 == maxSize);
	}

}