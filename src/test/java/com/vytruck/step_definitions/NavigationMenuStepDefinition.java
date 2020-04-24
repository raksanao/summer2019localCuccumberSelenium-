package com.vytruck.step_definitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationMenuStepDefinition {

    @When("user goes to Fleet  Vehicles")
    public void user_goes_to_Fleet_Vehicles() {
        System.out.println("User in Fleet ");
    }

    @Then("the url should be https:\\/\\/qa{int}.vytrack.com\\/calendar\\/entity")
    public void the_url_should_be_https_qa_vytrack_com_calendar_entity(Integer int1) {
        System.out.println("Verify the url");
    }
    @When("user goes to Marketing,Campaign")
    public void user_goes_to_Marketing_Campaign() {
        System.out.println("User navigates to Marketing Campaign");
    }

    @Then("the url should be https:\\/\\/qa{int}.vytrack.com\\/calendar\\/event")
    public void the_url_should_be_https_qa_vytrack_com_calendar_event(Integer int1) {
        System.out.println("Verify url");
    }

    @When("user goes to Activity,Calendar")
    public void user_goes_to_Activity_Calendar() {
        System.out.println("User in activities Calendar");
    }

    @Then("the url should be https:\\/\\/qa{int}.vytrack.com\\/calendar\\/activity")
    public void the_url_should_be_https_qa_vytrack_com_calendar_activity(Integer int1) {
        System.out.println("Verify the url");
    }


}
