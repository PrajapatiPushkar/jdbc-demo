# JDBC CRUD Demo Project

This project demonstrates basic CRUD (Create, Read, Update, Delete) operations using Java JDBC with MySQL database.

---

## 📌 Project Description

This is a simple console-based Java application that:

- Connects to MySQL database
- Inserts a student record
- Updates a student record
- Fetches all student records
- Deletes a student record

It helps in understanding how Java interacts with databases using JDBC.

---

## 🛠 Technologies Used

- Java
- JDBC (Java Database Connectivity)
- MySQL
- IntelliJ IDEA (or any Java IDE)

---


---

## ⚙️ Database Setup

1. Install MySQL.
2. Open MySQL and run the following commands:

```sql
CREATE DATABASE spring_fist;
USE spring_fist;

CREATE TABLE student (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    email VARCHAR(100)
);
▶️ How to Run

Add MySQL JDBC Driver (Connector/J) to your project.

Run the main() method inside JDBCDemo.java.

The console will show:

<---- CONSOLE OUTPUT  ---->
Connected to the Database
INSERTED: 1
UPDATED: 1
Student list:
1 | John | john@gmail.com |
DELETED: 1

## 🗂 Project Structure
📚 What This Project Covers

Database connection using DriverManager

Executing SQL queries

Using Statement

Handling ResultSet

Performing CRUD operations

⚠️ Note

This project uses Statement for SQL execution.

For better security and real-world applications, use:

PreparedStatement

Proper exception handling

Input validation

👨‍💻 Author

Pushkar Prajapati
B.Tech CSE Student

🎯 Purpose

This project is created for learning and understanding JDBC fundamentals and database interaction using Java.
