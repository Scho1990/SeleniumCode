package com.B2BOverstock.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewOverstockAccountPage {
	
	@FindBy()
	WebElement textboxEmailId;
	
	@FindBy()
	WebElement textboxPassword;
	
	@FindBy()
	WebElement buttonCreateAccount;
	
	@FindBy()
	WebElement linkSignIn;

}
