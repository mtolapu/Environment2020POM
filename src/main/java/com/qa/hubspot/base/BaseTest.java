package com.qa.hubspot.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.qa.hubspot.pages.LoginPage;

public class BaseTest {

	public WebDriver driver;
	public Properties prop;
	public BasePage basePage;
	public LoginPage loginPage;

	//@Parameters("browser")
	@Parameters({"browser","env"})
	@BeforeTest
	public void setUp(@Optional String browserName, @Optional String environment ) {
		System.out.println("Running on Environment: ---->" + environment);
		basePage = new BasePage();
	//	prop.setProperty("env", environment);
		prop = basePage.init_prop(environment);
		prop.setProperty("browser", browserName);
		//prop.setProperty("env", environment);
		driver = basePage.init_driver(prop);
		loginPage = new LoginPage(driver);
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
