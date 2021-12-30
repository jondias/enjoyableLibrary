# enjoyableLibrary
Jonathan's answer for TUI test

Instructions:

- It must have a MongoDB instance running so please run the following command:
  docker run --name mongodb -d -p 27017:27017 mongo
- Then we must have a DB called 'EnjoyableLibraryDB' and inside that a collection called 'quote'.
- The data was imported into the collection as instructions sent out from you guys by email.
- Finally you might run the application on Intellij as a Spring Boot application or running the 
following command 'mvn spring-boot:run' inside project directory.

Next Steps to improve performance and metrics:
- Generic Exception handler
- Implement Micrometer
- Use Cache
