# Spring Boot REST API

<p align="center">

<strong>A RESTful backend application built with Java and Spring Boot, featuring CRUD operations, MySQL persistence, JPA/Hibernate and OpenAPI documentation.</strong>

</p>

<p align="center">

<a href="https://github.com/luisortga/spring-boot-rest-api">
  <img src="https://img.shields.io/badge/GitHub-Repository-181717?logo=github&logoColor=white" alt="GitHub Repository">
</a>
<img src="https://img.shields.io/badge/Java-26-ED8B00?logo=openjdk&logoColor=white" alt="Java">
<img src="https://img.shields.io/badge/Spring_Boot-4.1.0-6DB33F?logo=springboot&logoColor=white" alt="Spring Boot">
<img src="https://img.shields.io/badge/MySQL-8.x-4479A1?logo=mysql&logoColor=white" alt="MySQL">
<img src="https://img.shields.io/badge/Maven-Build_CLI-C71A36?logo=apachemaven&logoColor=white" alt="Maven">
<img src="https://img.shields.io/badge/JPA-Hibernate-59666C?logo=hibernate&logoColor=white" alt="JPA / Hibernate">

</p>

<p align="center">

<a href="https://www.java.com/">
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/java/java-original.svg" width="58" alt="Java">
</a>
&nbsp;&nbsp;&nbsp;

<a href="https://spring.io/projects/spring-boot">
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/spring/spring-original.svg" width="58" alt="Spring Boot">
</a>
&nbsp;&nbsp;&nbsp;

<a href="https://www.mysql.com/">
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/mysql/mysql-original.svg" width="58" alt="MySQL">
</a>
&nbsp;&nbsp;&nbsp;

<a href="https://maven.apache.org/">
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/maven/maven-original.svg" width="58" alt="Maven">
</a>
&nbsp;&nbsp;&nbsp;

<a href="https://hibernate.org/">
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/hibernate/hibernate-original.svg" width="58" alt="Hibernate">
</a>

</p>

---

## Overview

**Spring Boot REST API** is a backend application built with Java and Spring Boot.

The project demonstrates how to build a RESTful API with a layered backend architecture, database persistence through Spring Data JPA, and MySQL integration.

The application implements CRUD functionality and returns data through JSON-based HTTP responses.

```text
                         REST API
                            │
                            ▼
                       Spring Boot
                            │
                            ▼
                       Spring Web
                            │
                            ▼
                       Controller
                            │
                            ▼
                         Service
                            │
                            ▼
                     Spring Data JPA
                            │
                            ▼
                    Hibernate ORM
                            │
                            ▼
                          MySQL
```

The project was created as a practical backend development exercise to work with Java, Spring Boot, REST architecture, relational databases, JPA/Hibernate and Maven.

---

## Technology Stack

