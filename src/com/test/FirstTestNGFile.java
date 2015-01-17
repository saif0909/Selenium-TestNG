package com.test;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

/**
 * @author Saiful Azam
 * @Email saif0909@yahoo.com
 */
@SuppressWarnings("deprecation")
public class FirstTestNGFile {

	public String baseUrl = "http://newtours.demoaut.com/";
	public WebDriver driver = new FirefoxDriver();
	public String expected = null;
	public String actual = null;

	@BeforeTest
	public void beforeTest() {
		driver.get(baseUrl);
		driver.manage().window().maximize();
	}

	@BeforeMethod
	public void beforeMethod() {
		expected = "Welcome: Mercury Tours";
		actual = driver.getTitle();
		Assert.assertEquals(expected, actual);
	}

	@Test(priority = 0)
	public void testOne() {
		driver.findElement(By.linkText("REGISTER")).click();
		expected = "Register: Mercury Tours";
		actual = driver.getTitle();
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 1)
	public void testTwo() {
		driver.findElement(By.linkText("SIGN-ON")).click();
		expected = "Sign-on: Mercury Tours";
		actual = driver.getTitle();
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 2)
	public void testThree() {
		driver.findElement(By.linkText("SUPPORT")).click();
		expected = "Under Construction: Mercury Tours";
		actual = driver.getTitle();
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 3)
	public void testFore() {
		driver.findElement(By.linkText("CONTACT")).click();
		expected = "Under Construction: Mercury Tours";
		actual = driver.getTitle();
		Assert.assertEquals(actual, expected);
	}

	@AfterMethod
	public void afterMethod() {
		driver.findElement(By.linkText("Home")).click();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
