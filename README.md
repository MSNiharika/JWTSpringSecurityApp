# JWT Spring Security App

A secure Spring Boot application that implements **JWT (JSON Web Token) authentication** using Spring Security. It demonstrates how to protect REST APIs with token-based authentication, load users from an H2 in-memory database, and expose an `/auth/login` endpoint to authenticate users and return a JWT.

## 🔐 Features

- JWT-based stateless authentication
- Spring Security filter chain customization
- Secure password hashing with BCrypt
- H2 database integration
- RESTful login endpoint
- Docker and PostgreSQL ready (optional extension)

---

## 🚀 Getting Started

### 1. Clone the repository

```bash
git clone git@github.com:MSNiharika/JWTSpringSecurityApp.git
cd JWTSpringSecurityApp

2. Run the application

Make sure Java 17+ and Maven are installed.

bash
./mvnw spring-boot:run

The app will start on:
http://localhost:8080

⸻

🔐 Login API

Endpoint

POST /auth/login

Request Body

{
  "username": "john",
  "password": "password123"
}

Response

A valid JWT token:
eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJqb2huIiwiaWF0IjoxNz... (truncated)

Use this token in the Authorization header for future requests:
Authorization: Bearer <JWT>

🧪 Preloaded User

A default user is initialized on startup:
Username
Password
Role
john
password123
USER

🔧 H2 Console

Access it at:

http://localhost:8080/h2-console

	•	JDBC URL: jdbc:h2:mem:products_data
	•	User: sa
	•	Password: (leave blank)

⸻

🛡️ Technologies Used
	•	Spring Boot
	•	Spring Security
	•	JWT (JJWT library)
	•	H2 Database
	•	BCrypt PasswordEncoder

├── controller          # Auth controller
├── dto                # Request DTOs
├── entity             # User entity
├── repository         # Spring Data JPA repository
├── security           # JWT config, filters, utils
├── service            # UserDetailsService implementation
└── application.yaml   # Configuration including JWT secret & expiration

📜 License

MIT
