import java.util.Scanner;

//Title: Tester class of the Calc class
// Author: Hilalnur Beral
// Section: 01
// Assignment: 1
// Description:This class is a test class for Calc.This class test all methods from NewStack class . Such as peek, push,isEmpty.
public class CalcTester {

	public static void main(String[] args) {
	NewStack stk=new NewStack();
	Scanner scanner =new Scanner(System.in);
	System.out.println("OPERATIONS:\n 1.) Push \n 2.) Pop \n 3.) Peek\n 4.) E for exit");	
		
		System.out.println("Please enter a command");
		
		while(true){
	String command=scanner.nextLine();
	if(command.equalsIgnoreCase("pop")){ //this command controls the pop method.
		if(stk.isEmpty()){
			
			System.out.println("You cannot pop an item. Stack is empty. Please enter for another operation");
			continue;
		}
		System.out.println(stk.pop());
		
	}
		else if(command.equalsIgnoreCase("push")){ //With this command you can enter an item to push after using push command.
			System.out.println("Enter a item you want to push");
			String item=scanner.nextLine();
			stk.push(item);
			
		}
	
		else if(command.equalsIgnoreCase("peek")){ //this command controls the peek method and you go to the beginning of the loop if the stack is empty.
			if(stk.isEmpty()){
				System.out.println("You cannot peek an item.Stack is empty. Please enter another command");
				continue;
			}
			System.out.println(stk.peek());
			
			
		}
		else if(command.equalsIgnoreCase("E")){ //with this command you can exit from program.
			System.out.println("Program is ended");
			break;
		}
		else{
			
			System.out.println("Ýnvalid operation. Please enter a valid command"); // if user's command is invalid . Program prints this message and go to the beginning of the while loop. 
			continue;
		}
	
			
		

}

}
	
}
