# WebDriverManager
Different browser Invocation by using WebDriver Manager [using bonigarcia dependency].
This dependency downloads the latest compatable browser driver automatically according to your current system browser version.
So that everytime there is an browser version update released as user you don't required to download the compaatable browser driver version.

---
To make the use of this feature you need to add following dependency into the pom.xml file of the maven project
```
<dependency>
	<groupId>io.github.bonigarcia</groupId>
	<artifactId>webdrivermanager</artifactId>
	<version>4.3.1</version>
</dependency>
```
And to invoke the browsers add the code as following
1. Chrome Browser Invocation
```
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
```

2. Firefox Browser Invocation
```
WebDriverManager.firefoxdriver().setup();
driver = new OperaDriver();
```
3. Opera Browser Invocation
```
WebDriverManager.operadriver().setup();
driver = new OperaDriver();
```
4. Edge Browser Invocation
```
WebDriverManager.edgedriver().setup();
driver = new EdgeDriver();
```
And for the rest of the code you can continue as per your requirnment.
