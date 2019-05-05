# moviequotes
For a simple CRUD REST application, Spring Data Rest Repository is the way to go.
Basically, everything you could want from a REST interface is created for you.

## Setup
The application assumes that you are running an unsecured local MongoDB, which is the
default setup. The database will be moviequotes.
  
If you are not running a local MongoDB, you can add properties to src/main/resources/application.properties 
to configure the connection.

`spring.data.mongodb.host= # Mongo server host.`

`spring.data.mongodb.password= # Login password of the mongo server.`

`spring.data.mongodb.port= # Mongo server port.`

`spring.data.mongodb.username= # Login user of the mongo server.`

## Running the application
You can run the application with `gradle bootRun` or if you don't have gradle installed,
`./gradlew bootRun`. It will be available at http://localhost:8080.

## Documentation
Swagger docs are available at /swagger-ui.html. A postman collection is available in this 
directory as Movie Quotes.postman_collection.json.

The username is user and the password is password. Basic authentication is supported.


 