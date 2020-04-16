package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "F:/LipsitaGitWorkspace/project/src/test/java/feature/login.feature", //the path of the feature files
			glue={"StepDefination"} ,//the path of the step definition files	
			monochrome = true, //display the console output in a proper readable format
			strict = true,   //it will check if any step is not defined in step definition file
			dryRun =false,		//to check the mapping is proper between feature file and step def file			
          format= {"pretty","html:test-output","json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}   
			//{"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}
			// generate different types of reporting
			//"junit:junit-xml/cucumber.xml"

		) 
	

public class TestRunner {

}
