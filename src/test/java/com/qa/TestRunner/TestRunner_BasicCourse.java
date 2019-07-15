package com.qa.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)				
@CucumberOptions(features="./src/test/resources/BasicCourse.feature",
                 glue={"com.qa.stepDefinitions"},
                 tags = {"@BasicCourseTest"}
                 )
public class TestRunner_BasicCourse {
	
}