| Technology                                                                          | Purpose                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------- |
| [Java](https://www.java.com/)                                                       | Main programming language                       |
| [Spring Boot](https://spring.io/projects/spring-boot)                               | Backend application framework                   |
| [Spring Web MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html) | REST API and HTTP request handling              |
| [Spring Data JPA](https://spring.io/projects/spring-data-jpa)                       | Database persistence and repository abstraction |
| [Hibernate](https://hibernate.org/)                                                 | JPA implementation and ORM                      |
| [MySQL](https://www.mysql.com/)                                                     | Relational database                             |
| [Maven](https://maven.apache.org/)                                                  | Dependency and build management                 |
| [Lombok](https://projectlombok.org/)                                                | Java boilerplate reduction                      |
| [Springdoc OpenAPI](https://springdoc.org/)                                         | OpenAPI / API documentation                     |
| Git / GitHub                                                                        | Version control                                 |

The current Maven configuration uses **Spring Boot 4.1.0** and **Java 26**.

---

## Features

* RESTful API architecture
* CRUD operations
* MySQL database integration
* Spring Data JPA
* Hibernate ORM
* Layered backend structure
* JSON responses
* Maven dependency management
* Lombok
* Spring Web MVC
* OpenAPI documentation
* Spring Boot DevTools
* JPA integration
* MySQL Connector/J
* Automated test dependencies

---

## Architecture

The application separates the HTTP layer, business logic and persistence responsibilities.

```text
Client
  │
  ▼
REST Controller
  │
  ▼
Service Layer
  │
  ▼
Repository / JPA
  │
  ▼
Hibernate
  │
  ▼
MySQL
```

### Separation of concerns

```text
Controller
   │
   └── Handles HTTP requests and responses

Service
   │
   └── Handles application / business logic

Model
   │
   └── Represents application data

Repository
   │
   └── Handles database persistence

Config
   │
   └── Application configuration

MySQL
   │
   └── Persistent relational data
```

---

## Project Structure

```text
spring-boot-rest-api/
│
├── .mvn/
│   └── wrapper/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── pipecoding/
│   │   │           └── orteg/
│   │   │               ├── controller/
│   │   │               │
│   │   │               ├── Model/
│   │   │               │
│   │   │               ├── config/
│   │   │               │
│   │   │               ├── service/
│   │   │               │
│   │   │               └── RestApiOrtegApplication.java
│   │   │
│   │   └── resources/
│   │       └── application.properties
│   │
│   └── test/
│
├── mvnw
├── mvnw.cmd
├── pom.xml
├── README.md
└── .gitignore
```

The repository currently uses the package `com.pipecoding.orteg` and the main Spring Boot class `RestApiOrtegApplication`.

---

## REST API

The application follows REST principles and exposes HTTP endpoints for CRUD operations.

The main operations are:

```text
GET
   │
   └── Retrieve resources

POST
   │
   └── Create resources

PUT
   │
   └── Update resources

DELETE
   │
   └── Delete resources
```

Responses are returned in JSON format.

> The exact resource paths depend on the controllers implemented in the project.

---

## Database

The application uses **MySQL** as its relational database.

Spring Data JPA provides the persistence abstraction while Hibernate handles object-relational mapping.

```text
Java Object
     │
     ▼
   JPA
     │
     ▼
 Hibernate
     │
     ▼
   SQL
     │
     ▼
  MySQL
```

The project includes MySQL Connector/J as the runtime database driver.

---

## JPA & Hibernate

The project uses Spring Data JPA together with Hibernate to map Java objects to relational database records.

This allows the application to work with database entities using Java objects rather than manually handling every SQL operation.

```text
Application
     │
     ▼
Spring Data JPA
     │
     ▼
Hibernate
     │
     ▼
MySQL
```

This architecture provides a clear separation between application code and database persistence.

---

## OpenAPI Documentation

The project includes **Springdoc OpenAPI** for API documentation.

The Maven configuration includes:

```xml
<dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
    <version>3.1.0</version>
</dependency>
```

This allows the REST API to be documented through OpenAPI and exposed through a web-based API documentation interface.

---

## Installation

### Clone the repository

```bash
git clone https://github.com/luisortga/spring-boot-rest-api.git

cd spring-boot-rest-api
```

### Build the project

Using the Maven Wrapper:

#### Windows

```powershell
.\mvnw.cmd clean install
```

#### Linux / macOS

```bash
./mvnw clean install
```

The project includes both `mvnw` and `mvnw.cmd`, allowing Maven commands to be executed without requiring a separate Maven installation.

---

## Running the Application

### Using Maven Wrapper

#### Windows

```powershell
.\mvnw.cmd spring-boot:run
```

#### Linux / macOS

```bash
./mvnw spring-boot:run
```

### Using the packaged JAR

Build the project:

```bash
./mvnw clean package
```

Then run the generated JAR:

```bash
java -jar target/rest-api-orteg-0.0.1-SNAPSHOT.jar
```

The artifact is currently configured as:

```text
rest-api-orteg
```

with version:

```text
0.0.1-SNAPSHOT
```

according to the project's `pom.xml`.

---

## MySQL Configuration

Configure the MySQL connection in:

```text
src/main/resources/application.properties
```

Example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_database
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
```

Use your own database name, username and password.

Database credentials should not be committed to the repository.

---

## Dependencies

The project currently includes the following main dependencies:

```text
Spring Boot
    │
    ├── Spring Data JPA
    ├── Spring Web MVC
    ├── Spring Boot DevTools
    ├── MySQL Connector/J
    ├── Lombok
    └── Springdoc OpenAPI
```

Testing dependencies are also configured for Spring Data JPA and Spring Web MVC.

---

## Development

The project includes Spring Boot DevTools for development-time support.

A typical development workflow is:

```text
Write Java code
      │
      ▼
Run Spring Boot
      │
      ▼
Test REST endpoints
      │
      ▼
Inspect JSON responses
      │
      ▼
Persist data with JPA
      │
      ▼
Verify data in MySQL
```

---

## What I Practiced

```text
Java
  │
  └── Spring Boot
       │
       ├── Spring Web MVC
       │      │
       │      └── REST API
       │
       ├── Spring Data JPA
       │      │
       │      └── Repository / Persistence
       │
       ├── Hibernate
       │      │
       │      └── ORM
       │
       └── MySQL
              │
              └── Relational Database

Development
  │
  ├── Maven
  ├── Lombok
  └── Spring Boot DevTools

API Documentation
  │
  └── Springdoc OpenAPI
```

---

## Learning Objectives

This project was created to practice several backend development concepts:

* Java backend development
* Spring Boot application structure
* REST API design
* HTTP methods
* CRUD operations
* Controller architecture
* Service layer organization
* Spring Data JPA
* Hibernate ORM
* MySQL integration
* Maven dependency management
* JSON responses
* OpenAPI documentation
* Database persistence
* Layered application architecture

---

## Backend Architecture Concepts

One of the main objectives of the project is understanding how a backend application can separate responsibilities between different layers.

```text
                    REST API
                       │
                       ▼
                  Controller
                       │
                       ▼
                    Service
                       │
                       ▼
                 Spring Data JPA
                       │
                       ▼
                   Hibernate
                       │
                       ▼
                    MySQL
```

Each layer has a specific responsibility, making the application easier to understand, maintain and extend.

---

## Main Application

The application entry point is:

```java
RestApiOrtegApplication
```

It uses Spring Boot's:

```java
@SpringBootApplication
```

annotation to configure and start the application.

```java
public static void main(String[] args) {
    SpringApplication.run(RestApiOrtegApplication.class, args);
}
```

The application entry point is located in:

```text
src/main/java/com/pipecoding/orteg/RestApiOrtegApplication.java
```

This is the class used to bootstrap the Spring Boot application.

---

## Author

Developed by **Luis Ortega**.

<p align="center">

<a href="https://github.com/luisortga">
  <img src="https://img.shields.io/badge/GitHub-luisortga-181717?logo=github&logoColor=white" alt="GitHub">
</a>

</p>

---

## Repository

<p align="center">

<a href="https://github.com/luisortga/spring-boot-rest-api">
  <strong>github.com/luisortga/spring-boot-rest-api</strong>
</a>

</p>

---

## License

This project is licensed under the **MIT License**.

See the [`LICENSE`](LICENSE) file for more information.
