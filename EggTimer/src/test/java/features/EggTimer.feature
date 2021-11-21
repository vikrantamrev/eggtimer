Feature: Validate countdown functionality.

  	#Test case to verify start time functionality
  	Scenario: Test countdown functionality
    Given user opens the web application
    When user provides valid time "<Time>"
    And user clicks on start button
    Then countdown timer starts
    And user is prompted with alert
    Then close the browser
    
    Examples:
    | Time |
    | 25 |