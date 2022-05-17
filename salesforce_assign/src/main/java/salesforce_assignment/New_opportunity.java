package salesforce_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class New_opportunity {
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Tuna@123");
		driver.findElement(By.id("Login")).click();
		//driver.findElement(By.class("slds-icon slds-icon_x-small")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//div//lightning-primitive-icon/*[@class='slds-icon slds-icon_x-small']")).click();
		driver.findElement(By.linkText("New Opportunity")).click();
		driver.findElement(By.cssSelector("input[maxlength=\"120\"]")).sendKeys("E&Y");
		//driver.findElement(By.cssSelector("(input[type=\"text\"])")).sendKeys("E&Y GDS");
		driver.findElement(By.cssSelector("input[id=\"4067:0\"]")).click();



		
		
		
	}
	}

	


