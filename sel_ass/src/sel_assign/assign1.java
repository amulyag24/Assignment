package sel_assign;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
/*
 * 1.open browser
 * 2.pass url(bluestone)
 * 3.move the cursor all jewellery
 * 4.select kadas and click on it
 * 5.select any kada
 * 6.click on buy now
 * 7.capture wheather error msg is displayed or not(not displayed fail test case)
 * 8.close the browser
 */
public class assign1 {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		WebElement alljew = driver.findElement(By.xpath("//nav[@class='wh-navbar']/ul//a[contains(text(),'All Jewellery ')]"));
		action.moveToElement(alljew).perform();
		driver.findElement(By.xpath("//div[@class='wh-submenu-header']/following-sibling::ul//a[contains(text(),'Kadas')]")).click();
		driver.findElement(By.xpath("//div[@class='inner pd-gray-bg']/div/div/a/img[@alt='The Udith Kada For Him']")).click();
	    driver.findElement(By.xpath("//input[@value='Buy Now']")).click();
	    
	    
	   WebElement errmsg1 = driver.findElement(By.xpath("//div[@class='formErrorContent']"));
	 if(!errmsg1.isDisplayed())
	 {
		 System.out.println("testcase failed");
	 }
	String errmsg = errmsg1.getText();
	   System.out.println(errmsg);
	
	}
}
