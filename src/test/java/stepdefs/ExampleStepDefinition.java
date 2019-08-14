package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import org.testng.Assert;

public class ExampleStepDefinition {
    @Given("^I am on the something page on URL$")
    public void i_am_on_the_something_page_on_URL() throws Throwable {
        Assert.assertEquals(8,8);
    }

    @When("I fill in {word} blah {word} with blah")
    public void i_fill_in_with(String arg1, String arg2) throws Throwable {
        Assert.assertEquals(9, 9, "I fill in");

    }

    @When("^I click on the \"([^\"]*)\" button$")
    public void i_click_on_the_button(String arg1) throws Throwable {
        Assert.assertEquals("blah", "blah");
    }

    @Then("^I should see \"([^\"]*)\" message$")
    public void i_should_see_message(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should see the \"([^\"]*)\" button$")
    public void i_should_see_the_button(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
