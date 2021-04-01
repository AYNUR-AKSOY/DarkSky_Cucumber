package com.darksky.runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // plugin is for reports
         plugin = {"pretty", "html:target/site/cucumber-pretty.html","json:target/cucumber.json"},

        //plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
                //"junit:target/cucumber-reports/Cucumber.xml"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,

        // Specify step definition package path to connect with feature file

        glue = {"com/darksky/stepdefinitions"},

        features = {"src/test/resources/features"},

        tags = "@Main",

        // checking if the steps are defined or not
        //dryRun = true,

        monochrome = true
)

public class TestRunner {

}





