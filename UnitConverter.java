package project1;

public class UnitConverter {
  public static final double metersPerFoot = 0.3048;
	public static final double degreesPerRadian = 180 / Math.PI;
	
  public static double radiansToDegrees(double radians) {
  	return radians * degreesPerRadian;
  }
  public static double feetToMeters(double feet) {
  	return feet * metersPerFoot;
  }
}
