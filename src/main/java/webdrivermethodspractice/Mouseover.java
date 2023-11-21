package webdrivermethodspractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\firefox driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.hyrtutorials.com/");
		Thread.sleep(3000);
		//MOUSE OVER

Actions ac=new Actions(driver);
ac.moveToElement(driver.findElement(By.xpath("//ul[@id='nav1']/child::li[4]"))).perform();
Thread.sleep(10000);
driver.findElement(By.linkText("XPath Practice")).click();
System.out.println("XPath Practice has been selected");
Thread.sleep(3000);
driver.close();
	}

}
