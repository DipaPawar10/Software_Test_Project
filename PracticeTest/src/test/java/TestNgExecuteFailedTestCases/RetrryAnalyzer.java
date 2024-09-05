package TestNgExecuteFailedTestCases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetrryAnalyzer implements IRetryAnalyzer{
	//counter to keep track of retry attempts
	int counterForRetryAttempts = 0;
	
	//set max limit for every retry
	int setMaxLimitForRetry = 3;
	
	//method to retry failed test cases
	public boolean retry(ITestResult result) {
		if(!result.isSuccess()) {
			if(counterForRetryAttempts < setMaxLimitForRetry) {
				counterForRetryAttempts++;
				return true;
			}
		}
		return false;
	}

}
