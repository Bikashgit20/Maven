package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import generics.BaseTest;
import pom.ActitimeLogin;


public class TestActitimeLogin extends BaseTest
{
	@Test
	public void submit() throws IOException
	{
		
		
		ActitimeLogin enter=new ActitimeLogin(driver);
		enter.loginmethod();
	}

}
