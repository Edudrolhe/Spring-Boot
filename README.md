# Spring Boot Demo

Projeto de exemplo utilizando Spring Boot para gerenciamento de pessoas, com interface web simples.

## Funcionalidades

- Cadastro de pessoas
- Listagem de pessoas cadastradas
- Interface web intuitiva

## Imagens do Projeto

### Tela Inicial
![Tela Inicial](https://raw.githubusercontent.com/Edudrolhe/Spring-Boot/main/docs/images/01.png)

### Formulário de Cadastro
![Formulário](https://raw.githubusercontent.com/Edudrolhe/Spring-Boot/main/docs/images/02.png)

### Lista de Pessoas
![Lista](https://raw.githubusercontent.com/Edudrolhe/Spring-Boot/main/docs/images/03.png)

### Detalhes
![Detalhes](https://raw.githubusercontent.com/Edudrolhe/Spring-Boot/main/docs/images/04.png)

### Interface
![Interface](https://raw.githubusercontent.com/Edudrolhe/Spring-Boot/main/docs/images/05.png)

## Como executar

1. Clone o repositório:
```bash
git clone https://github.com/Edudrolhe/Spring-Boot.git
```

2. Entre na pasta do projeto:
```bash
cd Spring-Boot
```

3. Execute o projeto:
```bash
./mvnw spring-boot:run
```

4. Acesse no navegador:
```
http://localhost:8080
```

## Tecnologias Utilizadas

- **Java** - Linguagem de programação
- **Spring Boot** - Framework para desenvolvimento de aplicações Java
- **Thymeleaf** - Template engine para渲染 páginas HTML
- **H2 Database** - Banco de dados em memória
- **Maven** - Gerenciador de dependências

## Estrutura do Projeto

```
src/
├── main/
│   ├── java/com/example/demo/
│   │   ├── controller/    # Controladores REST
│   │   ├── model/         # Modelos de dados
│   │   └── repository/    # Repositórios
│   └── resources/
│       ├── templates/     # Arquivos HTML
│       ├── schema.sql     # Estrutura do banco
│       └── data.sql       # Dados iniciais
└── test/                  # Testes
```

## Autor

Eduardo Drolhe
