Feature: Create etsy
  Scenario Outline: etsy creating

    Given go to website
    And click einloggen button
    And type the "<email>" and "<password>"
    And click the remember_me button
    And click the einloggen button
    And navigate over the titles
    When click to product
   Then window should be switch


    Examples:

    |email|password|
    |omerozdemir7274@gmail.com|omerozdemir111|
