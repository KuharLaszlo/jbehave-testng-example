package testng.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.examples.core.testng.Calculator;
import org.testng.Assert;

public class CalculatorSteps {
    private Calculator calculator;

    @Given("I have an addition function")
    public void given_I_have_an_addition_function() {
        calculator = new Calculator();
    }

    @When("I type <addend>")
    public void when_I_type_addend(@Named("addend")double addend) {
        calculator.setAddend(addend);
    }

    @When("I type <summand>")
    public void when_I_type_summand(@Named("summand")double summand) {
        calculator.setSummand(summand);
    }

    @Then("show <result>")
    public void then_show_result(@Named("result")double result) {
        Assert.assertEquals(calculator.getResult(), result);
    }

}
