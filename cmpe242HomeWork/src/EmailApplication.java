//-----------------------------------------------------
// Title: EmailApplication Class
// Author: Hilalnur Beral
// Section: 01
// Assignment: 1
// Description:This class includes 3 linked lists and we make operations onto these according to commands.

import java.util.Scanner;

public class EmailApplication<Item> {

	
	public static void main(String[] args){ //in this class we used main method as our instructor said during the online lecture.
		
		LinkedListOfEmails INBOX = new LinkedListOfEmails(); //Inbox linkedlist
		LinkedListOfEmails ARCHIVE = new LinkedListOfEmails();//Archive linkedlist
		LinkedListOfEmails TRASH = new LinkedListOfEmails();//trash linkeslist

		System.out.println("Please enter a command: ");
		Scanner input = new Scanner(System.in);
		String sentence;
		do {
			String[] words;
			sentence = input.nextLine();
			
			if(sentence.charAt(0) == 'N') { // This condition add new email to the inbox linkedlist
				words = sentence.split("//"); // I split the sentence based on "//".
				String subject = words[1]; //subject of a given email
				int id = Integer.parseInt(words[2]); // id of a given email
				String body = words[3]; //body of a given email
				int time = Integer.parseInt(words[4]); // time of a given email
				Email e = new Email(subject, id, body, time, false);
				INBOX.addEmail(e); // add email to the inbox.

			}else if(sentence.charAt(0)=='R' ) { //This method reads the email from inbox with given id.
				words = sentence.split("\\s");	
				int id = Integer.parseInt(words[1]); //id of a given email
				INBOX.read(id); // read the email with given id in Inbox linkedlist
 
			}
			
			else if(sentence.charAt(0)=='A'){ //This method  add email ,which is deleted from inbox, to the archive linkedlist.
				 words = sentence.split("\\s");
				int id =Integer.parseInt(words[1]);
				ARCHIVE.addEmail(INBOX.delete(id)); //  I added deleted email to the archive linkedlist
				ARCHIVE.sort(); // Archive linkedlist is sorted
				System.out.println("Email "+ words[1] +" archived");	
				
			}
			else if(sentence.charAt(0)=='D'){
				 words = sentence.split("\\s");
				int id =Integer.parseInt(words[1]);
				TRASH.addEmail(INBOX.delete(id)); // I add deleted email to the trash.
				TRASH.sort(); //Trash linkedlist is sorted
				

			}
			
			else if(sentence.charAt(0)=='S'){
				 words = sentence.split("\\s");
				String folder =words[1];
				if(folder.equalsIgnoreCase("Inbox")){
					INBOX.sort(); // Inbox linkedlist is sorted
					INBOX.showAll(true);
				

				}
				else if(folder.equalsIgnoreCase("Trash")){
					TRASH.sort(); // Trash linkedlist is sorted
					TRASH.showAll(true);
					
					

				}
				else if(folder.equalsIgnoreCase("Archive")){
					ARCHIVE.sort(); // Archive linkedlist is sorted
					ARCHIVE.showAll(true);
				

				}
				else{
					System.out.println("Invalid folder");
				}
			}
			
			else if(sentence.charAt(0)=='U'){
				// This method shows unread emails

				words = sentence.split("\\s");
				String folder =words[1];
				if(folder.equalsIgnoreCase("Inbox")){
					INBOX.showAll(false); // Show emails which are in inbox linkedlist(unread)
				}
				else if(folder.equalsIgnoreCase("Trash")){
					TRASH.showAll(false); // Show emails which are in trash linkedlist(unread)
				}
				else if(folder.equalsIgnoreCase("Archive")){
					ARCHIVE.showAll(false); //  Show emails which are in archive linkedlist(unread)
				}
			}
			
			else if (sentence.charAt(0) == 'C') {
				words = sentence.split("\\s");
				String folder = words[1];
				if (folder.equalsIgnoreCase("Trash")) {
					TRASH.deleteList(); //delete the whole Trash linkedlist
				} else if (folder.equalsIgnoreCase("Inbox")) {
					INBOX.copy(TRASH); // copy all items of Inbox to the Trash linkedlist
					INBOX.deleteList(); // delete whole Inbox linkedlist

				} else if (folder.equalsIgnoreCase("Archive")) {
					ARCHIVE.copy(TRASH); //copy the all items of archive to the Trash linkedlist.
					ARCHIVE.deleteList(); //delete whole archive linkedlist
				}

			
				
				
			}
			
		}while(!sentence.equals("E")); 
		
		
}
}
