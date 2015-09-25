package org.jbehave.examples.core.testng;

/**
 * Created by Chris on 2015/9/25.
 */
public class Calculator {
    private double addend, summand;
    public void setAddend(double addend) {
        this.addend = addend;
    }

    public void setSummand(double summand) {
        this.summand = summand;
    }

    public double getResult() {
        return addend + summand;
    }
}
