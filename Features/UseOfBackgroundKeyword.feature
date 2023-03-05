Feature: Login2
Background: Setup
Given User launch Browser
And User opens URL "https://dashboard.playboxtv.in/login"


Scenario: User should be login with valid credentials
#Given User launch Browser
#And User opens URL "https://dashboard.playboxtv.in/login"
When User add Email "ceo@tellstar.in" and password "Test@1234"
And  Login page title get captured
And user click on login button
Then Home page URL captured
And Operator Name captured
And user click on logout


Scenario Outline: User should able to login with Scenario Outline

When User add Email "<email>" and password "<password>"
And  Login page title get captured
And user click on login button
Then Home page URL captured
And Operator Name captured
And user click on logout

Examples:
|email|password|
|abc@gmail.com|abc|
|ceo@tellstar.in|Test@1234|