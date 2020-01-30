Feature: Pixel store pos

  Background: 
    Given sales executive logged into the machine
    
  
    Scenario: Registeration with Store
Given Alex is existing customer
And He has good purchase record with store
When Alex provides his mobile number
Then Alex should get registeration success



 Scenario: Refund of a microWave
    Given Alex purchased microwave for 100 dollars 
    And Alex has a receipt
    When Alex returns the faulty microwave
    Then Alex got refund of 100 dollars
    


  @RegressionTest
    Scenario: Executive signup
    Given exexcutive is at the signup registeration
    When executive provides "admin" and "admin" 
    Then signup successfull
    
@Smoke @RegressionTest
Scenario: shopping cart
 Given executive added the items to cart
 When items price is calculated
 Then bill is generated with final amount


@FunctionalTest
  Scenario Outline: Sales executive signIn
    When Sales executive provides "<user>" and "<password>" as credentials
    Then Login is successful

    Examples: 
      | user    | password    |
      | Lalitha | password123 |
      | John    | Ravi1234   |
  

      
  @datadriven
 Scenario: Search a product
 When Larry searches for products in the search field
     |Head|
     |Hand|
     |Lap|
Then Larry verifies the product availability 
      