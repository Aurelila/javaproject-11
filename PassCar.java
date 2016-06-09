//Nancy McCoy   2242343

package mccoy11;

public class PassCar extends Vehicle {
	//Variables
	private int numPass;
	private boolean AC;
	private Motor motor;
	
	
	//Constructor
	public PassCar (String make, String model, int year, double price, int numPass, boolean AC, Motor motor) {
		super (make, model, year, price);
		this.numPass = numPass;
		this.AC = AC;
		this.motor = motor;
	}
	
	public void Description() {
		System.out.println("In this application, a passenger car is an every day vehicle registered to an individual");
	}
	@Override
	public String toString() {
		return super.toString() +    " " + "PassCar numPass:"+
		"  "+ numPass + " " + "AC:" + AC  + " " + "Motor" + motor;
	}
}


