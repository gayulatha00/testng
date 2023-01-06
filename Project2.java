package org.project2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Project2 {
	WebDriver driver;
	@Test
	private void Test1() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
}
@Test
  private void test2() {
	String actualTitle=driver.getTitle();
	String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
    Assert.assertEquals(actualTitle,expectedTitle);

}
  private void verifyLogo() {
	boolean displayed = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).isDisplayed();
	Assert.assertTrue(displayed);

}
@AfterMethod
  private void close() {
	driver.close();

}
	

}
