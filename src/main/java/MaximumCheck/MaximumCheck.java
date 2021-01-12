package MaximumCheck;

public class MaximumCheck {

	//UC1: Method to check Maximum value from 3 Strings
	public String maximumValue(String x, String y, String z) {
		String max = x;
		if (y.compareToIgnoreCase(max) > 0) {
			max = y;
		} if (z.compareToIgnoreCase(max) > 0) {
			max = z;
		} 
		System.out.println(max +" is Maximum");
		return max;
	}
}
