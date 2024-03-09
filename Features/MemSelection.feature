Feature: Member Selection

Background: Steps common for All Scenarios
    Given user launch chrome browser
    When User opens URL "https://www.careinsurance.com/product/care-supreme"
    And User enters Mobile number as "9988776655"
    And Click on Calculate premium
    Then Section title should be "Select Family members"
 

@Sanity
Scenario: Relation mismatch combination of self

#Given Section title should be "Select Family members"
When Select member self 
And Select member "<MemberRelationship>"
And Click on continue button 
Then Combination Error message should be "Relationship combination not allowed"
#Then Combination Error message should be "Relationship combination not allowed"
And close browser

Examples: 
|MemberRelationship|
|father|
|mother|
|father-in-law|
|mother-in-law|