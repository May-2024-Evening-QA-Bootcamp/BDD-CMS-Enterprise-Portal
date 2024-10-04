package stepDefinition;

import baseUtil.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogInStepDefinition extends BaseClass {
	
	@Given("User is on the CMS Enterprise Portal homepage URL")
	public void user_is_on_the_cms_enterprise_portal_homepage_url() {
	   logIn.validateLogoAndTitle();
	}

	@When("User enter UserId in the UserId field")
	public void user_enter_user_id_in_the_user_id_field() {
	    logIn.validateUserId();
	}

	@When("User enter Password in the Password field")
	public void user_enter_password_in_the_password_field() {
	    logIn.validatePassword();
	}

	@When("User click the check box of I agree to the Terms and Conditions")
	public void user_click_the_check_box_of_i_agree_to_the_terms_and_conditions() {
	    logIn.validateCheckBox();
	}

	@When("User finally click on Login Button")
	public void user_finally_click_on_login_button() {
	    logIn.validateLogin();
	}

	@Then("User will navigate to multi factor authentication modal")
	public void user_will_navigate_to_multi_factor_authentication_modal() {
	    logIn.landingOnMultiFactorAuthentication();
	}
	
	@When("User enter UserId as {string}")
	public void user_enter_user_id_as(String string) {
	    logIn.validateUserId(string);
	}

	@When("User enter Password as {string}")
	public void user_enter_password_as(String string) {
	    logIn.validatePassword(string);
	}



}
