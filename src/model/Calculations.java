package model;

public interface Calculations {
	
	// Find the height by using the hypotenuse and length
	public double findHeight(String hypo, String length);
	
	// Find the length by using the hypotenuse and height
	public double findLength(String hypo, String height);
	
	// Find the hypotenuse by using length and height
	public double findHyp(String height, String length);

}
