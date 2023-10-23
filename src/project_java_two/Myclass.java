package project_java_two;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Myclass {
	WebDriver driver = new ChromeDriver();

	

	String URL = "https://www.saucedemo.com/";
	
@BeforeTest
public void mySetup () {
	driver.get(URL);
	driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
	
	//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	
	//driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	driver.findElement(By.name("login-button")).click();
	List<WebElement> addtoCartButtons = driver.findElements(By.className("btn_primary"));
	for (int i=0; i<addtoCartButtons.size();i=i+2) {
	
		addtoCartButtons.get(i).click();
		
		
	}
	
}


	



@Test
public void myFirstTest() {
	
}

@AfterTest
public void myPostTesting() {}
}