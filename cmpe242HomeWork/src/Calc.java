//Title:Calculator(Calc) class for posfix expression
// Author: Hilalnur Beral
// ID: 11549136358
// Section: 01
// Assignment: 1
// Description:This class calculates the posfix expression..
import java.util.Scanner;

public class Calc<Item> {

	public static void main(String args[]) { // This class calculates the posfix expression. It includes main method as our Instructor said during the lecture.
		
	NewStack<String> operands =new NewStack<String>();
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter a command.Write E to exit");
		String s;
		while(true) {
		
			 s=scanner.nextLine();
			String[] s1=s.split("//s");
			if(s.equalsIgnoreCase("S")){  // You peek an item with this command
				System.out.println(operands.peek());
				continue;
			}
		 
		else if (s.equalsIgnoreCase("P")) {  // you pop an item with this command
			if(operands.isEmpty()){ 
				System.out.println("Stack Underflow"); // if stack is empty , it prints this message
			}
			else{

			System.out.println(operands.pop()); // this pops the item.
			continue;
			}

			
		// if input is "E" or "e", the while loop ends(break).
		} 
		else if (s.equalsIgnoreCase("E")) {
			//This method breaks the while loop
			System.out.println("Program ended");

			break;
		}
			else if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")||s.equals("%")){
				int operand2 = Integer.parseInt(operands.pop()); 
				int operand1 = Integer.parseInt(operands.pop());
				int result = 0;
				if (s.equals("+")) {
					result = operand1 + operand2;
					String r=String.valueOf(result);
					operands.push(r);
					System.out.println(result);
				} else if (s.equals("-")) {
					result = operand1 - operand2;
					String r=String.valueOf(result);
					operands.push(r);
					System.out.println(result);
				
				} else if (s.equals("*")) {
					result = operand1 * operand2;
					String r=String.valueOf(result);
					operands.push(r);
					System.out.println(result);
					
				} else if (s.equals("/")) { 
					result = operand1 / operand2;
					String r=String.valueOf(result);
					operands.push(r);
					System.out.println(result);
				
				}
				else if(s.equals("%")){
					result=operand1%operand2;
					String r=String.valueOf(result);
					operands.push(r);
					System.out.println(result);
					
				}
				
		
			} 
			else {
				if (s.charAt(0) == '0' || s.charAt(0) == '1' || s.charAt(0) == '2' || s.charAt(0) == '3'
						|| s.charAt(0) == '4' || s.charAt(0) == '5' || s.charAt(0) == '6'
						|| s.charAt(0) == '7' || s.charAt(0) == '8' || s.charAt(0) == '9') {

					String[] splited = s.split(" ");
					int size = splited.length;

					for (int i = 0; i < size; i++) {
						int a = Integer.parseInt(splited[i]);
						operands.push(splited[i]);
				
			}
			
				}
			}
		}
		
	}
}

		
	
	