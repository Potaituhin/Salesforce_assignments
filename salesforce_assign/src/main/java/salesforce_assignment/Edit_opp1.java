package salesforce_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit_opp1 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);



		driver.get("https://login.salesforce.com/");



		driver.manage().window().maximize();



		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");



		driver.findElement(By.id("password")).sendKeys("Tuna@123");



		driver.findElement(By.id("Login")).click();



		Thread.sleep(20000);



		 driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		 



		Thread.sleep(10000);
		
		//driver.findElement(By.xpath("(//p[contains(text(),'Sales')])[3]")).click();
		driver.findElement(By.xpath("(//p[@class='slds-truncate'])[7]")).click();
		
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//a[@class='slds-context-bar__label-action dndItem'])[2]")).click();
		
	}
}
		
		