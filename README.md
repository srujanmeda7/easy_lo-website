# Easy Lo Website

## Overview
Easy Lo Website is a full-stack web application that allows users to fill out an application form, with the submitted data being stored in a MySQL database using JPA. The frontend is developed with **React**, while the backend is built using **Java Spring Boot**.

## Technologies Used
- **Frontend:** React.js
- **Backend:** Java Spring Boot
- **Database:** MySQL
- **ORM:** JPA (Java Persistence API)

## Features 🚀
- 📝 **Application Form:** Users can fill out a form to submit their details.
- 🔄 **Full-Stack Integration:** The React frontend interacts with the Spring Boot backend.
- 🗄️ **Database Storage:** Data is stored in a MySQL database using JPA.
- ⚡ **REST API:** Backend exposes endpoints for form submission and data retrieval.

## Installation & Setup 🛠️

### Prerequisites
Ensure you have the following installed:
- Node.js & npm (for React frontend)
- Java 17+ (for Spring Boot backend)
- MySQL Database

### Clone the Repository
```sh
   git clone https://github.com/srujanmeda7/easy_lo-website.git
   cd easy_lo-website
```

### Backend Setup
1. Navigate to the backend directory:
```sh
   cd backend
```
2. Configure **application.properties** with your MySQL database credentials.
3. Run the Spring Boot application:
```sh
   mvn spring-boot:run
```

### Frontend Setup
1. Navigate to the frontend directory:
```sh
   cd frontend
```
2. Install dependencies:
```sh
   npm install
```
3. Start the React application:
```sh
   npm start
```

## API Endpoints 🌐
- **POST /submit-form** → Accepts form data and stores it in MySQL.
- **GET /applications** → Retrieves stored applications.

## Contribution Guidelines 🤝
1. Fork the repository.
2. Create a feature branch (`git checkout -b feature-name`).
3. Commit changes (`git commit -m 'Add new feature'`).
4. Push to the branch (`git push origin feature-name`).
5. Create a Pull Request.

## License 📜
This project is licensed under the MIT License.

---
Happy coding! 🚀

