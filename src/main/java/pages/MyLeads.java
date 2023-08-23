package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import pombaseclass.BaseClass;

public class MyLeads extends BaseClass {
	
	public MyLeads(ChromeDriver driver) {
		this.driver = driver;
	}

	public CreateLead clickCreateLeads() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLead(driver);
	}
	
	
}
