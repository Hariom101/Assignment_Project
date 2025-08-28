#  Product API - Spring Boot CRUD Application

This project is a **RESTful API** built with **Spring Boot** that performs **CRUD operations** on a `Product` resource.  
It includes **authentication**, **validation**, and uses **MySQL** as a relational database for persistence.

---

##  Technologies Used

- Java 17+
- Spring Boot 3.x+
- Spring Web
- Spring Data JPA
- MySQL
- Lombok
- Jakarta Validation
- Swagger API

---

##  Features

- Create, Read, Update, and Delete (CRUD) operations on `Product`
- Implemented Authentication using Spring Security
- Field validation (`name`, `price`)
- Global exception handling using `@RestControllerAdvice`
- RESTful API responses with proper HTTP status codes
- Swagger UI for API documentation

---

## 🔗 API Endpoints

**Base URL:** `http://localhost:8082/products`  
**Swagger UI:** [`http://localhost:8082/swagger-ui/index.html`](http://localhost:8082/swagger-ui/index.html)

| Method | Endpoint           | Description                  |
|--------|--------------------|------------------------------|
| POST   | `/products`        | Create a new product         |
| GET    | `/products/{id}`   | Get product by ID            |
| GET    | `/products`        | Get all products             |
| PUT    | `/products/{id}`   | Update an existing product   |
| DELETE | `/products/{id}`   | Delete a product             |

---


# Assignment_Project
