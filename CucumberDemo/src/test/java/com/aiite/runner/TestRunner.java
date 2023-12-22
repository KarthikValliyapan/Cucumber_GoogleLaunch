package com.aiite.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (features = "D:\\MavenProjectWorkspace\\CucumberDemo\\src\\test\\java\\com\\aiite\\feature\\Google.feature"
							 , glue = "com.aiite.stepdefinitions"
							 , dryRun = false
							 , plugin = {"pretty", "html:target/cucmber_reports"
								})
public class TestRunner
	{
		
	}
