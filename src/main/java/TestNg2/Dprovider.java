package TestNg2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dprovider {
	WebDriver swetha;
	@Test(priority=1 )
	void OpenApp()
	{
		swetha=new EdgeDriver();
		swetha.get("https://www.demo.guru99.com/v4");
	}
	@Test(priority=2,dependsOnMethods={"OpenApp"},dataProvider="DP")
	void Login(String email,String PWD)
	{
		
	swetha.findElement(By.name("uid")).sendKeys(email);
	swetha.findElement(By.name("password")).sendKeys(PWD);
	swetha.findElement(By.name("btnLogin")).click();
	}	
	@Test(priority=3,dependsOnMethods={"Login"})
	void search()
	{
		System.out.println("This is search");
	}
	@Test(priority=4,dependsOnMethods={"OpenApp"})
	void CloseApp()
	{
		swetha.close();
	}
	@DataProvider (name="DP")
	String [][]LoginData()
	{
	String data[][]={
			{"varun@gmail.com","yuio"},
			{"124@gmail.com","huij"},
			{"mngr539010","gUzahEt"}
					
	}; return data;
	}
}