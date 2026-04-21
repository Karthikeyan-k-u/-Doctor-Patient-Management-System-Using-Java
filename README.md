# 🏥 Doctor‑Patient Management System (Java)

## 📌 Overview
This project is a simple Java console‑based application that manages doctor and patient records. It demonstrates core Object‑Oriented Programming (OOP) principles including **abstraction**, **inheritance**, **interfaces**, and **polymorphism**. The program allows users to add doctors and patients, store them in an array, and display their roles and duties in a structured format.

---

## ⚙️ Features
- Menu‑driven console interface
- Add **Doctor** with ID, Name, and Specialization
- Add **Patient** with ID, Name, and Disease
- Display all added people with:
  - Role description
  - Duty performed (treating / receiving treatment)
  - Formatted information (`ID: Name`)
- Fixed‑size array storage (demonstrates array handling)
- Implements a `Workable` interface for common behaviour

---

## 🧠 Concepts Used
| Concept              | Implementation                                      |
|----------------------|-----------------------------------------------------|
| **Interface**        | `Workable` defines `performDuty()` and `getInfo()`  |
| **Abstract Class**   | `Person` provides common fields and partial logic   |
| **Inheritance**      | `Doctor` and `Patient` extend `Person`              |
| **Polymorphism**     | `Person[]` array holds objects of different subtypes|
| **Method Overriding**| `role()` and `performDuty()` are customised in subclasses |
| **Arrays**           | Fixed‑size storage for up to 10 `Person` objects    |
| **User Input**       | `Scanner` for interactive console input             |

---


## 🖥️ How It Works

1. The program displays a menu with four options:


   - `1. Add Doctor`
     
   - `2. Add Patient`
     
   - `3. Show All`
     
   - `4. Exit`
     
2. The user selects an option.
   
3. **Adding a person:**
   
   - Prompts for ID, Name, and Specialization/Disease.
     
   - Creates a `Doctor` or `Patient` object and stores it in a fixed‑size `Person[]` array.
     
4. **Showing all records:**
   
   - Iterates through the array and calls `role()`, `performDuty()`, and `getInfo()` for each object.
     
   - Polymorphism ensures the correct subclass methods are executed.
     
5. The loop continues until the user selects **Exit**.

---

## 💻 Sample Input

1.Add Doctor

2.Add Patient

3.Show All

4.Exit

Choice: 1

ID: 101

Name: Dr. Adams

Specialization: Cardiology

Choice: 2

ID: 201

Name: John Doe

Disease: Fever

Choice: 3

---


## 📤 Sample Output


Dr. Adams is a Doctor

Dr. Adams is treating patients in Cardiology

101: Dr. Adams


John Doe is a Patient

John Doe is receiving treatment for Fever

201: John Doe

---


✍️ Author


KARTHIKEYAN K U
