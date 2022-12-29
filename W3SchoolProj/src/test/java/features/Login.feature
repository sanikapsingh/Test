Feature: Login

    Scenario: Login with correct credentials
    Given Navigate to URL
    When Enter username and Password and click on Login button
    Then user should land on Homepage

    
    

    Scenario: Login with wrong credentials
    Given Navigate to URL
    When Enter incorrect username and Password and click on Login button
    Then user should land on Homepage and verify url
    