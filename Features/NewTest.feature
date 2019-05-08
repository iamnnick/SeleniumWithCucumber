@Tagexample
Feature: Reset functionality on login page of Application				


Scenario Outline: Verification of reset button with numbers of credential


Given Open the Chrome browser and launch the application				


When Enter the Username <username>and Password <password>				


Then Reset the credential	 by clicking reset button					

Examples:                      		

|username  |password         |		

|User1     |password1        |		

|User2     |password2        |		

|User3     |password3        |