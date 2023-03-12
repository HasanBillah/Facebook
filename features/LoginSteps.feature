@Login
Feature: Facebook Login Functionality

  Background: Open Facebook Homepage
    Given I open facebook homepage

  Scenario Outline: 
    When I enter username "<username>"
    And I enter password "<password>"
    Then I verify user account on the screen

    Examples: 
      | username          | password |
      | sample1@gmail.com | abra     |
      | sample2@gmail.com | dabra    |
