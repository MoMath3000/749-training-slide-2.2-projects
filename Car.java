public class Car {
	public double tripDistanceFeet;

	public Car(double tripDistanceFeet) {
		this.tripDistanceFeet = tripDistanceFeet;
	}

	public void getTripDistanceMeters() {
		System.out.println(UnitConverter.feetToMeters(tripDistanceFeet));
	}
}
