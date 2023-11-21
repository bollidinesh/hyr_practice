package webdrivermethodspractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Framespractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\firefox driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.hyrtutorials.com/p/frames-practice.html");
		Thread.sleep(3000);
		//MOUSE OVER

/*Actions ac=new Actions(driver);
ac.moveToElement(driver.findElement(By.xpath("//ul[@id='nav1']/child::li[4]"))).perform();
Thread.sleep(10000);
driver.findElement(By.partialLinkText("Frames")).click();
System.out.println("Frames Practice has been selected");
Thread.sleep(3000);*/
		
//FRAMES
driver.switchTo().frame("frm2");
System.out.println("frame2 has been selected");
Thread.sleep(3000);
driver.findElement(By.id("firstName")).sendKeys("bolli");
Thread.sleep(2000);
driver.switchTo().defaultContent();
driver.close();

	}

}
