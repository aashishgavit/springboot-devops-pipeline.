# 🚀 Spring Boot DevOps Pipeline

**Spring Boot REST API with Docker, GitHub Actions, and automated CI/CD pipeline.**

> **DeployHub** — A production-ready Spring Boot REST API demonstrating containerization and automated CI/CD using Docker and GitHub Actions.

---

## 🛠️ Tech Stack

**Java → Spring Boot → REST API → Maven → Docker → GitHub Actions → CI/CD**

---

## 🔄 CI/CD Pipeline

```text
Code Push
    ↓
GitHub Repository
    ↓
GitHub Actions
    ↓
Maven Build
    ↓
Run Unit Tests
    ↓
Build Docker Image
    ↓
Deploy
```

---

## 📂 Project Structure

```text
springboot-devops-pipeline/
│
├── src/
│   ├── main/
│   └── test/
│
├── .github/
│   └── workflows/
│       └── ci-cd.yml
│
├── Dockerfile
├── docker-compose.yml
├── pom.xml
└── README.md
```

---

## 🐳 Run Locally

### 1. Clone the Repository

```bash
git clone https://github.com/YOUR_USERNAME/springboot-devops-pipeline.git
cd springboot-devops-pipeline
```

### 2. Build the Application

```bash
mvn clean package
```

### 3. Build Docker Image

```bash
docker build -t deployhub .
```

### 4. Run Docker Container

```bash
docker run -p 8080:8080 deployhub
```

### 5. Access the Application

```text
http://localhost:8080
```

---

## 🧪 Run Tests

Run the unit tests using Maven:

```bash
mvn test
```

---

## ⚙️ GitHub Actions

The CI/CD workflow is configured in:

```text
.github/workflows/ci-cd.yml
```

The workflow automatically:

* Builds the Spring Boot application
* Runs unit tests
* Creates the Docker image
* Executes the CI/CD pipeline on code changes
* Deploys the application

---

## 🎯 Purpose

This project demonstrates a complete modern development workflow:

```text
Code
  ↓
Build
  ↓
Test
  ↓
Dockerize
  ↓
CI/CD
  ↓
Deployment
```

It showcases practical skills in:

* Java
* Spring Boot
* REST API development
* Maven
* Docker
* GitHub Actions
* CI/CD
* DevOps

---

## 👨‍💻 Author

**Aashish Gavit**

Java / Spring Boot Developer

---

⭐ If you find this project useful, consider giving it a star!
