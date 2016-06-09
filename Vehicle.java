//Nancy McCoy   2242343

package mccoy11;

public class Vehicle {
	//Variables
	private String make;
	private String model;
	private int year;
	private double price;
	
	//Constructor
	public Vehicle(String make, String model, int year, double price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	
	public void Description() {
		System.out.println("In this application, a passenger car is an every day vehicle registered to an individual");
	}
	
	public String toString() {
		return "make:" + make + " " + "model:" + model + " " + "year:" + year + " "+ "price:" + price;
	}
}