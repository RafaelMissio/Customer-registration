# Customer Registration API

API REST para cadastro e gerenciamento de clientes, construída com Spring Boot, Spring Data JPA e banco H2 em memória.

## Tecnologias

- Java 25
- Spring Boot 4.1.1
- Spring Web MVC
- Spring Data JPA
- Bean Validation
- H2 Database
- springdoc OpenAPI (Swagger UI)
- ModelMapper

## Como executar

### Pré-requisitos

- JDK 25
- Maven (ou usar o wrapper `mvnw`)

### Subir a aplicação

No diretório raiz do projeto:

```bash
./mvnw spring-boot:run
```

No Windows (PowerShell/CMD):

```bat
mvnw.cmd spring-boot:run
```

A aplicação iniciará, por padrão, na porta `8080`.

## Banco H2 e seed

O projeto usa H2 em memória com seed automático via `src/main/resources/data.sql`.

Configurações principais em `src/main/resources/application.yaml`:

- URL: `jdbc:h2:mem:customer-registration;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE`
- Console H2 habilitado em: `/h2-console`
- Inicialização SQL sempre ativa: `spring.sql.init.mode=always`
- Execução do `data.sql` após JPA: `spring.jpa.defer-datasource-initialization=true`

### Acessar console H2

- URL: `http://localhost:8080/h2-console`
- JDBC URL: `jdbc:h2:mem:customer-registration`
- User: `sa`
- Password: *(vazio)*

## Documentação da API

Com a aplicação rodando:

- Swagger UI: `http://localhost:8080/swagger-ui.html` (ou `/swagger-ui/index.html`)

## Endpoints principais

Base path: `/clients`

- `GET /clients/{id}`: busca cliente por ID
- `GET /clients`: lista paginada de clientes
- `POST /clients`: cria cliente
- `PUT /clients/{id}`: atualiza cliente
- `DELETE /clients/{id}`: remove cliente

### Exemplo de payload (POST/PUT)

```json
{
  "name": "Ana Souza",
  "cpf": "12345678901",
  "income": 3500.0,
  "birthDate": "1990-05-12",
  "children": 2
}
```

> Não envie `id` no `POST`; ele é gerado automaticamente.

## Estrutura do projeto

```text
src/main/java/br/com/missio/Customer_registration
├── configuration
├── controllers
├── dto
├── entities
├── repositories
└── services
```

## Testes

Para executar os testes:

```bash
./mvnw test
```

No Windows:

```bat
mvnw.cmd test
```
