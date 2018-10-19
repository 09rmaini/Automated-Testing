package com.qa.t1;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step {
	
	static ExtentReports extent = new ExtentReports("C:\\Users\\Admin\\report\\report.html", true);
	
	WebDriver driver = null;
	

	@BeforeClass
	public static void before() {
		

	}
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
}
	
	@Given("^that you are on the create UserScreen$")
	public void that_you_are_on_the_create_UserScreen() throws Throwable {
		
		driver.get(Constant.loginURL);
		Create A = PageFactory.initElements(driver, Create.class);
		A.muser("root");
		A.mpass("root");
		
		driver.get(Constant.loggedinURL);
		Create B = PageFactory.initElements(driver, Create.class);
		B.managed();
		
		//driver.get(Constant.createUserURL);
		//Create D = PageFactory.initElements(driver, Create.class);
		//D.managedu();
		
	    // Write code here that turns the phrase above into concrete actions
		//driver.get(Constant.createUserURL);
		
		//Thread.sleep(2000);
	}

	@When("^the User details are entered on the Create UserScreen$")
	public void the_User_details_are_entered_on_the_Create_UserScreen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//ExtentTest test;
		//driver.get(Constant.createUserURL);
		
		///////////for loop for input into excel
		
	//	for (int i = 1; i < ExcelUtils.getExcelWSheet().getPhysicalNumberOfRows(); i++) {
			//test = extent.startTest("Excel Data Test: " + i);
			
			//test.log(LogStatus.INFO, "Browser started");
			
			//String username = ExcelUtils.getCellData(i, 0);
			//String password = ExcelUtils.getCellData(i, 1);
			//String confirm_password= ExcelUtils.getCellData(i, 2);
			//String full_name= ExcelUtils.getCellData(i, 3);
			//String email= ExcelUtils.getCellData(i, 4);
		
		
		
			
			driver.get(Constant.createUserURL);
			Create C = PageFactory.initElements(driver, Create.class);
			
			
			//for excel 
			//C.uname(username);
			//C.pword("password");
			//C.con("confirm_password");
			//C.fname(full_name);
			//C.email(email);
			
			//input manually
			C.uname("chris95");
			C.pword("guest");
			C.con("guest");
			C.fname(" Christopher Perrins");
			C.email("root@root.com");
			
			
			
			driver.get(Constant.createUserURL);
			Create M = PageFactory.initElements(driver, Create.class);
			
			M.uname("m4tt");
			M.pword("chickenWing");
			M.con("chickenWing");
			M.fname("matthewhunt");
			M.email("root@root.com");
			
			
			driver.get(Constant.createUserURL);
			Create D = PageFactory.initElements(driver, Create.class);
			
			D.uname("dev");
			D.pword("data");
			D.con("data");
			D.fname("Dev Gonsai");
			D.email("root@root.com");
		
			
			driver.get(Constant.createUserURL);
			Create W = PageFactory.initElements(driver, Create.class);
			
			W.uname("matthewhunt");
			W.pword("chickenWing");
			W.con("chickenWing");
			W.fname("matttt");
			W.email("root@root.com");
			
			
		//}
		
	}


	@Then("^the Username should be visible on the UsersScreen$")
	public void the_Username_should_be_visible_on_the_UsersScreen() throws Throwable {
	 
		// initialize / start the test
		ExtentTest test;
		test = extent.startTest("Verify User ID present");
				
		// add a note to the test
		test.log(LogStatus.INFO, "Browser started");
		driver.get(Constant.manage_users_page);
		Thread.sleep(5000);
		Create C = PageFactory.initElements(driver, Create.class);
		
		if(!C.get_userid().equals("chris95")) {
			test.log(LogStatus.FAIL, "ID not found");
		}
		else {
			test.log(LogStatus.PASS, "ID has been found");
		}
		assertEquals("chris95", C.get_userid());
	}

	



	@Given("^the configure button has been clicked on the profile page$")
	public void the_configure_button_has_been_clicked_on_the_profile_page() throws Throwable {
	    
		//if use id is chris95, click on 'his' configure, if more time would do for all ids
		driver.get(Constant.manage_users_page);
		Create M = PageFactory.initElements(driver, Create.class);
		M.presentid("chris95");
	    
	}

	@When("^I save the changes to the Configure Page$")
	public void i_save_the_changes_to_the_Configure_Page() throws Throwable {
	
		driver.get(Constant.chris);
		Create L = PageFactory.initElements(driver, Create.class);
		//change chris' name to:
		L.change_name("Jake Long");
	}

	
	
	@After
	public void teardown() {
		driver.close();
}

	@AfterClass
	public static void after() {
		extent.flush();
	}
	
}
