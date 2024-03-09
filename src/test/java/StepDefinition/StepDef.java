package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.Mobile_to_pincode;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef extends BaseClass {

	///////////////////////// Mobile number validation/verification

	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		Mtp = new Mobile_to_pincode(driver);

	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);

	}

	@When("User enters Mobile number as {string}")
	public void user_enters_mobile_number_as(String mob) {
		Mtp.EnterMobileno(mob);

	}

	@When("Click on Calculate premium")
	public void click_on_calculate_premium() {
		Mtp.ClickCalculatePremiumBtn();
	}

	@Then("Section title should be {string}")
	public void section_title_should_be(String ExpTitle) {
		String ActTitle = driver.findElement(By.xpath("//div[@class='step2 form-step Cr-PreQuote-InsuredDetails']"))
				.getText();
		if (ActTitle.contains(ExpTitle)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Then("close browser")
	public void close_browser() {
		driver.quit();
	}

	//////////////////////// Invalid Mobile numbers scenario

	@Then("Error message should be {string}")
	public void error_message_should_be(String ErrMess) {
		String ActErrMess = driver.findElement(By.xpath("//small[@class='error_msg mobile_error']")).getText();
		if (ActErrMess.contains(ErrMess)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	////////////////////////// Member selection Validation Relation combination for
	////////////////////////// self

	@When("Select member self")
	public void select_member_self() {
//		String member_pre_selection_value = driver.findElement(By.xpath("//div//input[@id='self']"))
//				.getAttribute("value");
//System.out.println(member_pre_selection_value);
//		Mtp.SelectSelf(member_pre_selection_value);
	}

	@When("Select member {string}")
	public void select_member(String Member) {
		
		System.out.println(Member);
		switch (Member) {
		
		case "self": {
			String member_pre_selection_value = driver.findElement(By.xpath("//div//input[@id='self']"))
					.getAttribute("value");

			Mtp.SelectSelf(member_pre_selection_value);
			break;

		}
		case "spouse": {
			Mtp.SelectSpouse();
			break;

		}
		case "father": {
			Mtp.SelectFather();
			break;

		}
		case "mother": {
			Mtp.SelectMother();
			break;
		}
		case "father-in-law": {
			Mtp.SelectfatherInLaw();
			break;
		}
		case "mother-in-law": {
			Mtp.SelectMotherInLaw();
			break;
		}
		}
	}

	@When("Click on continue button")
	public void click_on_continue_button() {

		Mtp.ClickContinueBtn();
	}

	@Then("Combination Error message should be {string}")
	public void combination_error_message_should_be(String ExpErrMess) {
		String ActErrMess = driver.findElement(By.xpath("//div[@class='step2 form-step Cr-PreQuote-InsuredDetails']")).getText();
		System.out.println(ActErrMess);
		if (ActErrMess.contains(ExpErrMess)) {
			Assert.assertTrue(true);
		} else {
			System.err.println(ActErrMess);
			System.err.println(ExpErrMess);
			Assert.assertTrue(false);
			
		}

	}

}
