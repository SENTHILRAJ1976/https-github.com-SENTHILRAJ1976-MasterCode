package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import pombaseclass.BaseClass;

public class ViewLead extends BaseClass {
	

	public ViewLead(ChromeDriver driver) {
		this.driver=driver;
	}

	public ViewLead verifyFirstName() {

		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();

		if (text.contains("Senthil")) {
			System.out.println("The Firstname is correct");
		} else {
			System.out.println("The Firstname is wrong");
		}
		
		return this;
	}
}
