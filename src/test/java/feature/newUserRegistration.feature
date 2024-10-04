#Author: tofael483@gmail.com
#Date: October 10th, 2024
@newUserRegistration
Feature: As an user
  I want to enroll as a new user to CMS Enterprise Portal
  In order to get access of the Applications feature

  Background: User navigates to Application URL
    Given User is on the CMS Enterprise Portal page

	@sanity
  Scenario: User click on Next Button in Step Two by puting value in each field
    When User click on New User Registration Button
    Then User navigate to Step one of the enrollment process
    When User complete Step one process
    Then User navigate to Step two of the enrollment process
    When User complete Step two process
    And click on Next Button
    Then User navigate to Step three of the enrollment process
    # This is declarative BDD, not line by line description
