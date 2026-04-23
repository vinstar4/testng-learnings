# TestNG Learnings Repository

This repository contains my hands-on learning and practice of **TestNG**,
a testing framework used for Java-based automation.

## Project Structure

```
project-root
│
├── src
│   ├── test
│   │   ├── java
│   │   │   └── (TestNG Java test classes)
│   │   │
│   │   └── resources
│   │       └── (TestNG XML files)
│
└── README.md
```

## Directory Details

### src/test/java

* Contains all TestNG test classes
* Includes:

  * Test methods using `@Test`
  * Annotations (`@BeforeMethod`, `@AfterMethod`, etc.)
  * Listeners
  * DataProviders
  * Assertions

### src/test/resources

* Contains TestNG XML configuration files
* Used for:

  * Running test suites
  * Grouping tests
  * Parallel execution
  * Listener configuration

## Test Execution

### 1. Using TestNG XML (Suite Execution)

* Located in `src/test/resources`
* Used when:

  * Running multiple classes together
  * Using groups, parallel execution, or listeners

### 2. Direct Execution (Without XML)

* Some test classes can be run directly from the Java file
* Right-click class → **Run As → TestNG Test**

**Note:**

* Not all test classes require an XML file
* XML is mainly used for advanced configurations and suite-level control

## Topics Covered

* TestNG Annotations
* Execution Flow
* Assertions
* DataProviders
* Groups & Prioritization
* Parallel Testing
* Listeners
* Extent Reports

## Tools & Technologies

* Java
* TestNG
* Eclipse IDE
* Maven (simple Maven project and inside it testng practice)

## Purpose

* Learn TestNG step-by-step
* Practice different testing features
* Maintain structured revision notes

