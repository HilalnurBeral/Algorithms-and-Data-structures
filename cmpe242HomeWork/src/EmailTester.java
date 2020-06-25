//-----------------------------------------------------
// Title: EmailTester
// Author: Hilalnur Beral
// ID: 11549136358
// Section: 01
// Assignment: 1
// Description:This class checks the methods of linkedlistOfEmail class.Such as add, read, showAll and delete.

import java.util.Scanner;

public class EmailTester {

	public static void main(String[] args) {
		//LinkedListOfEmails list=new LinkedListOfEmails();
	
		LinkedListOfEmails inbox = new LinkedListOfEmails();
		LinkedListOfEmails archive = new LinkedListOfEmails();
		
		
		String email1 = "N //Hello from CMPE242.//1234//This is a welcome email from the course.//2364675//" ;
		String[] s1 = email1.split("//");
		String subject = s1[1];
		int id = Integer.parseInt(s1[2]);
		String body = s1[3];
		int time = Integer.parseInt(s1[4]);
		Email e1 = new Email(subject, id, body, time, false);
		
		
		String email2 = "N //Homework 1 posted.//1237//This is your first homework for the course.//2264672//" ;
		String[] s2 = email2.split("//");
		String subject2 = s2[1];
		int id2 = Integer.parseInt(s2[2]);
		String body2 = s2[3];
		int time2 = Integer.parseInt(s2[4]);
		Email e2 = new Email(subject2, id2, body2, time2, false);
		
		
		String email3 = "N//Email tester.//1997//This an email message to demonstrate functionality of the homework.//2134567";
		String[] s3 = email3.split("//");
		String subject3 = s3[1];
		int id3 = Integer.parseInt(s3[2]);
		String body3 = s3[3];
		int time3 = Integer.parseInt(s3[4]);
		Email e3 = new Email(subject3, id3, body3, time3, false);

		System.out.println("Adding emails...");
		System.out.println();
		inbox.addEmail(e1);
		inbox.addEmail(e2);
		inbox.addEmail(e3);
		inbox.sort();
		System.out.println();
		System.out.println("Reading emails:");
		System.out.println();
		inbox.read(id3);
		System.out.println();
		System.out.println("Showing all emails in the list:");
		System.out.println();
		inbox.showAll(true);
		System.out.println();
		System.out.println("After deletion of email 3:");
		System.out.println();
		inbox.delete(id3);
		inbox.showAll(false);
		System.out.println();
		System.out.println("After moving elements of inbox to archive:");
		System.out.println();
		inbox.copy(archive);
		inbox.deleteList();
		archive.showAll(false);
		System.out.println();
		System.out.println("After moving elements of the inbox:");
		System.out.println();
		System.out.println();
		inbox.showAll(false);
	

	}
}