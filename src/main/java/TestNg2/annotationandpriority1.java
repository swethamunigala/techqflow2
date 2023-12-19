package TestNg2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
public class annotationandpriority1 {
	WebDriver swetha;
	@Test(priority=1 )
	void OpenApp()
	{
		swetha=new EdgeDriver();
		swetha.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		swetha.get("https://opensource-demo.orangehrmlive.com");
	}
	@Test(priority=2)
	void Login()
	{
		
	swetha.findElement(By.name("username")).sendKeys("Admin");
	swetha.findElement(By.name("password")).sendKeys("admin123");
	swetha.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	}	
	@Test(priority=3)
	void search()
	{
		System.out.println("This is search");
	}
	@Test(priority=4)
	void CloseApp()
	{
		swetha.close();
	}
}