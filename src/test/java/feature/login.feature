Feature: Cogmento CRM Login feature

Scenario Outline: Cogmento CRM Login Scenario

Given user is already on Login page
When Title of login page is Cogmento CRM
Then User enters "<username>" and "<password>"
Then User clicks on Login button
Then User is on HomePage

Examples: 
    | username | password |
    | lipsita.987@gmail.com | indu123$ |
    
    
    Scenario: Create contact page
