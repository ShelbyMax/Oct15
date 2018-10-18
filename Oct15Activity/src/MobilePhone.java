//***************************************************************
//Author: Shelby Max
//File: MobilePhone.java
//
//Purpose: To create constructors and methods for 
//		   "MobilePhoneDriver.java" that will run using its 
//		   attributes.
//***************************************************************
public class MobilePhone {
	
	//attributes
	private String manufacturer;
	private String model;
	private String price;
	private String carrier;
	
	//constructor
	public MobilePhone(String manufacturer, String model, String price, String carrier) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.price = price;
		this.carrier = carrier;
	}
	
	//Method for calling phone numbers
	public String Call(String phoneNumber) {
		return "I am calling " + phoneNumber;
	}
	
	//Method for texting messages
	public String Text(String txtMessage) {
		return txtMessage;
	}
	
	//toString
	public String toString() {
		return "Manufacturer: " + manufacturer + 
				"\nModel: " + model + 
				"\nPrice: " + price + 
				"\nCarrier: " + carrier + "\n";
	}


}
