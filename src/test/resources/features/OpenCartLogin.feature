Feature: Opencart Login Function

Scenario: Valid Login
When User is on opencart home page
And User navigates to login page
Given User login with "karthikrajaram2210@gmail.com" and "P@ssw0rd1"
Then User navigate to My Account page


Scenario: Search Item

Given User navigate to My Account page
And User search item
	| phone |
Then User navigate to search result page

Scenario: Add to Cart
Given User navigate to search result page
When User Add Item to cart
Then Item must be available in cart