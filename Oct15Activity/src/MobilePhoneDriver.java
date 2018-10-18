//***************************************************************
//Author: Shelby Max
//File: MobilePhoneDriver.java
//
//Purpose: To create an instance of "Mobile Phone" with user 
//		   input and print out that information along with a 
//		   phone call and text message, looping until the user 
//		   is finished
//***************************************************************
import java.util.Scanner;

public class MobilePhoneDriver {

	public static void main(String[] args) {
		
		String answer = "";
		Scanner myScan = new Scanner(System.in);
		
		do {
			System.out.println("Who was the manufacturer of your phone?");
			String manufacturer = myScan.nextLine();
			
			System.out.println("What model is your phone?");
			String model = myScan.nextLine();
			
			System.out.println("How much did your phone cost?");
			String price = myScan.nextLine();
			
			System.out.println("Who is your phone's carrier?");
			String carrier = myScan.nextLine();
			
			MobilePhone myPhone = new MobilePhone(manufacturer, model, price, carrier);
			
			System.out.println(myPhone.toString());
			
			System.out.println("Enter a phone number to call");
			String phoneNumber = myScan.nextLine();
			System.out.println("\n" + myPhone.Call(phoneNumber) + "...\n");
			
			System.out.println("Enter a text message to send");
			String txtMessage = myScan.nextLine();
			System.out.println("\nMessage Sent: " + myPhone.Text(txtMessage) + "\n");
			
			System.out.println("Would you like to enter a new phone? (Y/N)");
			answer = myScan.nextLine();
			
		}while(answer.equalsIgnoreCase("Y"));
		
		myScan.close();//closes scanner
	}

}
