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
│   │   │   └── (TestNG Java test classes)
│   │   │
│   │   └── resources
│   │       └── (TestNG XML files)
│
├── reports
│   └── (Extent Report HTML files generated after execution)
│
└── README.md
```

---

## Directory Details

### src/test/java

* Contains all TestNG test classes
* Covers:

  * Test methods using `@Test`
  * Annotations (`@BeforeMethod`, `@AfterMethod`, etc.)
  * Assertions
  * DataProviders
  * Listeners

### src/test/resources

* Contains TestNG XML files
* Used for:

  * Suite execution
  * Grouping tests
  * Parallel execution
  * Listener configuration

### reports

* Configured location for **Extent Reports**
* Stores generated HTML reports after test execution

---

## Test Execution

### 1. Direct Execution (Java Files)

* Almost all `.java` test files can be executed directly:

  * Right-click → **Run As → TestNG Test**

#### Exceptions:

* **`MyListener.java`**

  * Listener utility class (not a test)
  * Used in `listenerbasics.xml`
  * Can also be used without XML:

    ```java
    @Listeners(MyListener.class)
    ```

* **`Extentreportmanager.java`**

  * Listener utility class for Extent Reports
  * Used in `extentreport.xml`
  * Can also be used without XML:

    ```java
    @Listeners(Extentreportmanager.class)
    ```

* **`ParalleltestingDemo.java`**

  * Executed using:

    ```
    paralleldemo1.xml
    ```
  * Required for demonstrating parallel execution

---

### 2. Execution Using XML Files

* All `.xml` files in:

  ```
  src/test/resources
  ```

  can be executed directly:

  * Right-click → **Run As → TestNG Suite**

* Used for:

  * Running multiple classes together
  * Applying listeners
  * Parallel execution
  * Group execution

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

## Key Notes

* XML is **not mandatory** for running TestNG tests
* Most test classes can run directly
* XML is mainly used for:

  * Advanced configuration
  * Suite-level execution
* Listeners can be configured:

  * Via XML
  * Or using `@Listeners` annotation in Java

---

## Purpose

* Learn TestNG step-by-step.
* Practice real-world testing concepts.
* Maintain structured revision notes.

