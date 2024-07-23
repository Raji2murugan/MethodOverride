package methodOverride;

/**
 * 2. In Vehicle hierarchy, add methods like start and stop in Vehicle and override them in Child classes.
 */
public class VehicleMain {

	public static void main(String[] args) {
		Vehicle myCar = new Car();
		Vehicle myBike = new Bike();

		myCar.start();
		myCar.stop();

		myBike.start();
		myBike.stop();
	}

}

class Vehicle {
	public void start() {
		System.out.println("Vehicle is starting");
	}

	public void stop() {
		System.out.println("Vehicle is stopping");
	}
}

class Car extends Vehicle {
	@Override
	public void start() {
		System.out.println("Car is starting");
	}

	@Override
	public void stop() {
		System.out.println("Car is stopping");
	}
}

class Bike extends Vehicle {
	@Override
	public void start() {
		System.out.println("Bike is starting ");
	}

	@Override
	public void stop() {
		System.out.println("Bike is stopping");
	}
}
