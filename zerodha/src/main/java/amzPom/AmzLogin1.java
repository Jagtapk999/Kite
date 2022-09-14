package amzPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmzLogin1 {
	@FindBy(xpath=("//input[@id='ap_email']"))private WebElement mobNo;
	@FindBy(xpath=("//input[@id='continue']"))private WebElement ctnBtn;
	@FindBy(xpath=("//span[contains(text(),'We')]"))private WebElement mobErrMsg;
	@FindBy(xpath=("//div[contains(text(),'Enter')]"))private WebElement noMob;
	
	public AmzLogin1(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void enterMobNo(String mob) {
		mobNo.sendKeys(mob);
	}
	public void clickOnCtnBtn() {
		ctnBtn.click();
	}
	public String getMobErrMsg() {
		String mErr = mobErrMsg.getText();
		return mErr;
	}
	public String getnoMobErr() {
		String nMob = noMob.getText();
		return nMob;
	}


}
