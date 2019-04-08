# Swiggy-Project
Swiggy test project

Framework and languages used :
-------------------------------
  Java, Selenium Webdriver, Testng, Maven
  
  Pre-requisit :
  ----------------
    1. Add TestNG plugin to eclipse IDE.
    2. Build the Swiggy_Project. This will automatically add all the jar files to maven dependencies folder.
    3. Chrome driver and Gecko driver are already added to driver folder. User may add any driver as per the need.
  
  Main Project :
  ---------------
  Package Swiggy_Project is created and it has below two main classes.
  
  1. Page Object Model - Swiggy_PageObjectModule (src\main\java\Swiggy_Project\Swiggy_Project\Swiggy_PageObjectModule.java)
  2. Test class - Swiggy_Project(src\test\java\Swiggy_Project\Swiggy_Project\Swiggy_Project.java)
  
  Steps to execute:
 ------------------- 
  1. Build the project. It should resolve all the required dependencies.
  2. Run Swiggy_Project class as TestNG test.
  3. NOTE: This project is platform independent and can be run on linux, MAC or windows systems.
  
  Result:
 ---------- 
  Execution should happen with two browsers namely chrome and firefox consicutively.
  Screenshots will be stored in "test-output\ScreenShots"
