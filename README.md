# Burger Order API

## Sobre o Projeto

O Burger Order é uma API REST desenvolvida para gerenciamento de pedidos de uma hamburgueria.  
O sistema permite cadastrar usuários, produtos e pedidos, além de controlar o status dos pedidos realizados.

O projeto foi desenvolvido utilizando Java com Spring Boot e PostgreSQL, com o banco de dados hospedado na plataforma Neon.

---

# Tecnologias Utilizadas

* Java 17
* Spring Boot
* Spring Data JPA
* Hibernate
* PostgreSQL
* Neon Database
* Maven
* Git e GitHub
* Postman

---

# Estrutura do Projeto

```text
src/main/java/com/burgerorder/burgerorder
│
├── controller
├── model
├── repository
└── BurgerOrderApplication.java
```

## Camadas

### Controller

Responsável pelos endpoints da API.

### Model

Representação das entidades do sistema.

### Repository

Responsável pela comunicação com o banco de dados.

---

# Funcionalidades

* Cadastro de usuários
* Cadastro de produtos
* Criação de pedidos
* Atualização de status do pedido
* Consulta de pedidos
* Integração com banco PostgreSQL
* API REST completa

---

# Endpoints Principais

## Usuários

### Criar usuário

```http
POST /v1/users
```

### Listar usuários

```http
GET /v1/users
```

### Atualizar usuário

```http
PUT /v1/users/{id}
```

---

## Produtos

### Criar produto

```http
POST /v1/products
```

### Listar produtos

```http
GET /v1/products
```

---

## Pedidos

### Criar pedido

```http
POST /v1/orders
```

### Listar pedidos

```http
GET /v1/orders
```

### Buscar pedido por ID

```http
GET /v1/orders/{id}
```

### Atualizar status do pedido

```http
PATCH /v1/orders/{id}/status
```

### Deletar pedido

```http
DELETE /v1/orders/{id}
```

---

# Exemplos de Requisição

# Usuários

## Criar usuário

```http
POST /v1/users
```

```json
{
  "name": "Leonardo",
  "email": "leo@email.com",
  "password": "23092002"
}
```

---

## Listar usuários

```http
GET /v1/users
```

Resposta:

```json
[
  {
    "id": 1,
    "name": "Leonardo",
    "email": "leo@email.com",
    "password": "23092002"
  }
]
```

---

## Atualizar usuário

```http
PUT /v1/users/1
```

```json
{
  "name": "Leonardo Gomes",
  "email": "leogomes@email.com",
  "password": "123456"
}
```

---

# Produtos

## Criar produto

```http
POST /v1/products
```

```json
{
  "name": "X Bacon",
  "price": 25.90,
  "description": "Hamburguer com bacon",
  "stock": 10
}
```

---

## Listar produtos

```http
GET /v1/products
```

Resposta:

```json
[
  {
    "id": 1,
    "name": "X Bacon",
    "price": 25.90,
    "description": "Hamburguer com bacon",
    "stock": 10
  }
]
```

---

# Pedidos

## Criar pedido

```http
POST /v1/orders
```

```json
{
  "userId": 1,
  "items": [
    {
      "productId": 1,
      "quantity": 2
    },
    {
      "productId": 2,
      "quantity": 1
    }
  ]
}
```

---

## Listar pedidos

```http
GET /v1/orders
```

Resposta:

```json
[
  {
    "id": 1,
    "userId": 1,
    "total": 77.7,
    "status": "PENDENTE"
  }
]
```

---

## Buscar pedido por ID

```http
GET /v1/orders/1
```

Resposta:

```json
{
  "id": 1,
  "userId": 1,
  "total": 77.7,
  "status": "PENDENTE"
}
```

---

## Atualizar status do pedido

```http
PATCH /v1/orders/1/status
```

```json
{
  "status": "PREPARANDO"
}
```

---

## Deletar pedido

```http
DELETE /v1/orders/1
```

Resposta:

```text
Pedido deletado com sucesso
```

---

# Como Executar o Projeto

## 1. Clonar o repositório

```bash
git clone https://github.com/legomesz/burger-order.git
```

---

## 2. Abrir no IntelliJ IDEA

Abrir a pasta do projeto no IntelliJ IDEA.

---

## 3. Configurar banco de dados

Arquivo:

```text
src/main/resources/application.properties
```

Exemplo:

```properties
spring.datasource.url=jdbc:postgresql://...
spring.datasource.username=...
spring.datasource.password=...
```

---

## 4. Executar aplicação

Rodar a classe:

```text
BurgerOrderApplication.java
```

---

# Objetivo Acadêmico

O projeto foi desenvolvido para fins acadêmicos na disciplina de Back-End, ministrada pelo professor João Martins.

O sistema teve como objetivo aplicar conceitos de:

* API REST
* CRUD
* Integração com banco de dados
* Organização em camadas
* Versionamento com GitHub
* Desenvolvimento Back-End

---

# Autor

Leonardo Gomes
