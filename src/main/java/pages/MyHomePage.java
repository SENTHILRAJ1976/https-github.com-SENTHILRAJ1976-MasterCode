package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import pombaseclass.BaseClass;

public class MyHomePage extends BaseClass {
	public MyHomePage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public MyLeads clickLead() {
		driver.findElement(By.linkText("Leads"));
		return new MyLeads(driver);
	}

}
