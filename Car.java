package week1.day1;

public class Car {
	public static void main(String[] args) {
		String carName = "Maruti Suzuki";
		String modelName = "Baleno";
		char variant = 'P';
		byte noOfWheels = 4;
		short fuelTankCapacity = 40;
		int insuranceNumber = 12345678;
		long chasisNumber = 123456789098765L;
		float totalKmUsed = 235.67f;
		System.out.println("Car Name: "+carName);
		System.out.println("Model of the Car: "+modelName);
		System.out.println("Variant:" +variant);
		System.out.println("No of Wheels: "+noOfWheels);
		System.out.println("Fuel Capacity: "+fuelTankCapacity + "Litres");
		System.out.println("Valid Insurance Number: "+insuranceNumber);
		System.out.println("Engine Chasis Number: "+chasisNumber);
		System.out.println("Total Km Driven: "+totalKmUsed+"Km");
	}


}
