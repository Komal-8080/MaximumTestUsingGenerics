package MaximumCheck;

import org.junit.Assert;
import org.junit.Test;

public class MaximumCheckTest {

	// test to check if maximum value is at first position.
	@Test
	public void MaximumValueAtFirstPosition() {
		MaximumCheck maximumCheck = new MaximumCheck();
		float maximum = maximumCheck.maximumValue(15.2f, 12.4f, 14.7f);
		Assert.assertEquals(15.2, maximum, 0.001);
	}

	// test to check if maximum value is at second position.
	@Test
	public void MaximumValueAtSecondPosition() {
		MaximumCheck maximumCheck = new MaximumCheck();
		float maximum = maximumCheck.maximumValue(12.45f, 15.2f, 14.7f);
		Assert.assertEquals(15.2, maximum, 0.001);
	}

	// test to check if maximum value is at third position.
	@Test
	public void MaximumValueAtThirdPosition() {
		MaximumCheck maximumCheck = new MaximumCheck();
		float maximum = maximumCheck.maximumValue(12.45f, 14.7f, 15.2f);
		Assert.assertEquals(15.2, maximum, 0.001);
	}
}
