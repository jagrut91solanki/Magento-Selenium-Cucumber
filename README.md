# Magento E-Commerce Automation Testing

This repository contains automated test scripts for a Magento e-commerce platform. The tests are written in Java and utilize Selenium WebDriver with the Page Object Model (POM) design pattern for enhanced maintainability and reusability. The project is structured using Maven for dependency management and build processes. We employ TestNG as our testing framework, integrated with Cucumber for Behavior-Driven Development (BDD).

**URL:** [Magento Website](https://magento.softwaretestingboard.com/)

## Tools and Technologies Used

- **Programming Language:** Java
- **Web Automation Tool:** Selenium WebDriver
- **Test Framework:** TestNG
- **BDD Framework:** Cucumber
- **Design Pattern:** Page Object Model (POM)
- **Build Tool:** Maven
- **File Management Tools:** Apache POI (for Excel interactions)
- **Reporting Tools:** Extent Reports
- **Version Control:** Git and GitHub
- **Logging:** SLF4J (Simple Logging Facade for Java)

## Prerequisites

To run these tests, you will need:

- Java JDK 11 or higher installed.
- Maven installed and configured.
- Google Chrome or Firefox browser installed.
- Access to a GitHub account and Git installed for version control.

## Writing Tests
- Place your test cases under src/test/java following the naming conventions and structure provided in existing tests.
- Utilize the Page Object Model (POM) by creating page classes under src/main/java/pages.
- Define step definitions under src/test/java/stepDefinitions.
- Feature files should be placed in src/test/resources/features.

## Reporting
After running your tests, you can generate a report using Extent Reports. The report will be generated in the test-output folder. You can customize the reporting mechanism by modifying the Extent Report configuration in the test suite setup.

## Video 
https://app.usebubbles.com/tnLhzEUdB4wFUDWzQXZSVy/magento-selenium-cucumber


