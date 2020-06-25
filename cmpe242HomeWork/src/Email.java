//-----------------------------------------------------
// Title: Email Class
// Author: Hilalnur Beral
// Section: 01
// Assignment: 1
// Description: This class defines a  email class and its attributes with getter and setter methods and constructor. 
public class Email {
	
	String subject;
	int ID;
	String message;
	int time;
	boolean flag;
	
	// Constructor
	public Email(String subject,int ID,String message,int time,boolean flag) {
	 //Email class constructor.
	this.subject = subject;
		this.ID = ID;
		this.message = message;
		this.time = time;
		this.flag = flag;
	}
	// Getter and Setter Methods
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	
	
	

}
