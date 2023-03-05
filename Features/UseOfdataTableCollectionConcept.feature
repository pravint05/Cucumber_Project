Feature: Login3

@ABCD
Scenario: User should be login with valid credentials using data table
Given User launches Browser
And User opens URL "https://dashboard.playboxtv.in/login"
When User add Email and password
|ceo@tellstar.in|
|Test@1234|
And  Login page title get captured
And user click on login button
Then Home page URL captured
And Operator Name captured
And user click on logout