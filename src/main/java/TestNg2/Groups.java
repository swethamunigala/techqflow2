package TestNg2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Groups {
	WebDriver swetha;
	@Test(priority=1,groups={"sanity"})
	void OpenApp()
	{
		swetha=new EdgeDriver();
		swetha.get("https://www.demo.guru99.com/v4");
	}
	@Test(priority=2,groups={"sanity","regression"})
	void Login()
	{
		
	swetha.findElement(By.name("uid")).sendKeys("mngr539010");
	swetha.findElement(By.name("password")).sendKeys("gUzahEt");
	swetha.findElement(By.name("btnLogin")).click();
	}	
	@Test(priority=3,groups={"regression"})
	void search()
	{
		System.out.println("This is search");
	}
	@Test(priority=4,groups={"sanity"})
	void CloseApp()
	{
		swetha.close();
	}
}
