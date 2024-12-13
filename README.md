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
- **File Management Tools:** Apache POI (for Excel interactions, optional)
- **Reporting Tools:** Extent Reports
- **Version Control:** Git and GitHub
- **Test Management Tools:** Similar to JIRA, ZEPHYR / XRAY
- **Logging:** SLF4J (Simple Logging Facade for Java)

| User Story                               | Contributor                                               | Role                       |
|------------------------------------------|-----------------------------------------------------------|----------------------------|
| [US701: User Registration]()              | [Erdem Gürel](https://github.com/artam109)                | Project Lead & QA Engineer |
| [US702: User Login]()                     | [Beyza Nur Er](https://github.com/beyzanurer)             | QA Engineer                |
| [US703: Adding Address]()                 | [Ahmet Kaya](https://github.com/0AhmetKaya0)              | QA Engineer                |
| [US704: TAB Menu]()                       | [Nigar Ayla Ozcanan](https://github.com/NigarAylaOzcanan) | QA Engineer                |
| [US705: Adding Products to Cart]()        | [Onur Girgin](https://github.com/Mednasa)                 | QA Engineer                |
| [US706: Product Order]()                  | [Nigar Ayla Ozcanan](https://github.com/NigarAylaOzcanan) | QA Engineer                |
| [US707: Search Functionality]()           | [Onur Girgin](https://github.com/Mednasa)                 | QA Engineer                |
| [US708: Wish List]()                      | [Erdem Gürel](https://github.com/artam109)                | QA Engineer                |

## User Story Summary:

- US701 | User Registration: Create registration for new users in Magento. 
- US702 | User Login: Verify the login process for registered users.
- US703 | Adding Address: Adding an address to the system for a registered user.
- US704 | TAB Menu: TAB menu control.
- US705 | Adding Products to Cart: Random adding/removing products from the cart by the registered user.
- US706 | Product Order: The registered user orders and approves the product.
- US707 | Search Functionality: Confirming the ID of a randomly selected product (e.g. SKU #: MJ08) with the search function.
- US708 | Wish List: Test adding/removing products from the favorites list

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
##Versioning
We use Git for version control. For the versions available, see the tags on this repository.

## Acknowledgments
- Thanks to the contributors who spent time to help build these scripts.
- Magento community for constant support and documentation.
- Anyone whose code was used as inspiration or direct assistance in this project.
