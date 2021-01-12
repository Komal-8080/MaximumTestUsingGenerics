package MaximumCheck;

import org.junit.Assert;
import org.junit.Test;

public class MaximumCheckTest {

	// test to check if maximum value is at first position.
	@Test
	public void MaximumValueAtFirstPosition() {
		MaximumCheck maximumCheck = new MaximumCheck();
		String maximum = maximumCheck.maximumValue("banana", "kiwi", "apple");
		Assert.assertEquals("kiwi",maximum);
	}

	// test to check if maximum value is at second position.
	@Test
	public void MaximumValueAtSecondPosition() {
		MaximumCheck maximumCheck = new MaximumCheck();
		String maximum = maximumCheck.maximumValue("kiwi", "banana", "apple");
		Assert.assertEquals("kiwi",maximum);
	}

	// test to check if maximum value is at third position.
	@Test
	public void MaximumValueAtThirdPosition() {
		MaximumCheck maximumCheck = new MaximumCheck();
		String maximum = maximumCheck.maximumValue("apple", "kiwi", "bananan");
		Assert.assertEquals("kiwi",maximum);
	}
}
