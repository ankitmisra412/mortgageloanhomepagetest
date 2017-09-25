@HomeMortgagePageTest

Feature: Home Mortgage Loan Calculator Test
  

  Scenario Outline: Test
    Given I open home mortgage loan home page
    When I input loan amount as "<LoanAmount>"
    And I input interest rate as "<InterestRate>"
    And I input mortgage term as "<MortgageTerm>"
    And I input home value as "<HomeValue>"
    And I click next
    And I input annual taxes as "<AnnualTaxes>"
    And I input annual insurance as "<AnnualInsurance>"
    And I input pmi as "<PMI>"
    And I click show result button
	Then I verify monthly principal and value payments to be "<value1>"
	Then I verify monthly loan to value ratio to be "<value2>"
	Then I verify total monthly payments to be "<value3>"
	
	Examples:
	
	|LoanAmount|InterestRate|MortgageTerm|HomeValue|AnnualTaxes|AnnualInsurance|PMI |value1  |value2|value3  |
	|200000    |5           |30          |235000   | 2000      |1865           |0.52|$1,073.64 |85.11%|$1,482.39 |