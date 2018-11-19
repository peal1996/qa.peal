Feature: validate shopping credentials

  Background: 
    Given openbrower
    And navigate to url

  Scenario: shopping with eshopper24 first demo
    When user click katan sare
    And user click sceond one
    And user click one first one
    And click buy now
    Then close browser

  Scenario: shopping with eshopper24 sceond demo
    When user click on menu
    And user click on slik saree
    And user click on first product
    And click buy now
    Then close browser
