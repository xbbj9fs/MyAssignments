package week2.HomeAssginments;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class CreateLead {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/");
		WebElement UserName =  driver.findElement(By.id("username"));
		UserName.sendKeys("Demosalesmanager");
		WebElement PassWord =  driver.findElement(By.id("password"));
		PassWord.sendKeys("crmsfa");
		driver.findElement(By.xpath("//form[@id=\"login\"]/p[3]/input")).click();

		// to click CRM/SF
		driver.findElement(By.xpath("//div[@id=\"button\"]")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("FirstName");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("LastName");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CompanyName");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Title");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		if(driver.getTitle().contains("Create")) {
			System.out.println("Title is verified");
		}else
			System.out.println("Not an expected Title");
		driver.close();
		
		
		
		
		
		
		
		

	}

}
