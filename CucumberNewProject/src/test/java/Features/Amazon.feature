Feature: Amazon.com
  Scenario: Amazon.com Adding product
    Given User is on homepage
    When Click accept cookies
    When Click the search button
    When Write product name
    When Click search button
    When Filter for shipped for Amazon
    When Filter for Apple
    When Click the first product
    When Add to cart
    When Check at cart page


