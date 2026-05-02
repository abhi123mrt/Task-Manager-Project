# Task-Manager-Project
# Task Manager Application

This is a Task Manager application built using Spring Boot. It allows users to manage their tasks and projects efficiently through a structured backend system and a simple web interface.

The application follows a layered architecture with controllers, services, repositories, and models to ensure scalability and maintainability. It is designed to handle task creation, updates, and basic project management workflows.

Currently, the database integration is disabled for deployment purposes, and the application runs without persistent storage.

---

## 🚀 Features

* 🔐 User Registration & Login
* 🧑‍💻 Session-based Authentication
* 📁 Project Management (Create & Mark Complete)
* ✅ Task Management (Create & Update Status)
* 🎨 Clean and Responsive UI using Thymeleaf + CSS
* 📊 Status Tracking (Pending / In Progress / Completed)
* 🔄 Simple Navigation Flow

---

## 🔄 Application Flow

User registers or logs in → accesses dashboard → creates projects → adds tasks → updates task/project status → tracks progress through the dashboard.

---

## Tech Stack

* Backend: Spring Boot (Java)
* Frontend: Thymeleaf, HTML, CSS
* Build Tool: Maven
* Database: MySQL (configured, but disabled in deployment)
* Deployment: Render
