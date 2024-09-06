# Web Automation Framework Boilerplate

This repository provides a boilerplate for quickly setting up a web automation framework from scratch using Selenium and TestNG. The framework is designed to be flexible, customizable, and ready for immediate use in web automation projects.

## Test Cases Covered

### 1. Basic Google Search Test
- Opens the Google search page.
- Searches for a valid keyword.
- Verifies that search results are displayed and counts the number of results.

### 2. Invalid Search Test
- Opens the Google search page.
- Searches for junk or random keywords.
- Verifies that the number of results returned is zero.

## Key Features

### 1. Data-Driven Testing
The framework supports data-driven testing. Test data is provided in Excel format for ease of use and flexibility.

### 2. Configurable Properties
All configurable properties (e.g., URLs, browser settings, etc.) are stored externally in configuration files, making the framework highly customizable without modifying the core code.

### 3. Customized Reporting
The framework includes ExtentReports for detailed and customizable reporting. You can easily track the progress and results of your test execution in an HTML report format.
