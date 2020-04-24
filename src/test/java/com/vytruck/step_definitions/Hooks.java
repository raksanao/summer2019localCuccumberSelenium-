package com.vytruck.step_definitions;

import com.vytruck.utilities.ConfigurationReader;
import com.vytruck.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void setup(){
        System.out.println("\nThis is coming before scenario");
    }
    @After()
    public void teardown(){
        System.out.println("This is coming after scenario \n");
        Driver.closeDriver();
    }
    @After("@sales_manager")
    public void teardownSalesManager(){
        System.out.println("This is coming for after scenario for sales manager \n");
    }
}
