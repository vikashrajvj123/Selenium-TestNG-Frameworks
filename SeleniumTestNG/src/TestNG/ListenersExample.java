package TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListenersExample implements ITestListener{
	
	@Override
     public void onTestStart(ITestResult result) {
    	 System.out.println("Test Case is going to execute");
     }
	@Override
    public void onTestSuccess(ITestResult result) {
   	 System.out.println("Test Case is passed");
    }
	@Override
    public void onTestFailure(ITestResult result) {
   	 System.out.println("Test Case is Failed");
    }
	@Override
    public void onTestSkipped(ITestResult result) {
   	 System.out.println("Test Case is Skipped");
    }
	@Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
   	 System.out.println("Test Case is pass");
    }
	@Override
    public void onStart(ITestContext context) {
   	 System.out.println("Before everything");
    }
	@Override
    public void onFinish(ITestContext context) {
   	 System.out.println("After everything");
    }
	

}
