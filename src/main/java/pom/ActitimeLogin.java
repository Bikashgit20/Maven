package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.ExcelLibrary;

public class ActitimeLogin implements AutoConstant
{
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement password;
	
	@FindBy(xpath="//input[@name='remember']")
	private WebElement checkbox;
	
	@FindBy(id="loginButton")
	private WebElement login;
	
	public ActitimeLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	public void loginmethod() throws IOException
	{
		username.sendKeys(ExcelLibrary.cellvalue(excelpath, sheetname, 1, 0));
		password.sendKeys(ExcelLibrary.cellvalue(excelpath, sheetname, 1, 1));
		checkbox.click();
		login.click();
		
	}


}
