
# 📊 DS Visualization & Quiz App

**A Java & MySQL-based application for visualizing data structures and conducting interactive quizzes.**

---

## 🧠 Project Overview

This project provides an interactive platform to visualize various data structures and algorithms, such as arrays, linked lists, stacks, queues, trees, and graphs. Additionally, it offers a quiz module to test knowledge on these topics. The application is built using Java for the frontend and MySQL for backend data storage.

---

## ⚙️ Technologies Used

* **Frontend:** Java (Swing for GUI)
* **Backend:** MySQL
* **Database:** MySQL

---

## 📂 Project Structure

The project is organized into the following directories:

* **codes/**: Contains Java source code files.
* **linearDataStructures/**: Implementation of linear data structures like arrays, linked lists, stacks, and queues.
* **searchingAlgorithms/**: Implementation of searching algorithms such as linear and binary search.
* **sortingAlgorithms/**: Implementation of sorting algorithms like bubble sort, selection sort, and insertion sort.
* **treesAndGraphs/**: Implementation of tree and graph data structures and algorithms.

---

## 🛠️ Setup Instructions

### 1. Install MySQL

Ensure that MySQL is installed on your system. If not, download and install it from the official website:

[MySQL Downloads](https://dev.mysql.com/downloads/installer/)

### 2. Create Database

Create a new database named `DataStructuresQuiz`:

```sql
CREATE DATABASE DataStructuresQuiz;
```

### 3. Configure Database Connection

In the `DatabaseConnection.java` file located in the `codes` package:

* Modify the database username and password to match your MySQL credentials.
* Ensure the database URL points to your local MySQL server.

### 4. Run the Application

Compile and run the `Main.java` file to launch the application.

---

## 🎮 Features

* **Data Structure Visualization:** Interactive visualizations for various data structures.
* **Algorithm Demonstrations:** Step-by-step demonstrations of sorting and searching algorithms.
* **Quiz Module:** Test your knowledge with quizzes on data structures and algorithms.
* **Admin Panel:** Add, edit, or delete quiz questions through an admin interface.

---

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---
