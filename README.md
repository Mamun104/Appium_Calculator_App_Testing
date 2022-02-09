# How to run this project


# Prerequisite to use APPIUM

1. Java JDK Download, install, set JAVA_HOME and path in environment’s system variable.

3. Maven zip file Download, extract set  MAVEN_HOME and path in environment’s system variable.

5. Node.js Download, install, & set path in environment’s system variable.

7. Appium Download & install.

9. Android Studio Download, install, set ANDROID_HOME and path in environment’s system variable.

11. Android Studio SDK Manager Setup

13. Android Studio AVD(Android Virtual Devices) Manager Setup / Emulator

15. Physical Device setup 

17. Eclipse or any other IDE download and install

19. RUN!

# After Setup

1. clone the project

2. Start the appium server

3. Connect mobile device with USB

4. Set the debug mode on from mobile device

5. Allow connection from phone

6. Make sure the phone is unlocked


7. Open build.gradle as project by intellIJ

Add configuration as:


      a. Select TestNG as test runner
   
      b. Give Test Name as Run
   
      c. Test Kind: Class, Class: TestCase, Use classpath as module: MyCalculatorApp.test
   
Click on Ok button

Click Run button

or give this command:
  
  
    gradle clean test 
