package com.vytrack.step_definitions;

import com.vytrack.utilities.Driver;
import gherkin.ast.Scenario;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks {
    @Before
    public void setUp() {//prints before each scenario
        System.out.println("\tThis is coming from before scenario");//
    }

    @After
    public void tearDown() {// it runs even if the test passes or not
        System.out.println(" This is coming from after scenario\n");
        Driver.closeDriver();
    }

    @After("@sales_manager")
    public void tearDownSalesManager(Scenario scenario) {
        System.out.println("This is coming from after scenario for sales managers\n");
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }
        Driver.closeDriver();
    }
}
