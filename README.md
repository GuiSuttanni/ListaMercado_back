# ListaMercado_back PT_BR
O aplicativo de Lista de Compras é uma aplicação web que permite aos usuários criar uma lista de compras. Os usuários podem adicionar itens à lista, visualizar os itens existentes e excluí-los conforme necessário. É uma solução simples e prática para organizar e gerenciar suas compras de forma eficiente.

# Market List Backend
This repository contains the backend implementation of the Market List application. It provides the server-side functionality to handle item management for the market list.

# Prerequisites
Before running the backend, make sure you have the following installed:

Java Development Kit (JDK) version 8 or higher
Apache Maven

# Getting Started
To set up and run the backend server, follow these steps:

Clone this repository to your local machine:
```bash
git clone <backend-repo-url>
```

Navigate to the project directory:
```bash
cd market-list-backend
```

Build the project using Maven:
```bash
mvn clean install
```

Start the backend server:
```bash
mvn spring-boot:run
```

The server will run on http://localhost:8080.

# API Endpoints
The following endpoints are available in the backend:

GET /api/items: Retrieve all items in the market list.
POST /api/items: Add a new item to the market list.
DELETE /api/items/{itemId}: Delete an item from the market list.

# Technologies Used
The backend is built using the following technologies and frameworks:

Java
Spring Boot
Maven
