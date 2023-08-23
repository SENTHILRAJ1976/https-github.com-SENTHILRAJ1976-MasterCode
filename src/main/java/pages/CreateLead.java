package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import pombaseclass.BaseClass;

public class CreateLead extends BaseClass {
	
	
	public CreateLead(ChromeDriver driver) {
		this.driver = driver;
	}

	public CreateLead enterFirstName(String fName) {
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys(fName);
		return this;
	}

	public CreateLead enterLastName(String lName) {
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys(lName);
		return this;
	}

	public CreateLead enterCompanyName(String compName) {
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys(compName);
		return this;
	}

	public ViewLead clickCreateLeadButton() {
		driver.findElement(By.className("smallSubmit")).click();
		return new ViewLead(driver);
	}
}
