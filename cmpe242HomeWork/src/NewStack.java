import java.util.NoSuchElementException;

//-----------------------------------------------------
// Title: Stack
// Author: Hilalnur Beral
// Section: 01
// Assignment: 1
// Description:This class implements stack methods .

public class NewStack<Item> {
	
	private Node first;
	private int N;
	
	private class Node{
		Item item;
		Node next;
	}
	
	
	public Item peek(){ // with this method we can peek an item
		if(isEmpty()){
			throw new NoSuchElementException("Stack Underflow"); // if stack is empty , ,t throws an exception
		}
		return first.item;
	}

	public boolean isEmpty(){ // This method controls whether stack is empty .
		return first==null;
	}
	
	public int size(){ // This method gives the size of the stack.
		
		return N;
	}
	
	
	public void push(Item item){ // with this method we can push an item
		Node oldfirst=first;
		first=new Node();
		first.item=item;
		first.next=oldfirst;
		N++;
	}
	
	public Item pop(){ // with this method we can pop an item
		if(isEmpty()){
			System.out.println("Stack is empty");
		}
		
		Item item=first.item;
		first=first.next;
		N--;
		return item;
	

	}
	
}
