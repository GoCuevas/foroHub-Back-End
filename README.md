# ForoHub - Backend

Sistema de foros desarrollado como parte del programa Oracle Next Education (ONE), con enfoque en el manejo de tópicos de discusión. Proyecto backend desarrollado con Java y Spring Boot.

## 🌟 Características principales
- Registro de tópicos (POST)
- Listado de tópicos (GET)
- Actualización de tópicos (PUT)
- Eliminación de tópicos (DELETE)

---

## 🚀 Tecnologías utilizadas
- Java 17
- Spring Boot 3.5.4
- Maven
- PostgreSQL
- Hibernate / Spring Data JPA
- Postman (para pruebas de la API)
- Git & GitHub

---

## 📊 Estructura del proyecto
```
foroHub/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/aluracursos/foroHub/
│       │       ├── controller/
│       │       ├── dto/topico/
│       │       ├── model/
│       │       └── repository/
│       └── resources/
│           └── application.properties
└── pom.xml
```

---

## 🔄 Endpoints disponibles

### ✉️ Crear un tópico
**POST** `/topicos`
```json
{
  "titulo": "¿Cómo usar DTOs en Spring Boot?",
  "mensaje": "Estoy aprendiendo sobre DTOs y necesito ayuda.",
  "autor": "Juan Pérez",
  "curso": "Spring Boot"
}
```

### 📄 Listar tópicos
**GET** `/topicos`
- Retorna una lista con ID, título, mensaje y fecha de creación.

### ✏️ Actualizar tópico
**PUT** `/topicos`
```json
{
  "id": 1,
  "titulo": "Título actualizado",
  "mensaje": "Nuevo mensaje editado"
}
```

### ❌ Eliminar tópico
**DELETE** `/topicos/{id}`
- Elimina el tópico con el ID correspondiente.

---

## ⚙️ Configuración local
1. Clonar el repositorio:
   ```bash
   git clone https://github.com/GoCuevas/foroHub-Back-End.git
   ```
2. Abrir el proyecto en IntelliJ IDEA
3. Crear base de datos en PostgreSQL con nombre `forohub`
4. Ajustar credenciales en `application.properties` o usar variables de entorno:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/forohub
spring.datasource.username=${LTR_USER}
spring.datasource.password=${LTR_PASSWORD}
```
5. Ejecutar el proyecto desde IntelliJ o con:
```bash
mvn spring-boot:run
```

---

## 🕵️‍\ Proyecto mantenido por
**Gonzalo Cuevas**
- [LinkedIn](https://www.linkedin.com/in/gonzalocuevas-maritimeagent)
- Desarrollador Backend Jr. | Agente Marítimo | Apasionado por la automatización y la eficiencia.

---

## 🔎 Estado del proyecto
**Versión actual:** MVP funcional para evaluación final.
- Pendiente: Seguridad con Spring Security, autenticación JWT, login, relación con entidad Usuario, documentación Swagger.

---

## 🌟 Gracias
Gracias a Alura Latam y Oracle Next Education por la formación y el desafío. Proyecto creado con pasión y dedicación 💛
