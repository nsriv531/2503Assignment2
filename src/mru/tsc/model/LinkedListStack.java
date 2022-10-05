package mru.tsc.model;

import java.util.EmptyStackException;

public class LinkedListStack implements StackInterface<Card>{
	
	private Card[] cardArray;
	private int size;
	private int top;
	
	public LinkedListStack(int size) {
		cardArray = new Card[size];
		this.size = size;
		this.top = -1;
		
	}
	
	@Override
	public void push(Card x) {

		if (top == size-1) {
			System.out.println("Stack is full!");
			
		}
		else {
			top++;
			cardArray[top] = x;
		}
		
	}

	@Override
	public Card pop() {
		
		if (!isEmpty()) {
			Card item = cardArray[top];
			top--;
			return item;
			
		}
		
		else {
			throw new EmptyStackException();
		}
				
	}

	@Override
	public Card peek() {
		return cardArray[top];
	}

	@Override
	public boolean isEmpty() {
		
		if (top == -1)
			return true;
		return false;
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return top;
	}

	

}