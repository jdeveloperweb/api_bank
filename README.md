# Financial Integration Service

A demonstration of a scalable and modular microservice built with Java and Spring Boot to showcase best practices in REST API development, asynchronous messaging, and database integration. This project simulates a financial integration system designed for processing and auditing accounting transactions.

---

## Features

- **RESTful API**: Handles HTTP POST requests to process accounting transactions and HTTP GET requests to retrieve persisted data.
- **Data Validation**: Ensures input data integrity and maps it to the expected format.
- **Message Queue Integration**: Publishes operation results (success or failure) to RabbitMQ for asynchronous processing.
- **Database Persistence**: Stores all incoming requests and processing results in a PostgreSQL database for auditing purposes.
- **Authentication**: Secures the API with JWT-based authentication and authorization.
- **Dockerized Deployment**: Includes a `Dockerfile` and `docker-compose.yml` for easy setup and deployment.
- **Unit Testing**: Implements unit tests to ensure code quality and reliability.

---

## Technologies Used

- **Java**: Backend programming language.
- **Spring Boot**: Framework for creating robust and scalable applications.
- **PostgreSQL**: Relational database for persisting transactions and logs.
- **RabbitMQ**: Message broker for asynchronous communication.
- **JWT**: For securing the API endpoints.
- **Docker & Docker Compose**: For containerized development and deployment.

---

## Getting Started

### Prerequisites

- **Docker** and **Docker Compose** installed on your machine.

### Setup

1. Clone this repository:
   ```bash
   git clone https://github.com/your-username/financial-integration-service.git
   ```

2. Navigate to the project directory:
   ```bash
   cd financial-integration-service
   ```

3. Start the services using Docker Compose:
   ```bash
   docker-compose up
   ```

4. Access the API documentation:
   - Open your browser and go to `http://localhost:8080/swagger-ui.html`.

---

## API Endpoints

### POST /transactions

Handles incoming accounting transaction requests. Validates data and processes it for integration.

**Request Body:**
```json
{
  "account": "string",
  "amount": "float",
  "transaction_date": "string (ISO 8601)",
  "cost_center": "string",
  "description": "string"
}
```

**Response:**
- **201 Created**: Transaction processed successfully.
- **400 Bad Request**: Validation failed.

### GET /transactions/{transaction_id}

Retrieves transaction details by ID.

**Response:**
```json
{
  "id": "string",
  "account": "string",
  "amount": "float",
  "transaction_date": "string",
  "cost_center": "string",
  "description": "string",
  "status": "success/failure"
}
```

---

## Running Tests

Run unit tests to verify the functionality of the application:
```bash
mvn test
```

---

## Project Structure

```
financial-integration-service/
├── src/main/java/com/example/service
│   ├── Application.java        # Application entry point
│   ├── model/                  # Database models
│   ├── controller/             # API endpoints
│   ├── service/                # Business logic
│   ├── config/                 # Configuration settings
├── src/test/java/com/example   # Unit tests
├── Dockerfile                  # Docker configuration
├── docker-compose.yml          # Docker Compose configuration
└── README.md                   # Project documentation
```

---

## Use Cases

This project demonstrates:

- How to build a scalable microservice architecture.
- Integration with message queues (RabbitMQ) for event-driven systems.
- Secure API development with JWT authentication.
- Best practices for containerization and testing in modern software development.

---

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

## Contact

For any inquiries, feel free to reach out via [LinkedIn](https://www.linkedin.com/in/jaimevicentejr/) or [GitHub](https://github.com/your-username).
