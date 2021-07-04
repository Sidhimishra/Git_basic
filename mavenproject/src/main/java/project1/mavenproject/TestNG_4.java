package project1.mavenproject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_4 {
	
	@Test
	
	 void Test1(){
		
		
		System.setProperty("webdriver.chrome.driver", "C://Users//sidhi//Downloads//Chromedriver_win32//chromedriver.exe") ;
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		Reporter.log("Launch URL");
		String ExpectedTitle ="Google";
		
		Reporter.log("Expected Title");
		String ActualTitle =driver.getTitle();
		
		Reporter.log("Expected Title");

		Assert.assertEquals(ActualTitle, ExpectedTitle);
		driver.quit();
		
	}

}
