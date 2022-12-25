package ai.Dalalnew.Util;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import ai.Dalalnew.TestBase.TestBase;

public class ListnersSetup extends TestBase implements ITestListener  {

	@Override
	public void onTestStart(ITestResult result) {
		logger.info("testcase execution starts"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info("testcase execution success"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.info("testcase execution failed"+result.getName());
		UtilClass.screenshot(result.getName()+System.currentTimeMillis());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.info("testcase execution skipped"+result.getName());
	}

	
	
	

	



	


}
