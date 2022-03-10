# Editora Secauth - DW
  <br />

Lucas Tadra Mainginski - RA: 17504926 <br />
Luis Guilherme Molotto - RA: 18016126 <br />
Matheus Bilobrovec - RA: 18011426

## Sobre o projeto
Trabalho realizado para a disciplina de Desenvolvimento Web da UEPG, que consiste em desenvolver um sistema utilizando o Cognito da Amazon para login, junto com um CRUD de Artigos.

## Requisitos
- Java 11
- Apache Maven 3.8.4
- XAMPP
- MySql WorkBench 
- Visual Studio Code 
- Git
- Bootstrap 4
- Font-Awesome

## Como criar o projeto Spring
Utilizando a plataforma (https://start.spring.io/), conseguimos realizar o download de um zip contendo a estrutura inicial do nosso projeto a ser desenvolvido, adicionando as seguintes dependências: <br />
- Spring Web
- Spring Data JPA
- MySQL Driver
- Spring Boot DevTools
- OAuth2 Client
- Spring Security
- Thymeleaf

## Configurações de SGBD
Utilizando como base a configuração utilizada para o Trabalho 1 - Futebol, conseguimos configurar a conexão entre o nosso projeto e o banco de dados, no documento "application.properties".

## Packages desenvolvidos

### Model
- Artigo.java <br />
Os modelos desenvolvidos contém as instâncias dos atributos, os getters e os setters para cada atributo, métodos construtores, método ToSring, além de utilizar notações do Spring para determinar regras do BD, como chaves primárias, chaves estrangeiras, se um atributo pode ser falso ou não

### Repository
- ArtigoRepository.java <br />
Nos repositórios criados extendemos o Repositório JPA que contém diversos métodos para utilizarmos no Controller e além disso é possível criar métodos novos.

### Controllers
- CriarController.java <br />
- DeletarController.java <br />
- EditarController.java <br />
- HomeController.java <br />
- ListarController.java <br />
- SecController.java <br />
Nos controladores criados as regras de negócio do nosso sistema, podendo utilizar os métodos do Repositório criado.

### Funcionalidades
As funcionalidades são de um crud básico: adicionar, listar, editar e deletar.


## Testes
### Banco de dados
- Utilizamos o MySQL Workbench para visualizar de melhor forma o que estava acontecendo com o banco. <br />
- Quando foi configurada a conexão entre projeto e banco de dados do XAMPP, os modelos já estavam programados, quando a aplicação era iniciada as tabelas foram criadas de forma automática. <br />

### Rotas
- Foi criado o frontend desta vez para que pudessemos ver se as rotas estavam de acordo, além de conferir os dados no banco através do MYSQL Workbench.

## Materiais complementares
- [Como instalar e configurar Apache Maven - Loiane Groiner] (https://www.youtube.com/watch?v=jIa8R69pKh8) <br />
- [Playlist Spring Data - xavecoding - prof. samuka] (https://www.youtube.com/watch?v=YDTW9e_17e8&list=PL3ZslI15yo2p5LMl-r7KtsVkC6hsucsJp&index=1)
