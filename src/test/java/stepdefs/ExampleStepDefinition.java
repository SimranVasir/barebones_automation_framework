package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import static org.testng.AssertJUnit.fail;

public class ExampleStepDefinition {
    @Given("^I am on the \"([^\"]*)\" login page$")
    public void i_am_on_the_something_page_on_URL() throws Throwable {
        Assert.assertEquals(8, 8);
    }

    @When("I fill in username \"([^\"]*)\" and password \"([^\"]*)\"")
    public void i_fill_in_with(String arg1, String arg2) throws Throwable {
        Assert.assertEquals(9, 9, "I fill in");
    }

    @And("^I click on the \"([^\"]*)\" button$")
    public void i_click_on_the_button(String arg1) throws Throwable {
        Assert.assertEquals("blah", "blah");
    }

    @Then("^I should see the \"([^\"]*)\" page$")
    public void i_should_see_message(String arg1) throws Throwable {
        fail("This test failed because I forcefully failed it. Muhahaha");
    }

    @And("^I should see the Accounts tab$")
    public void i_should_see_the_button(String arg1) throws Throwable {
        Assert.assertTrue(true);
    }

}
