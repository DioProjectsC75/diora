# DIORA

digitalinnovaton.one REST API

A management system REST API using Spring Boot and Java.

## Tell me more

System developed as part of the Code Anywhere Bootcamp on digitalinnovation.one.

[spring initalizr](https://start.spring.io) was used to set up the initial project.

- Gradle project
- Java 11
- Spring Boot version 2.5.0
- Selected dependencies:
    - Spring Web
    - Spring Data JPA
    - H2 Database
    - Lombok
    - Validation
    
External dependencies:
- [mapstruct](https://mapstruct.org/)

### REST API

| URI               | Method    | Description           | Request Stream    | Response Stream   | Status Code   |
| ---               | ---       | ---                   | ---               | ---               | ---           |
| /api/v1/diora     | GET       |list all people        | n/a               | **person**        | 200/404       |
| /api/v1/diora/{id}| GET       |specific **person**    | n/a               | **person**        | 200/404       |
| /api/v1/diora     | POST      |create a **person**¹   | **person**²       | **person**        | 201/404       |
| /api/v1/diora/{id}| PUT       |modify a **person**    | **person**        | n/a               | 200/404       |
| /api/v1/diora/{id}| DELETE    |delete a **person**    | n/a               | n/a               | 200/404       |

¹ - Expects a representation of the person in the body
² - Do not specify an ID in the request

### Database

    |---------------|           |-------------|
    | Person        |           | Phone       |
    |---------------|           |-------------|
    | PK | id       |           | PK | id     |
    |    | fistName |-||------o<|    | type   |
    |    | lastName |           |    | number |
    |    | cpf      |           |-------------|
    |    | birthDate|
    |---------------|
