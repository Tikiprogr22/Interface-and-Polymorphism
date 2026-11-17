package vehicleinterfaceproject;

public class Main {

	public static void main(String[] args) {
		
		Vehicle car = new Car();
		Vehicle motorcycle = new Motorcycle();
		
		
		Vehicle[] vehicles = {car, motorcycle};
		
		for (Vehicle vehicle : vehicles) {
			vehicle.start();
		}
	}

}
