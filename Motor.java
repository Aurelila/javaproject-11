//Nancy McCoy   224343

package mccoy11;

public class Motor {
	//Variables
	private String name;
	private int cylinders;
	private int bhp;
	private double displacement;
	
	//Constructor
	public Motor(String name, int cylinders, int bhp, double displacement) {
		this.name = name;
		this.cylinders = cylinders;
		this.bhp = bhp;
		this.displacement = displacement;
	}
	
	public String toString() {
		return "Motor:" + name + " " + "cylinders=" + cylinders + " " + "bhp=" + bhp + " " + "displacement=" + displacement;
		 
	}
	
}
