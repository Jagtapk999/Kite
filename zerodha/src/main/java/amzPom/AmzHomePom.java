package amzPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmzHomePom {
	@FindBy(xpath=("//a[@id='nav-link-accountList']"))private WebElement signin;
	
	public AmzHomePom(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSignIn() {
		signin.click();
	}

}
