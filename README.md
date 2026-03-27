# Desafio Final - Bootcamp Arquiteto de Software | XP Educação

API RESTful desenvolvida em Java com Spring Boot, seguindo o padrão arquitetural MVC, como entrega do desafio final do Bootcamp de Arquiteto de Software da XP Educação.

## Tecnologias Utilizadas

- Java 17
- Spring Boot 3.2
- Spring Web
- Spring Data JPA
- Banco de Dados H2 (in-memory)
- Springdoc OpenAPI (Swagger UI)
- Maven

## Arquitetura MVC

```
src/main/java/com/desafio/api/
├── controller/         # Recebe as requisições HTTP e retorna as respostas
├── model/              # Entidade de domínio (Cliente)
├── repository/         # Interface JPA para acesso ao banco de dados
├── service/            # Lógica de negócio
└── config/             # Configurações (Swagger)
```

| Camada | Responsabilidade |
|--------|-----------------|
| `Controller` | Mapeia os endpoints REST, delega ao Service |
| `Service` | Contém as regras de negócio da aplicação |
| `Repository` | Realiza as operações de persistência via JPA |
| `Model` | Define a entidade `Cliente` e seus atributos |

## Endpoints da API

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| `POST` | `/clientes` | Criar novo cliente |
| `GET` | `/clientes` | Listar todos os clientes |
| `GET` | `/clientes/{id}` | Buscar cliente por ID |
| `GET` | `/clientes/nome/{nome}` | Buscar clientes por nome |
| `GET` | `/clientes/contar` | Retornar total de clientes |
| `PUT` | `/clientes/{id}` | Atualizar cliente |
| `DELETE` | `/clientes/{id}` | Deletar cliente |

## Como Executar

### Pré-requisitos
- Java 17+
- Maven 3.8+

### Rodando o projeto

```bash
# Clonar o repositório
git clone https://github.com/seu-usuario/desafio-final-XPeducacao.git

# Entrar na pasta
cd desafio-final-XPeducacao

# Executar
mvn spring-boot:run
```

A aplicação sobe na porta `8080`.

## Documentação Swagger

Após iniciar, acesse:

```
http://localhost:8080/swagger-ui/index.html
```

## Console H2 (Banco de Dados)

Para visualizar os dados em memória:

```
http://localhost:8080/h2-console
```

| Campo | Valor |
|-------|-------|
| JDBC URL | `jdbc:h2:mem:desafiodb` |
| Username | `sa` |
| Password | _(vazio)_ |

## Diagrama Arquitetural

O arquivo `diagrama-arquitetura.drawio` na raiz do projeto contém o diagrama completo da arquitetura, podendo ser aberto em [draw.io](https://app.diagrams.net).