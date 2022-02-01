# How to run this project


clone the project

Start the appium server

Connect mobile device with USB

Set the debug mode on from mobile device

Allow connection from phone

Make sure the phone is unlocked


Open build.gradle as project by intellIJ

Add configuration as:


      a. Select TestNG as test runner
   
      b. Give Test Name as Run
   
      c. Test Kind: Class, Class: TestCase, Use classpath as module: MyCalculatorApp.test
   
Click on Ok button

Click Run button

or give this command:
  
  
    gradle clean test 
