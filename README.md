# Burger Order API

## Sobre o Projeto

O **Burger Order** é uma API REST desenvolvida para gerenciamento de pedidos de uma hamburgueria.

O sistema permite:

* cadastro de usuários
* cadastro de produtos
* criação de pedidos
* consulta de pedidos
* atualização de status
* exclusão de registros

O projeto foi desenvolvido com **Java + Spring Boot**, utilizando **PostgreSQL** como banco de dados, hospedado na plataforma **Neon Database**.

Além disso, o sistema foi ajustado para exibir o **nome dos produtos dentro dos pedidos**, tornando as respostas da API mais intuitivas e próximas de um cenário real.

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

---

# Arquitetura em Camadas

## Controller

Responsável pelos endpoints da API e pelo recebimento das requisições HTTP.

## Model

Representação das entidades do sistema.

## Repository

Responsável pela comunicação com o banco de dados.

---

# Funcionalidades

✅ Cadastro de usuários
✅ Cadastro de produtos
✅ Criação de pedidos
✅ Consulta de pedidos
✅ Atualização parcial ou total de usuários
✅ Atualização de status do pedido
✅ Exclusão de registros
✅ Integração com PostgreSQL
✅ Exibição do nome dos produtos nos pedidos
✅ API REST completa

---

# Endpoints

# Usuários

## Criar usuário

```http
POST /v1/users
```

Exemplo:

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

## Buscar usuário por ID

```http
GET /v1/users/1
```

---

## Atualizar usuário (total ou parcial)

```http
PUT /v1/users/1
```

Atualização completa:

```json
{
  "name": "Leonardo Gomes",
  "email": "leogomes@email.com",
  "password": "123456"
}
```

Atualização parcial:

```json
{
  "password": "novaSenha123"
}
```

---

## Deletar usuário

```http
DELETE /v1/users/1
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
  "description": "Hambúrguer artesanal com bacon"
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
    "description": "Hambúrguer artesanal com bacon"
  }
]
```

---

## Buscar produto por ID

```http
GET /v1/products/1
```

---

## Atualizar produto

```http
PUT /v1/products/1
```

```json
{
  "name": "X Bacon Especial",
  "price": 29.90,
  "description": "Versão especial"
}
```

---

## Deletar produto

```http
DELETE /v1/products/1
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
    "status": "PENDENTE",
    "items": [
      {
        "productName": "X Bacon",
        "quantity": 2
      },
      {
        "productName": "Batata Frita",
        "quantity": 1
      }
    ]
  }
]
```

---

## Buscar pedido por ID

```http
GET /v1/orders/1
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

---

# Como Executar o Projeto

## 1. Clonar repositório

```bash
git clone https://github.com/legomesz/burger-order.git
```

---

## 2. Abrir no IntelliJ IDEA

Abrir a pasta do projeto.

---

## 3. Configurar banco

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

Rodar:

```text
BurgerOrderApplication.java
```

ou pelo terminal:

```bash
./mvnw spring-boot:run
```

---

# Testes

Os endpoints foram testados utilizando **Postman**, com execução validada em:

* Windows
* macOS

---

# Objetivo Acadêmico

Projeto desenvolvido para a disciplina de **Back-End**, ministrada pelo professor **João Martins**.

Conceitos aplicados:

* API REST
* CRUD
* Integração com banco de dados
* Organização em camadas
* Versionamento com Git/GitHub
* Persistência com JPA/Hibernate
* Desenvolvimento backend com Spring Boot

---

# Autor

**Leonardo Gomes**
