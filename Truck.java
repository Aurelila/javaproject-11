//Nancy McCoy   2242343

package mccoy11;

public class Truck extends Vehicle {
	//Variables
	private String type;
	private int capacity;
	private Motor motor;
	
	//Constructor
	public Truck(String make,String model, int year, double price, String type, int capacity, Motor motor) {
		super (make, model, year, price);
		this.type = type;
		this.capacity = capacity;
		this.motor = motor;
	}
	
	public void Description() {
		System.out.println("In this application, a Truck is a vehicle designed to transport cargo");
	}
	@Override
	public String toString() {
		//Prints out the data
		return super.toString() +  " " + "Truck type:"
		+ type + " " + "capacity:" + capacity + " " + "Motor:" + motor;
	}
	
}


