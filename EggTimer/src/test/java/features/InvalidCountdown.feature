Feature: Validate invalid countdown functionality.

		Scenario: Test case to verify invalid start time
    Given user opens the web application
    When user keeps the time field blank
    And user clicks on start button
    And verify tooltip message
    Then user provides string value in time field
    And user clicks on start button
    And verify tooltip message
    Then close the browser