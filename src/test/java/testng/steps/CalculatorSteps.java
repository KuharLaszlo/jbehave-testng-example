package testng.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.examples.core.testng.Calculator;
import org.testng.Assert;

public class CalculatorSteps {
    private Calculator calculator;

    @Given("我有一個加法功能")
    public void given我有一個加法功能() {
        calculator = new Calculator();
    }

    @When("我輸入<加數>")
    public void when我輸入加數(@Named("加數")double 加數) {
        calculator.setAddend(加數);
    }

    @When("我輸入<被加數>")
    public void when我輸入被加數(@Named("被加數")double 被加數) {
        calculator.setSummand(被加數);
    }

    @Then("顯示<相加結果>")
    public void then顯示相加結果(@Named("相加結果")double 結果) {
        Assert.assertEquals(calculator.getResult(), 結果);
    }

}
