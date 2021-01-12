package MaximumCheck;

import java.awt.print.Printable;

public class MaximumCheck {

	//UC1: Method to check Maximum value from 3 Floating Values
	public Float maximumValue(Float x, Float y, Float z) {
		Float max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		} if (z.compareTo(max) > 0) {
			max = z;
		} 
		System.out.println(max +" is Maximum");
		return max;
	}
}
