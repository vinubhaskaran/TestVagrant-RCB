
# RCB-Royal Challengers Bangalore

A simple project to validate the RCB team using test conditions.


## Used In This Project
* Eclipse (2022-03) v 4.23.0
* Java + Maven
    ### Maven dependencies
        json-simple(v 1.1.1)
        testng(v 7.4.0)

## Requirements
* In order to utilise this project you need to have the following installed locally:
    Eclipse(latest version)
    Java (v 18)
    Chrome browser(if you want to view report in chrome)
## Usage
* To use this project you need to import this project in Eclipse by File-->import-->Existing Maven Projects into Workspace.
* Select the directory containing this file.
* Click Finish.
## Guide to Run
* Update your Maven project before the run.
    Right click-->Maven-->Update Project.
* You can run this project in two ways and both will give the output.
* Run using java file.
    * Navigate to src/main/java --> rcb.team --> Validate.java.
    * Run as TestNG by Right click--> Run as --> TestNG Test.
* Run using TestNG XML file.
    * Navigate to testng.xml in parent folder.
    * Run as TestNG by Right click--> Run as --> TestNG Suite.
    
## Reports
* The Output log file can be found in Log-->ExecutionStatus.log.
* In order to view the report navigate to test-output --> Index.html.
* To view the detailed report, open the Index file in a browser.
* You can find all the tests, test classes, execution time, failed and passes tests.
