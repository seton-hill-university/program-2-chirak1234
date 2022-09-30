package programTeo;
import java.util.*;

public class programTwo{
	public static void main(String args[]) {
		
		Scanner number = new Scanner(System.in);
		
		System.out.print("What is your first number?");
		int number1 = number.nextInt();
		
		System.out.print("What is your second number?");
		int number2 = number.nextInt();
		
		System.out.print("What is your third number?");
		int number3 = number.nextInt();
	
		
		
		System.out.println("Menu of Actions:");
		System.out.println("1.) Add");
		System.out.println("2.) Subtract");
		System.out.println("3.) Divide");
		System.out.println("4.) Multiply");
		System.out.println("5.) Exit");
		
		Scanner option = new Scanner(System.in);
		System.out.print("Menu choice?");
		
		int function = option.nextInt();
		
		switch (function) {
		
			case 1: 
				int equal = number1 + number2;
				
				System.out.println("The number " + number1 + " and " + number2 +  " added together equals: " + equal);
				
				if (equal > number3) {
					
					System.out.println(equal + " is greater than " + number3 +".");
				}
				else if (equal == number3){
					
					System.out.println(equal + " equals to " + number3 +".");
				}
				else if (equal < number3){
					
					System.out.println(equal + " is not greater than " + number3 +".");
				}
				break;
			case 2:
				int equal1 = number1 - number2;
				
				System.out.println("The number " + number1 + " and " + number2 + " subtracted from eachother equals: " + equal1);
				
				if (equal1 > number3) {
					
					System.out.println(equal1 + " is greater than " + number3 +".");
				}
				else if (equal1 == number3){
					
					System.out.println(equal1 + " equals to " + number3 +".");
				}
				else if (equal1 < number3){
					
					System.out.println(equal1 + " is not greater than " + number3 +".");
				}
				break;
			case 3:
				
				double equal2 = number1 / number2;
				
				System.out.println("The number " + number1 + " and " + number2 + " divided equals: " + equal2);
				
				if (equal2 > number3) {
					
					System.out.println(equal2 + " is greater than " + number3 +".");
				}
				else if (equal2 == number3){
					
					System.out.println(equal2 + " equals to " + number3 +".");
				}
				else if (equal2 < number3){
					
					System.out.println(equal2 + " is not greater than " + number3 +".");
				}
				break;
			case 4:
				
				int equal3 = number1 * number2;
				
				System.out.println("The number " + number1 + " and " + number2 + " multiplied equals: " + equal3);
				
				if (equal3 > number3) {
					
					System.out.println(equal3 + " is greater than " + number3 +".");
				}
				else if (equal3 == number3){
					
					System.out.println(equal3 + " equals to " + number3 +".");
				}
				else if (equal3 < number3){
					
					System.out.println(equal3 + " is not greater than " + number3 +".");
				}
				
				break;
			case 5:
				
				System.out.println("Exiting");
				break;
		}
		
	}
}
