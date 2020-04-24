package com.vytruck.step_definitions;

import com.vytruck.pages.DashboardPage;
import com.vytruck.pages.LoginPage;
import com.vytruck.utilities.BrowserUtils;
import com.vytruck.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ContactsStepDef {

    @Then("user should see the following menu options")
    public void user_should_see_the_following_menu_options(List<String> list) {

        System.out.println("List of size"+list.size());
        System.out.println(list);

        DashboardPage dashboardPage=new DashboardPage();
       List<String>actual=new ArrayList<>();
       for(WebElement option:dashboardPage.menuOptions){
           actual.add(option.getText());
       }
Assert.assertEquals(list,actual);
    }
    @When("user  login using following credentials")
    public void user_login_using_following_credentials(Map<String,String> userData) {

        System.out.println(userData);
        System.out.println("Firstname "+userData.get("fname"));
        System.out.println("Lastname "+userData.get("lname"));
        System.out.println("Username "+userData.get("username"));
        System.out.println("Password "+userData.get("password"));
        LoginPage loginPage=new LoginPage();
        loginPage.login(userData.get("username"),userData.get("password"));
    }

    }

