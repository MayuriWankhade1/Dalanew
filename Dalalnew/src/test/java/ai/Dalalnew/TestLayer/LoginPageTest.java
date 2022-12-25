package ai.Dalalnew.TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import ai.Dalalnew.TestBase.TestBase;
import ai.Dalanew.PageLayer.LoginPageLayer;

public class LoginPageTest extends TestBase {
	@Test
	public void verifyLogin() throws InterruptedException
	{

		LoginPageLayer lg= new LoginPageLayer();
		lg.enterUserName("amarwaghmare573@gmail.com");
		lg.enterPassword("Test@1234");
		lg.clickOnButton();
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		String expectedUrl="https://apps.dalalstreet.ai/dashboard";
		Assert.assertEquals(url, expectedUrl);
		
	}
	
	
}
