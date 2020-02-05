Feature: Testme App

  Background: User try to login

  @Login
  Scenario Outline: Login Page
    Given User navigating to login page
    When User enters "<Username>"  "<Password>"
    Then User gets Registeration successfull

    Examples: 
      | Username |  | Password    |
      | admin |  | Password456 |

  @Addingcategory
  Scenario: Adding the new category
    Given Admin adding the new category
    When Admin gives category name as
      | Sports |
    Then admin gives category description as 
      |sports|  
      
      @AddingSubCategory
      Scenario: Adding SubCategory 
      Given Adding subcategory under the Sports
      When Admin selecting the category as sports
      Then subcategory names as "<subcategory>"  "<subcategory>" 
        |subcategory|
        |Basketball|
        |Volleyball|
