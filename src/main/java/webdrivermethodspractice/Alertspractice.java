package webdrivermethodspractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Alertspractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\firefox driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.hyrtutorials.com/p/alertsdemo.html");
		Thread.sleep(3000);
		//MOUSE OVER

/*Actions ac=new Actions(driver);
ac.moveToElement(driver.findElement(By.xpath("//ul[@id='nav1']/child::li[4]"))).perform();
Thread.sleep(10000);
driver.findElement(By.linkText("Alerts")).click();
System.out.println("Alerts has been selected");
Thread.sleep(3000);
// Simple Alert
System.out.println(driver.findElement(By.id("output")).getText());
driver.findElement(By.id("alertBox")).click();
Thread.sleep(3000);
Alert a=driver.switchTo().alert();
System.out.println(a.getText());
a.accept();
System.out.println(driver.findElement(By.id("output")).getText());
driver.close();
//Compound Alert
System.out.println(driver.findElement(By.id("output")).getText());
driver.findElement(By.id("confirmBox")).click();
Thread.sleep(3000);
Alert a=driver.switchTo().alert();
System.out.println(a.getText());
//a.accept();
a.dismiss();
System.out.println(driver.findElement(By.id("output")).getText());
driver.close();*/
//Prompt Alert
System.out.println(driver.findElement(By.id("output")).getText());
driver.findElement(By.id("promptBox")).click();
Thread.sleep(3000);
Alert a=driver.switchTo().alert();
System.out.println(a.getText());
a.sendKeys("Bolli Dinesh");
Thread.sleep(3000);
a.accept();
//a.dismiss();
System.out.println(driver.findElement(By.id("output")).getText());
driver.close();

	}

}
