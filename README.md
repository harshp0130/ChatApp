# REST-API-CLIENT – PUBLIC HOLIDAYS FETCHER

**COMPANY:** CODTECH IT SOLUTIONS  
**NAME:** PATEL HARSH  
**INTERN ID:** CT04DM112 
**DOMAIN:** JAVA PROGRAMMING  
**DURATION:** 4 WEEKS  
**MENTOR:** NEELA SANTOSH  

---

## 📝 TASK DESCRIPTION

This Java application retrieves upcoming public holidays for any country by integrating with the **Nager.Date REST API**. It demonstrates key backend programming skills by:

- Accepting country codes (e.g., `US`, `IN`) from user input  
- Performing HTTP GET requests using Java’s `HttpClient` API  
- Parsing JSON responses with the `org.json` library  
- Handling invalid inputs and API errors gracefully  
- Displaying holiday names, dates, and local descriptions  

This mini-project is a practical exercise in working with third-party APIs and JSON in Java.

---

## ⚙️ SETUP: Adding `org.json` Library

1. Download `json-20210307.jar` from the Maven repository:  
   📥 [Download Here](https://repo1.maven.org/maven2/org/json/json/20210307/json-20210307.jar)

2. Place the file in your project folder, for example:  
   `C:\JAVA\Codtech_Tasks-2\`

3. Compile and run the Java file with the jar in the classpath:

```bash
# Compile
javac -cp .;json-20210307.jar HolidayFetcher.java

# Run
java -cp .;json-20210307.jar HolidayFetcher
