# CampusConnect – Student & Job Application Management System

## Overview

CampusConnect is a Spring Boot-based application designed to manage students, job opportunities, and student job applications in a college placement environment.

## Features

- Student Management
- Job Management
- Job Application Management
- Complete CRUD Operations
- MySQL Database Integration
- Spring Data JPA
- RESTful APIs
- Swagger API Documentation

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Lombok
- Swagger / OpenAPI

## Project Structure

src/main/java/com/campusconnect

├── controller
│   ├── StudentController.java
│   ├── JobController.java
│   └── JobApplicationController.java
│
├── entity
│   ├── Student.java
│   ├── Job.java
│   └── JobApplication.java
│
├── repository
│   ├── StudentRepository.java
│   ├── JobRepository.java
│   └── JobApplicationRepository.java
│
├── service
│   ├── StudentService.java
│   ├── JobService.java
│   └── JobApplicationService.java
│
└── CampusConnectApplication.java

<img width="1475" height="347" alt="image" src="https://github.com/user-attachments/assets/41e19146-1524-4af6-86a9-9d1c8bc57e19" />


<img width="1447" height="347" alt="image" src="https://github.com/user-attachments/assets/e6c319d3-251e-4817-b580-0f48e21b816b" />

<img width="1443" height="331" alt="image" src="https://github.com/user-attachments/assets/19890e8c-4079-4c5d-bec3-1683465562e8" />






## Database Configuration

Create the MySQL database:

```sql
CREATE DATABASE campusconnect;
