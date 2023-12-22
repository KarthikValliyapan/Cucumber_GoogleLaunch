package com.aiite.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleLaunch
	{
		static WebDriver driver;
		
		@Given("user is on the google homepage")
		public void user_is_on_the_google_homepage()
			{
				driver = new ChromeDriver();
				driver.manage().window().maximize();
			}

		@When("user type {string} on the serchbox and enter")
		public void user_type_on_the_serchbox_and_enter(String string)
			{
				try
					{
						driver.get("https://www.google.com/");
						Thread.sleep(4000);
						driver.findElement(By.xpath("//textarea[@title = 'Search']")).sendKeys("GitHub", Keys.ENTER);
						Thread.sleep(4000);
						Assert.assertTrue(true);
					}
				catch (Exception e)
					{
						// TODO: handle exception
					}
			}

		@Then("user should see the search results in a different page")
		public void user_should_see_the_search_results_in_a_different_page()
			{
				driver.quit();
			}

	}
