package com.vytruck.step_definitions;

import com.vytruck.pages.LoginPage;
import com.vytruck.utilities.ConfigurationReader;
import com.vytruck.utilities.Driver;
import io.cucumber.java.en.Given;

import org.junit.Assert;


public class AccountTypeStepDEf {
    @Given("the user logs in as a {string}")
    public void the_user_logs_in_as_a(String userType) {
        Driver.get().get(ConfigurationReader.get("url"));
        System.out.println("userType = " + userType);
        String username= null, password = null;
        switch (userType) {
            case "driver":
                username = ConfigurationReader.get("driver_username");
                password = ConfigurationReader.get("driver_password");
                break;
            case "sales manager":
                username = ConfigurationReader.get("sales_manager_username");
                password = ConfigurationReader.get("sales_manager_password");
                break;
            case "store manager":
                username = ConfigurationReader.get("store_manager_username");
                password = ConfigurationReader.get("store_manager_password");
                break;
            default:
                // Assert.fail --> just fails the test
                Assert.fail("Wrong user type provided");
        }
        new LoginPage().login(username, password);

    }


}


