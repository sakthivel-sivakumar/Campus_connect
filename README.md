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

## API Endpoints

### Student APIs

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /api/students | Add student |
| GET | /api/students | Get all students |
| GET | /api/students/{id} | Get student by ID |
| PUT | /api/students/{id} | Update student |
| DELETE | /api/students/{id} | Delete student |

### Job APIs

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /api/jobs | Add job |
| GET | /api/jobs | Get all jobs |
| GET | /api/jobs/{id} | Get job by ID |
| PUT | /api/jobs/{id} | Update job |
| DELETE | /api/jobs/{id} | Delete job |

### Job Application APIs

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /api/applications | Apply for a job |
| GET | /api/applications | Get all applications |
| GET | /api/applications/{id} | Get application by ID |
| PUT | /api/applications/{id} | Update application |
| DELETE | /api/applications/{id} | Delete application |

## Database Configuration

Create the MySQL database:

```sql
CREATE DATABASE campusconnect;
