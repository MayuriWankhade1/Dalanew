package ai.Dalalnew.Util;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import ai.Dalalnew.TestBase.TestBase;

public class UtilClass extends TestBase {
	public static void screenshot(String filename)
	{
	TakesScreenshot ts= (TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	
	File des=new File("G:\\Dalalnew\\Screenshots\\"+filename+".png");
	try {
		FileHandler.copy(src, des);
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
	
	
		
	}

}
