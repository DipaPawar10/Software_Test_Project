package TestNgExecuteFailedTestCases;
import org.testng.Assert;
import org.testng.annotations.*;

public class FailedTestCaseExample {
	@Test
	public void TestCase01() {
		Assert.assertTrue(false);
	}
	@Test
	public void TestCase02() {
		Assert.assertTrue(false);
	}
	@Test
	public void TestCase03() {
		Assert.assertTrue(true);
	}
}
