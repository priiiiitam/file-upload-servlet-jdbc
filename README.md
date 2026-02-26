# File Upload System using Servlets & JDBC

## Overview

A web-based backend application built using Java Servlets and JDBC that allows users to upload files through a browser.

When a user submits a username and selects a file, the system:

- Stores the file on the server-side local directory  
- Saves the username and generated file name into a MySQL database  
- Appends a unique string to the file name to prevent duplicate file conflicts  

This project demonstrates core backend development concepts including HTTP request handling, layered architecture, and database integration.

---

## Tech Stack

- Java (Servlet API)  
- JDBC  
- MySQL  
- Apache Tomcat  
- HTML  
- Eclipse IDE  

---

## Architecture

The project follows a layered architecture to maintain separation of concerns.

### Controller Layer

- Servlets handle HTTP requests and responses  
- Extract form data and forward it to the service layer  

### Service Layer

- Contains business logic  
- Handles unique file name generation  
- Coordinates between controller and DAO  

### DAO Layer

- Handles all database operations using JDBC  
- Inserts user and file information into MySQL  

### Design Principle

- Servlets do not directly communicate with the database  
- All database interaction is handled through the DAO layer  
- Improves maintainability and separation of concerns  

---

## Features

- Upload files via browser  
- Store files on the server-side local directory  
- Save user details in MySQL database  
- Unique file name generation to avoid duplication  
- Structured layered architecture (Controller → Service → DAO)  

---

## How to Run

- Import the project into Eclipse  
- Configure MySQL and create the required database  
- Update database credentials inside the DAO configuration file  
- Deploy the project on Apache Tomcat  
- Access via:  
  `http://localhost:8080/<project-name>/`

---

## Database Schema

### Table: `users`

- `id` (INT, Primary Key, Auto Increment)  
- `username` (VARCHAR)  
- `file_name` (VARCHAR)  

---

## Learning Outcomes

- Handling multipart file uploads using Servlets  
- JDBC database connectivity  
- Implementing layered architecture  
- Understanding HTTP request–response flow  
- Structuring backend applications using OOP principles  
