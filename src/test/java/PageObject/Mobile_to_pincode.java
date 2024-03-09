package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mobile_to_pincode {

	WebDriver Qdriver;

	public Mobile_to_pincode(WebDriver RDriver) {
		Qdriver = RDriver;
		PageFactory.initElements(RDriver, this);

	}

	@FindBy(id = "mobile_no")
	WebElement Mobileno;

	@FindBy(xpath = "//button[@class='btn_sticky_mobile btn_custom quote_btn custum_common_btn']")
	WebElement CalculatePremium;

	public void EnterMobileno(String number) {
		Mobileno.sendKeys(number);
	}

	public void ClickCalculatePremiumBtn() {
		CalculatePremium.click();
	}

	////////////////// For Member Selection

	@FindBy(xpath = "//label[@for='self']")
	WebElement Self;

	@FindBy(xpath = "//label[@for='spouse']")
	WebElement Spouse;

	@FindBy(xpath = "//label[@for='son']")
	WebElement Son;

	@FindBy(xpath = "//label[@for='daughter']")
	WebElement Daughter;

	@FindBy(xpath = "//label[@for='father']")
	WebElement Father;

	@FindBy(xpath = "//label[@for='mother']")
	WebElement Mother;

	@FindBy(xpath = "//label[@for='father-in-law']")
	WebElement FatherInLaw;

	@FindBy(xpath = "//label[@for='mother-in-law']")
	WebElement MotherInLaw;
	
	@FindBy(xpath = "//button[@class='btn_sticky_mobile btn_custom step2_continue custum_common_btn']")
	WebElement ContinueBtn;
	

	public void SelectSelf(String member_pre_selection_value) {
		
		if(!member_pre_selection_value.contentEquals("1"))
		{
			Self.click();
		}
	}

	public void SelectSpouse() {
		Spouse.click();
	}

	public void SelectSon() {
		Son.click();
	}

	public void SelectDaughter() {
		Daughter.click();
	}

	public void SelectFather() {
		Father.click();
	}

	public void SelectMother() {
		Mother.click();
	}

	public void SelectfatherInLaw() {
		FatherInLaw.click();
	}

	public void SelectMotherInLaw() {
		MotherInLaw.click();
	}

	public void ClickContinueBtn() {
		ContinueBtn.click();
		
	}
	
}
