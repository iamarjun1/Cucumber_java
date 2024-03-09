Feature: Mobile number verification

Background: Steps common for Mobile number Scenarios
    Given user launch chrome browser
    When User opens URL "https://www.careinsurance.com/product/care-supreme"


@Regression
Scenario Outline: Invalid Mobile number scenerio
    And User enters Mobile number as "<MobNum>"
    And Click on Calculate premium
    Then Error message should be "Please enter a valid mobile number"
    And close browser
    
Examples: 
    |MobNum| 
    |0| 
    |1| 
    |2| 
    |3| 
    |4| 
    |5| 
    
@Sanity    
Scenario: Valid Mobile number scenerio
    And User enters Mobile number as "9988776655"
    And Click on Calculate premium
    Then Section title should be "Select Family members"
    #And close browser


        

    