package Expressions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class calStepFile2 {
	@Given ("I enter {int} in the calculator")
	public void abc(int num) {
		System.out.println("I enter "+num+" in the calculator");
	}
	@When ("I press {word} symbol")
	public void abc1(String sym) {
		System.out.println("I press "+sym+" symbol");
	}
	@And ("I press {word}")
	public void abc2(String sym) {
		System.out.println("I press "+sym);
	}
	@And ("I have entered {int} in this calculator")
	public void abc3(int num) {
		System.out.println("I have entered "+num+" in this calculator");
	} 
	@Then ("The result should be {int} on the screen")
	public void abc4(int num) {
		System.out.println("The result should be "+num+" on the screen");
	}

}
