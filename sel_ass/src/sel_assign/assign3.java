/*
 * senario3
 * open browser
 * pass url bluestone
 * goto chat our experts and maximize
 * maxmize chat our experts 
 * enter the details and click on start chat
 * enter some message
 * and print reply in output
 */
package sel_assign;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assign3 {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(1000);
	    driver.switchTo().frame("livechat-compact-view");
	    WebElement chat = driver.findElement(By.id("open-label"));
	    Thread.sleep(1000);
	    chat.click();
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame("livechat-full-view");
	    Thread.sleep(1000);

	    driver.findElement(By.id("name")).sendKeys("amulya");
	    driver.findElement(By.id("email")).sendKeys("amulyag24@gmail.com");
	    driver.findElement(By.xpath("//input[contains(@id,'container')]")).sendKeys("1234");
	    driver.findElement(By.xpath("//input[@value='Start the chat']")).click();
	    WebElement msg      =driver.findElement(By.name("files"));
	    Thread.sleep(2000);
	    msg.sendKeys("hi...");
	    msg.sendKeys(Keys.ENTER);
	    
	}
}
