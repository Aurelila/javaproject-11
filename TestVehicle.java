//Nancy McCoy  2242343

package mccoy11;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;

public class TestVehicle {

	public static void main(String[] args) {
		//All vehicles
		Motor m1 = new Motor("EcoBoost", 6, 310, 2.3);
		Motor m2 = new Motor("Hemi", 8, 707, 5.7);
		Motor m3 = new Motor("B58", 6, 800, 7.8);
		Vehicle v1 = new PassCar("Ford", "Mustang", 2017, 50000, 2, true, m1);
		Truck v2 = new Truck("Chevrolet", "Silverado", 2016, 30000, "pickup", 4, m2);
		Vehicle v3 = new PassCar("BMW", "3 Series", 2015, 40000, 4,  true, m3);
		
		//Calls showVechicle method
		showVehicle(v1, v2, v3);
		
	}
	
	
	public static void showVehicle(Vehicle v1, Truck v2, Vehicle v3) {
		//Prints the data
		v1.Description();
		System.out.println(v1.toString() + '\n');
		v2.Description();
		System.out.println(v2.toString() + '\n');	
		v3.Description();
		System.out.println(v3.toString()+ 'n');
		
		System.out.println("Output from ArrayList");
		Object[] array = {v1, v2, v3 };				
		ArrayList<Object> list = new ArrayList<>(Arrays.asList(array));
		for (Object array1 : list) {
		    System.out.println(array1);
		
	}

}
}
