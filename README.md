# Foro Hub - Back End

Este es el proyecto final del curso Back End en Oracle ONE - Alura Latam. Se trata de una API REST desarrollada con Spring Boot, que simula el backend de un foro donde los usuarios pueden crear, ver, actualizar y eliminar tópicos.

## 🚀 Funcionalidades principales

- Crear nuevos tópicos
- Listar todos los tópicos
- Visualizar un tópico por ID
- Actualizar un tópico
- Eliminar un tópico
- Autenticación y autorización de usuarios (JWT)
- Persistencia de datos con base de datos relacional
- Validaciones de negocio
- Documentación con Swagger

## 🛠️ Tecnologías utilizadas

- Java 17
- Spring Boot 3.3.9
- Maven
- Spring Web
- Spring Data JPA
- Spring Security
- Lombok
- H2 (dev) / PostgreSQL o MySQL (prod)
- Swagger / OpenAPI

## 🔧 Cómo ejecutar

1. Clona el repositorio:
   ```bash
   git clone https://github.com/TU_USUARIO/foro-hub-backend.git
   cd foro-hub-backend
   ```

2. Asegúrate de tener Java 17 y Maven instalados.

3. Ejecuta el proyecto:
   ```bash
   mvn spring-boot:run
   ```

4. Accede a la API en:
   ```
   http://localhost:8080
   ```

5. Accede a la documentación Swagger:
   ```
   http://localhost:8080/swagger-ui/index.html
   ```

## 🗂 Estructura del proyecto

```
src
├── main
│   ├── java
│   │   └── com.foro
│   │       ├── controller
│   │       ├── service
│   │       ├── repository
│   │       ├── model
│   │       ├── dto
│   │       └── config
│   └── resources
│       └── application.yml
```

## 👨‍💻 Autor

- Gonzalo Cuevas
- [LinkedIn](https://www.linkedin.com/in/gonzalocuevas-maritimeagent)