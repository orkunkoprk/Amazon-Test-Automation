Feature: Amazon Test Automation
  Scenario: Go To Website And Begin Test Functions

    Given Go to Amazon Website
    And Are we on Home Page
    And Search for a phone in search box
    And Are we on Product Page
    And Click a Product
    And Are we on Products Detail Page
    And Add product to Cart
    And Check product count on cart image on Home Page
    When Go to Cart Page
    Then Check if the product was added to cart successfully
