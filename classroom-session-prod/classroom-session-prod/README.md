# Classroom Session (Maven multi-module)

- `server` - Java library: `Session` and `SessionManager` classes, with JUnit tests
- `classroom-web` - WAR web app: static classroom session page (HTML, CSS, JS)

## Requirements
Java 17+ and Maven 3.8+

## Build everything (compiles, runs tests, builds the WAR)
    mvn clean package

Output: `classroom-web/target/classroom-web-1.0.0.war`

## Run locally (http://localhost:8080)
    mvn -pl classroom-web jetty:run

## Deploy
Copy the WAR into the `webapps` folder of Tomcat, or upload it to your server.
