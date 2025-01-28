package week2.HomeAssginments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountNew {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/");
		WebElement UserName =  driver.findElement(By.id("username"));
		UserName.sendKeys("Demosalesmanager");
		WebElement PassWord =  driver.findElement(By.id("password"));
		PassWord.sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();

		// to click CRM/SF
		driver.findElement(By.xpath("//div[@id=\"button\"]")).click();
		//to click Account  Tab
		driver.findElement(By.linkText("Accounts")).click();
		//to click Create account
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Testleaf_2025_Jan18-4");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[@id='numberEmployees']")).sendKeys("25");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("LeafTaps");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
//		String Title = driver.getTitle();
//		System.out.println(Title);
		
		String title = driver.getTitle();
		System.out.println(title);
//		if (title.contains(""))
		
//		if(driver.getTitle().contains("Account Details")) {
//			System.out.println("Title Vrified");
//		}else
//			System.out.println("Title Not Verified");
		
		driver.close();
		
	}
}
		



