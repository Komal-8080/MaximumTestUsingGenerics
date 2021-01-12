package MaximumCheck;

import org.junit.Assert;
import org.junit.Test;

public class MaximumCheckTest {

	// test to check if maximum value is at first position.
	@Test
	public void MaximumValueAtFirstPosition() {
		MaximumCheck maximumCheck = new MaximumCheck();
		int maximum = maximumCheck.maximumValue(15, 12, 14);
		Assert.assertEquals(15, maximum);
	}

	// test to check if maximum value is at second position.
	@Test
	public void MaximumValueAtSecondPosition() {
		MaximumCheck maximumCheck = new MaximumCheck();
		int maximum = maximumCheck.maximumValue(12, 15, 14);
		Assert.assertEquals(15, maximum);
	}

	// test to check if maximum value is at third position.
	@Test
	public void MaximumValueAtThirdPosition() {
		MaximumCheck maximumCheck = new MaximumCheck();
		int maximum = maximumCheck.maximumValue(12, 14, 15);
		Assert.assertEquals(15, maximum);
	}
}
