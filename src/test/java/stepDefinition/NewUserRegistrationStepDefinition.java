package stepDefinition;

import baseUtil.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewUserRegistrationStepDefinition extends BaseClass {
	
	@Given("User is on the CMS Enterprise Portal page")
	public void user_is_on_the_cms_enterprise_portal_page() {
	   newUserRegistration.landing_on_homePage();
	}

	@When("User click on New User Registration Button")
	public void user_click_on_new_user_registration_button() {
	   newUserRegistration.direct_to_new_user_registration_step_one();
	}

	@Then("User navigate to Step one of the enrollment process")
	public void user_navigate_to_step_one_of_the_enrollment_process() {
	    newUserRegistration.step_one_title_and_header_validation();
	}

	@When("User complete Step one process")
	public void user_complete_step_one_process() {
	   newUserRegistration.select_application_on_step_one_and_navigate_to_step_two();
	}

	@Then("User navigate to Step two of the enrollment process")
	public void user_navigate_to_step_two_of_the_enrollment_process() {
	   newUserRegistration.step_two_title_and_header_validation();
	}

	@When("User complete Step two process")
	public void user_complete_step_two_process() {
	    newUserRegistration.validate_step_two();
	}

	@When("click on Next Button")
	public void click_on_next_button() {
	    newUserRegistration.click_next_button_on_step_two();
	}

	@Then("User navigate to Step three of the enrollment process")
	public void user_navigate_to_step_three_of_the_enrollment_process() {
	    newUserRegistration.step_three_title_and_header_validation();
	}



}
