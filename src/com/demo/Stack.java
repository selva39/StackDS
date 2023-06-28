package com.demo;

public class Stack {
	protected int[] data;
	private static final int SIZE=10;
	int ptr=-1;
	public 	Stack()
	{
		this(SIZE);
	}
	
	public Stack(int size)
	{
		this.data=new int[size];
	}
		public boolean push(int item)
		{
			if(isFull())
			{
				System.out.println("Stack is full!!");
			}
			ptr++;
			data[ptr]=item;
			return true;
		}
		public int pop() throws Exception
		{
			if(isEmpty())
			{
				throw new Exception("cannot pop from an empty stack");
			}
			int removed=data[ptr];
			ptr--;
			return removed;
			
		}
		public int peek() throws Exception {
		if(isEmpty())
		{
			throw new Exception("cannot peek from an empty stack!!");
		}
			
		
		
			return data[ptr];  
		}
	public boolean isFull()
	{
		return ptr==data.length-1; //ptr is at last index
	}
	public boolean isEmpty()
	{
		return ptr==-1;
	}

}
