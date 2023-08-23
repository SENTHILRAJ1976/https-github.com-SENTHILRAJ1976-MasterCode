package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import pombaseclass.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public LoginPage enterUsername(String uname) {
		
		/* This is Method 1
		 * driver.findElement(By.id("username")).sendKeys("DemoCsr"); 
		 * LoginPage lp = new LoginPage();
		 * return lp;
		 */
		
		//This is Method 2
		driver.findElement(By.id("username")).sendKeys(uname); 
		return this;
	}
	
	public LoginPage enterPassword(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
		return this;
	}
	
	
	public HomePage clickOnLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//This is method 1
//		HomePage hp = new HomePage();
//		return hp;
		
		//This is method 2
		return new HomePage(driver);
		
		
		
	}
	
}
