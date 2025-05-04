
 # Api Restful Sistema Bancario

# Api Bancária - Sistema de Gerenciamento Bancário

## 📖 Sobre

O **Api Bancária** é um sistema backend desenvolvido com **Spring Boot** para gerenciar as operações bancárias, incluindo a criação de contas, transações e gerenciamento de clientes. O projeto utiliza o **PostgreSQL** como banco de dados e foi desenvolvido por **Marco Antônio**. O objetivo é proporcionar um sistema eficiente e escalável para serviços bancários, implementando uma arquitetura moderna e segura.

## 🚀 Tecnologias

![Java](https://img.shields.io/badge/Java-17-blue?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.1.1-green?style=for-the-badge&logo=springboot&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-7.6-blue?style=for-the-badge&logo=gradle&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-42.5.6-blue?style=for-the-badge&logo=postgresql&logoColor=white)
![H2](https://img.shields.io/badge/H2-2.1.214-blue?style=for-the-badge&logo=h2&logoColor=white)
![JUnit5](https://img.shields.io/badge/JUnit5-5.9.2-green?style=for-the-badge&logo=junit&logoColor=white)
![Mockito](https://img.shields.io/badge/Mockito-4.8.1-blue?style=for-the-badge&logo=mockito&logoColor=white)

Este projeto utiliza as seguintes tecnologias:

- **Java**: Linguagem de programação utilizada para o backend.
- **Spring Boot**: Framework Java utilizado para criar APIs REST de maneira rápida e escalável.
- **PostgreSQL**: Banco de dados relacional utilizado em produção.
- **H2**: Banco de dados em memória utilizado para testes e desenvolvimento.
- **Gradle**: Sistema de automação de builds utilizado para gerenciar dependências e compilar o projeto.
- **JUnit5**: Framework de testes utilizado para realizar testes unitários e de integração.
- **Mockito**: Framework de mock utilizado para simular objetos em testes.

## 📊 Estado do Projeto

![Progresso](https://img.shields.io/badge/Progresso-80%25-green?style=for-the-badge&labelColor=000000&color=00FF00&logo=github)

> Atualmente, cerca de 80% das funcionalidades estão implementadas.

## Autor
### Marco Antônio

Desenvolvedor Full-Stack

[GitHub](https://github.com/marcosynky) | [LinkedIn](https://www.linkedin.com/in/marco-antônio-developer-fullstack)

## 📱 Funcionalidades

- Criação de contas bancárias e gerenciamento de dados do cliente.
- Realização de transações bancárias entre contas.
- Recuperação de saldo e histórico de transações.
- API RESTful para integração com front-end ou outras plataformas.

 ## Diagrama de Classes
 
 
 ```mermaid
classDiagram
    class Account {
        -String number
        -String agency
        -Float balance
        -Float limit
    }

    class Feature {
        -String icon
        -String description
    }

    class Card {
        -String number
        -Float limit
    }

    class News {
        -String icon
        -String description
    }

    class User {
        -String name
        -Account account
        -Feature[] features
        -Card card
        -News[] news
    }

    User "1"-- "1"Account 
    User "1"--"N"Feature 
    User "1"--"1"Card 
    User "1"--"N" News 

```


## 🛠️ Como Rodar o Projeto

### Pré-requisitos

1. **Java 17**: Certifique-se de ter o Java 17 ou superior instalado no seu sistema.
   - [Instalar Java](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)

2. **Gradle**: O projeto utiliza o Gradle para gerenciar as dependências e o processo de build.
   - [Instalar Gradle](https://gradle.org/install/)

3. **Banco de Dados PostgreSQL**: Utilize o PostgreSQL ou um banco de dados em memória (H2) para rodar o projeto.

### Passos para rodar o projeto

1. Clone o repositório para sua máquina local:

```bash
git clone https://github.com/marcosynky/api-bancaria.git

 

