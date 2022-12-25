package ai.Dalanew.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.Dalalnew.TestBase.TestBase;

public class LoginPageLayer extends TestBase {
	public LoginPageLayer()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='email']")
	private WebElement username_text;
	@FindBy(xpath="//input[@name='password']")
	private WebElement password_text;
	@FindBy(xpath="//button[text()='Log In']")
	private WebElement login_bttn;
	
	public void enterUserName(String username)
	{
		username_text.sendKeys(username);
	}
	public void enterPassword(String pass)
	{
		password_text.sendKeys(pass);
	}
	public void clickOnButton()
	{
		login_bttn.click();
	}
	
	
	


}
