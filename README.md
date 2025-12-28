# Springboot_Lab2

# Spring Boot Demo Project

This is a **Spring Boot Maven project** created using **VS Code**.  
The project demonstrates **bean lifecycle concepts** and follows the **standard Maven directory structure**.

---

## 📁 Project Structure
```
Demo
|───.mvn
│   └───wrapper
├───.vscode
├───src
│   ├───main
│   │   ├───java
│   │   │   ├───bean_lifecycle
│   │   │   └───com
│   │   │       └───demo
│   │   │           └───demo
│   │   └───resources
│   │       ├───static
│   │       └───templates
│   └───test
│       └───java
│           └───com
│               └───demo
│                   └───demo
└───target
    ├───classes
    │   └───com
    │       └───demo
    │           └───demo
    ├───generated-sources
    │   └───annotations
    ├───generated-test-sources
    │   └───test-annotations
    ├───maven-archiver
    ├───maven-status
    │   └───maven-compiler-plugin
    │       ├───compile
    │       │   └───default-compile
    │       └───testCompile
    │           └───default-testCompile
    ├───surefire-reports
    └───test-classes
        └───com
            └───demo
                └───demo
```


---

## 🛠️ Technologies Used

- Java
- Spring Boot
- Maven
- VS Code

---

## 📂 Folder Description

- **.mvn/wrapper**  
  Maven Wrapper files (ensures Maven version consistency)

- **.vscode**  
  VS Code workspace configuration

- **src/main/java**  
  Main Java source code  
  - `bean_lifecycle` – Bean lifecycle examples  
  - `com.demo.demo` – Application packages

- **src/main/resources**  
  Application resources  
  - `static` – Static assets  
  - `templates` – HTML templates (Thymeleaf)

- **src/test/java**  
  Test source code

- **target**  
  Auto-generated build output (compiled classes, reports)

---

## ▶️ How to Run the Project

### Using Maven Wrapper
```bash
mvn clean install
mvn spring-boot:run

