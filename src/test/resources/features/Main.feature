@Main
 Feature: darksky Login


   Scenario:
     Given user at main page
     When user enters location
     And user find minimum temperature and verify it's value
     Then user find maximum temperature and verify it's value
