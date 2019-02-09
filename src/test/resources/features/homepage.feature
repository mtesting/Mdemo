Feature: Open the home page with different browsers


  @smoketest
  Scenario: Open the homepage in Firefox browser
    Given Open homepage in Firefox Browser
    When Homepage is opened close the browser

  @functionaltest
  Scenario:Open gmail
    Given Open homepage in Firefox Browser
    When open gmail
    When user enters text in search field and navigates to expected url
    Then close the browser

