package testcases;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import stepdefinations.HomePageSteps;

@RunWith(SerenityRunner.class)
public class LoginFeatureTest {

	@Managed(driver = "appium")
	WebDriver appium;

	@Steps
	HomePageSteps registeredUser;

	@Title(value = "To check the login feature of the application")
	@Test
	public void loginTest() {

		

	}
}
