package TestNg2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class beforeandafter {
	WebDriver swetha;
	@BeforeMethod
	void OpenApp()
	{
		swetha=new EdgeDriver();
		swetha.get("https://www.demo.guru99.com/v4");
	}
	@Test(priority=1)
	void Login()
	{
		
	swetha.findElement(By.name("uid")).sendKeys("mngr539010");
	swetha.findElement(By.name("password")).sendKeys("gUzahEt");
	swetha.findElement(By.name("btnLogin")).click();
	}	
	@Test(priority=2)
	void search()
	{
		System.out.println("This is search");
	}
	@AfterMethod
	void CloseApp()
	{
		swetha.close();
	}
}
