package com.vytruck.step_definitions;

import com.vytruck.pages.ContactsPage;
import com.vytruck.pages.DashboardPage;
import com.vytruck.pages.LoginPage;
import com.vytruck.utilities.BrowserUtils;
import com.vytruck.utilities.ConfigurationReader;
import com.vytruck.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ContactFeatureStepDEf {
    @Given("a driver logged in")
    public void a_driver_logged_in() {
        Driver.get().get(ConfigurationReader.get("url"));
        String username=ConfigurationReader.get("driver_username");
        String password=ConfigurationReader.get("driver_password");
        new LoginPage().login(username,password);

    }

    @When("user goes to {string} {string}")
    public void user_goes_to(String tab, String module) {
new DashboardPage().navigateToModule(tab,module);
    }

    @Then("default page number should be {int}")
    public void default_page_number_should_be(Integer count) {
        System.out.println("Count"+count);
        ContactsPage contactsPage=new ContactsPage();
        BrowserUtils.waitFor(5);
    String text= contactsPage.pageCount.getAttribute("value");
    Integer actualCount=Integer.parseInt(text);
        Assert.assertEquals(count,actualCount);

    }



}
