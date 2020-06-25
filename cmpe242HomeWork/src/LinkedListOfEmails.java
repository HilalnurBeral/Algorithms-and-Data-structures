//-----------------------------------------------------
// Title: LinkedListOfEmails
// Author: Hilalnur Beral
// Section: 01
// Assignment: 1
// Description:This class implements a emails linkedlist and its methods.

public class LinkedListOfEmails<Item> {
	Node first;
	int size;

	

	private class Node {
		Email email; //object of an Email class
		Node next;
		
	}
	

	public boolean isEmpty() { // This method checks whether linkedlist is empty.
		return first == null;
	}

	public int size() { //this method gives the size of linkeslist
		return size;
	}

	public void addEmail(Email E){ //This method add new email to the linkeslist
		if (isEmpty())
		{
			// if linkedlist is empty , we create new node with first item
			first = new Node();
			first.email=E;
		} else {
			//if linkedlist is not , we add new email like this.
		Node newNode = new Node();
		newNode.email = E;
		newNode.next =first;
		first = newNode;
		}
	}
	
	public void read(int id){ //This method read an email according to given id.
		Node current = first;
		while(current != null) { //This while loop will be executed if the current node is not empty.
			if (current.email.ID == id) { 
				current.email.setFlag(true);
				System.out.println("Email id:"+ id+"\n"+"Subject: "+current.email.getSubject()+ "\n"+"Body: "+current.email.getMessage()+"\n"+"Time received: "+current.email.getTime()+"\nStatus: read");
			}
			current = current.next;
		}
	}


	public Email delete(int id) { //This method deletes an email according to given id.
		Node temp = first, prev = null; 
		 if (temp != null && temp.email.ID == id) 
	        { 
	            first = temp.next; // Changed head 
	            return temp.email; 
	        } 
		 while (temp != null && temp.email.ID != id) 
	        { 
	            prev = temp; 
	            temp = temp.next; 
	        }
	      if (temp == null) 
	    	  return null; 
	      prev.next = temp.next;
	      
		return temp.email; 

	}
	
	public void copy(LinkedListOfEmails list) {
		Node current = first;
		while(current != null){
			 list.addEmail(current.email);
			 current=current.next;
		 }
	 }

	public void showAll(boolean flag) {
		Node current = first;
		System.out.printf("%-10s%-25s%-43s%-10s%-10s\n", "Email", "Subject", "Body", "Time", "Status");
		//It traverses the whole list and prints out the according message.
		for (current = first; current != null; current = current.next) {
			int id = current.email.getID();
			String message = current.email.getMessage();
			String subject = current.email.getSubject();
			int time = current.email.getTime();
			boolean readFlag = current.email.flag;
			if (current.email.ID == id && flag==true) {
				if(readFlag == true) {
					System.out.printf("%-10d%-25s%.40s...%-10d%-10s", id, subject, message, time,"YES");
					System.out.println();
				}
				if(readFlag == false) {
					System.out.printf("%-10d%-25s%.40s...%-10d%-10s", id, subject, message, time,"NO");
					System.out.println();
					}

			}

			if (current.email.ID == id && current.email.flag == false && flag == false) {
				System.out.printf("%-10d%-25s%.40s...%-10d%-10s", id, subject, message, time, "NO");
				System.out.println();

			}
		}
	}
	public void deleteList() // This method deletes whole linked list when it is used. I added this method as an additional method.
    { 
        first = null;

    }
	
	

	public void sort() { //This method sort a linkedlist in a descending order.
		Node current = first;
		while (current != null) {
			Node second = current.next;
			while (second != null) {

				if (current.email.time < second.email.time) { // compares the arrival time of emails
					Email tmp= current.email; 
					current.email = second.email;
					second.email = tmp;
					// swap these emails
				}
				second = second.next;
			}
			current = current.next;
		}
	}
}
