Feature:  Google homepage

Scenario: Validate the google search functionality
Given user is on the google homepage
When user type "Git" on the serchbox and enter
Then user should see the search results in a different page
