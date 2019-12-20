package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
//everything runs through cukes runner
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json"},//option used for reporting purposes after every run cucumber generate json report in target folder
        features = "src/test/resources/features/",//address that has the path where the features are
        glue = "com/vytrack/step_definitions",//glues java side with features files
        dryRun= false ,  //dry run decides if java code excecutes.

        tags="@login"
)

public class CukesRunner {
}
