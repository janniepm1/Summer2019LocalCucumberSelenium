package com.vytrack.step_definitions;


import com.google.gson.stream.JsonToken;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationMenuStepDefinitions {
    @When("the user goes to Fleet, Vehicles")
    public void the_user_goes_to_Fleet_Vehicles() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Opening Fleet, Vehicles ");
    }

    @Then("the url should be https:\\/\\/qa{int}.vytrack.com\\/entity\\/Extend_Entity_Carreservation")
    public void the_url_should_be_https_qa_vytrack_com_entity_Extend_Entity_Carreservation(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Verify URL for Vehicles");
    }

    @When("the user goes to Marketing, Campaigns")
    public void the_user_goes_to_Marketing_Campaigns() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Opening marketing, Campaigns  ");
    }

    @Then("The url should be http:\\/\\/qa{int}.vytrack.com\\/campaign\\/")
    public void the_url_should_be_http_qa_vytrack_com_campaign(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Verifying URL for campaigns ");
    }

    @When("the user goes to Activities, Calendar Events")
    public void the_user_goes_to_Activities_Calendar_Events() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Opening Activities, Calendar Events");
    }

    @Then("the url should be https:\\/\\/qa{int}.vytrak.com\\/calendar\\/event")
    public void the_url_should_be_https_qa_vytrak_com_calendar_event(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Verifying URL for Calendar events ");
    }




}