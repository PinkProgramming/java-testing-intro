# Java Testing Intro Workshop

## Installation

1. Install Java JDK 11, or higher
    - check your version with console command `java -version`
    - if you have a higher version, please
2. Install IntelliJ, make sure to select plugins _Maven_ and _JUnit_
3. Download the code in this repo (if you want to use Github, you may fork and clone)

## Setup IntelliJ

1. Run IntelliJ and choose `Open...` and locate the directory you downloaded
2. If your Java version was higher than 11, update the settings: 
    * edit file `.java-version`
    * edit file `pom.xml`
    * check `File > Project Structure...`, add to `Project SDK` the location of your Java installation
3. Open a console, cd into the project root, and run command (you may need to install Maven first)
```bash
    mvn clean install
``` 

## Running your first test

1. Locate a class in IntelliJ project tree, it should be located under `src/test/`
2. Right/Ctrl-click on it and select `▶ Run ...`
3. See the test-runner pop up, showing your ✔ Test Results.

## Next

Tutorials can be found in each sub-folder's README.md. Currently available:
* [Basics](src/test/java/org/pinkprogramming/javatesting/Basics/)
* [Website Tests](src/test/java/org/pinkprogramming/javatesting/WebsiteTests/)