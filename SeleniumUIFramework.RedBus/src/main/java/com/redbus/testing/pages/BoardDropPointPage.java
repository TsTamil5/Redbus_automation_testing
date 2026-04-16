package com.redbus.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BoardDropPointPage {

	@FindBy(xpath  = "//div[text()='Chennai - Siruseri SIPCOT (N)']")
	private WebElement boardingPoint;
	
	@FindBy(xpath = "//div[text()='Bengaluru - Attibelle Toll (W)']")
	private WebElement destinationPoint;
	
	@FindBy(xpath = "//button[text()='Fill passenger details']")
	private WebElement navigateToPassengerInfo;
	
}
