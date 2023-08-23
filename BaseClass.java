package baseclass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import utils.ReadExcelEditLead;

public class BaseClass {
	
	public static ChromeDriver driver;
	public static ExtentReports extent;
	public String testCase, testDescription, testAuthor, testCategory;
	public ExtentTest test;
	
	@BeforeSuite;
	public  void startReport() {
		ExtentHtmlReporter repo = new ExtentHtmlReporter("./report/result.html");
		repo.setAppendExisting(true);
		extent=new ExtentReports();
		extent.attachReporter(repo);
	}
	
	@BeforeClass;
	public void testDetails() {
		
		test=extent.createTest(testCase, testDescription);
		test.assignAuthor(testAuthor);
		test.assignCategory(testCategory);
	}
	
	public void reportStep(String msg, String stat) {
		if(status.equalsIgnorecase("pass")){
			test.pass(msg);
		}
		else if (status.equalsIgnorecase("fail")) {
			test.fail(msg);
		}
		
	}
	
	
	
	@AfterSuite;
	public void stopReport() {
		extent.flush();
	}
	
	
	
	

//		public String excelname;
//		public static ChromeDriver driver;
//		@BeforeMethod
//		public void preConditions() {
//		driver  = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://leaftaps.com/opentaps/control/main");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		
//		}
//		@DataProvider(name="fetchdata")
//		public String[][] getData() throws IOException {
//			
//			 return ReadExcelEditLead.readData(excelname);
//		}
//		
//		
//		@AfterMethod		
//		public void postConditions() {
//			driver.close();
//
//		
//		
//		}
		
		
		
}
