#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Login feature
  Scenario: Sucessful login with valid credentials
    Given I want to open chrome browser
    And User opens URL "https://admin-demo.nopcommerce.com/login"
    When User enters email as "admin@yourstore.com" and password as "admin"
    And click on login button
    Then page title should be "Dashboard / nopCommerce administration"
    When user clicks on logout link
    Then page title should be "Your store. Login"
    And close the browser
  Scenario Outline: Login Data Drievn Test
    Given I want to open chrome browser
    And User opens URL "https://admin-demo.nopcommerce.com/login"
    When User enters email as "<email>" and password as "<pwd>"
    And click on login button
    Then page title should be "Dashboard / nopCommerce administration"
    When user clicks on logout link
    Then page title should be "Your store. Login"
    And close the browser

    Examples: 
      | email                  | pwd   |
      | admin@yourstore.com    | admin |
      | admin123@yourstore.com | admin |
