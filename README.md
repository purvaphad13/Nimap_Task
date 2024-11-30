# Nimap_Task
This project is a simple CRUD (Create, Read, Update, Delete) application built with Spring Boot. The API manages Products/categories and supports pagination for retrieving data.

## Summary:
**GET all categories/products with pagination: Use page and size parameters.-->[http://localhost:8080/api/categories?page=0&size=10] & [http://localhost:8080/api/products?page=0&size=10]
**POST to create a new category/product: Include the relevant JSON body.--> [http://localhost:8080/api/categories]  &  [http://localhost:8080/api/products]
**GET by ID to retrieve a single category/product. --> [http://localhost:8080/api/categories/{id}]   &  [http://localhost:8080/api/products/{id}]
**PUT to update a category/product by ID: Include the updated JSON body.--> [http://localhost:8080/api/categories/{id}]   &  [http://localhost:8080/api/products/{id}] 
**DELETE to remove a category/product by ID.-->[http://localhost:8080/api/categories/{id}]  &  [http://localhost:8080/api/products/{id}] 

## Features
Create new products.
Retrieve products by category (with pagination support).
Update product details.
Delete products.
## Technologies Used
Spring Boot: Backend Framework.
- MySQL: Database.
- Spring Data JPA: ORM and database handling.
- Lombok: To reduce boilerplate code.
- Postman: API testing.
 - Language: Java
## Exception Handling :
This project uses RuntimeException for error handling when an entity is not found.

