# Account Management

## Overview
This is a Java-based application that uses Spring Boot and Gradle for managing banking accounts. The application provides functionalities for creating and managing banking accounts.

## Technologies Used
- Java 17
- Spring Boot 3.2.2
- Gradle
- MySQL

## Features
- Create and manage banking accounts
- Unique account numbers and swift codes for each account
- Different types of accounts (e.g., current, savings, etc.)

## Setup
To run this project, you need to have Java 17 and Gradle installed on your machine.

1. Clone the repository
2. Navigate to the project directory
3. Run the command `./gradlew bootRun`

## Configuration
The application can be configured by modifying the `application.yml` file in the `src/main/resources` directory. Here you can set the server port, database connection details, and other Spring Boot configurations.

## Database
The application uses MySQL as its database. The database connection details can be configured in the `application.yml` file.

## Entities
The main entity in the application is the `BankingAccount` which represents a banking account. Each `BankingAccount` has a unique ID, account number, swift code, and is associated with a user.

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License
[MIT](https://choosealicense.com/licenses/mit/)