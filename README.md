# TestNG Learnings Repository

This repository contains my hands-on learning and practice of **TestNG**, a Java-based testing framework used for automation.

---

## Project Structure

```
project-root
│
├── src
│   ├── test
│   │   ├── java
│   │      └── (TestNG Java test classes and packages witth thier xmls)
│   │   
│   │   
│   │      
│
├── reports
│   └── (Extent Report HTML files generated after execution)
│
└── README.md
```

---

## Directory Details

### src/test/java

* Contains all TestNG test classes and packages with java classes and xmls
* Covers:

  * Test methods using `@Test`
  * Annotations (`@BeforeMethod`, `@AfterMethod`, etc.)
  * Assertions
  * DataProviders
  * Listeners



### reports

* Configured location for **Extent Reports**
* Stores generated HTML reports after test execution

---

## Test Execution
- java classes in default package/no package can be run directly (run as testng)
- packages containing xmls can be run through xml, run xml as testng
---

## Extent Reports

* Extent Reports are configured using a listener:

  * `Extentreportmanager.java`
* Reports are generated in:

  ```
  ./reports
  ```
* Output:

  * HTML report with test results
  * Pass/Fail status
  * Execution details

---

## Topics Covered

* TestNG Annotations
* Test Execution Flow
* Assertions
* DataProviders
* Groups & Prioritization
* Parallel Testing
* Listeners
* Extent Reports Integration

---

## Tools & Technologies

* Java
* TestNG
* Eclipse IDE
* Maven (simple Maven project as a container for Testng Practice)

---

## Purpose

* Learn TestNG step-by-step.
* Practice real-world testing concepts.
* Maintain structured revision notes.

