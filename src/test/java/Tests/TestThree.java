package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Resources.Setup;

public class TestThree extends Setup{
WebDriver driver;
	@Test
	public void Test3() {
		System.out.println("test 3 is running");
		driver=browserLaunch();
		driver.get("https://chatgpt.com/");
System.out.println("Changing the code");
	}
	@AfterMethod
	public void AfterTest3() {
		driver.close();
	
	}
}
