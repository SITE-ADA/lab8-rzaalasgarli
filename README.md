[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/Qr3lBpHw)
University Management System Description

University Management System is an implementation of WM2 Lab 8 with Spring Boot technologies. It contains microservices: course-service and student-service that manage courses, students, enrollments and enforce some business rules such as prerequisite validation and unique enrollment. The provided system has API description via Swagger and descriptions of methods written in Azerbaijani.

Used Technologies

Java 17 and Spring Boot were utilized for the system creation. The following Spring technologies were used: Spring Web (REST APIs), Spring Data JPA (database operations), and Lombok (less redundant code). Two database engines were considered: H2 in-memory DB (default) and PostgreSQL. Gradle is a build tool used for the application compilation. API documentation was created via Swagger (OpenAPI 3).

How to Start the Application

First of all, download the repository with your favorite git client. Next step is opening this project in IDE such as VS Code or IntelliJ IDEA. There are two separate services: course-service and student-service. Each of them may be launched individually by executing gradlew bootRun in appropriate directories.

Course service must be executed in the 'course-service' directory.
Student service must be executed in the 'student-service' directory.

Database Usage

H2 DB engine is used as default. So, there is no need to provide database credentials – the database will be initialized automatically. Also, you can switch to PostgreSQL DB engine by modifying application properties.

Endpoints for REST API

There are four endpoints that work only with courses:

create;
update;
get;
delete;

There are three endpoints that work with courses and enrollments:

enroll in course;
get students of the course;
get courses of student by its name;

Business Rules

The following restrictions were imposed on user input for better application performance and correct operation:

the student must satisfy prerequisite requirements for course enrollment;
every enrollment is recorded by date of enrollment;
there are no duplicate enrollments;

Swagger Documentation

After launching the application, Swagger page becomes accessible and it describes all endpoints that are provided by the system. The descriptions are written in Azerbaijani language to increase readability and understanding.

Testing

There is no particular test suite to check the system; Swagger UI, Postman, or other similar applications are suitable for testing the REST APIs. They should return valid JSON response depending on the request type and its parameters.

Notes

To run the application, Java 17 is required because the source code was compiled under its version. For compiling the project and building JAR archives, there is a Gradle wrapper present in the repository. H2 DB engine operates in-memory.