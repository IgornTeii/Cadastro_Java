# Simulador de Cirurgia

Este projeto é um simulador de cirurgia básico desenvolvido em Java. Ele simula a interação de um usuário com um ambiente de treinamento cirúrgico, incluindo login, simulação de procedimentos e feedback sobre o desempenho.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

- **com.medicallab**
    - **modelo**
        - `Usuario.java`: Representa um usuário com informações básicas.
        - `Perfil.java`: Extensão de `Usuario` com um atributo adicional `especialidade`.
    - **servico**
        - `AutenticacaoService.java`: Gerencia a autenticação e autorização dos usuários.
        - `SimulacaoService.java`: Gerencia a simulação de procedimentos cirúrgicos.
        - `FeedbackService.java`: Fornece feedback sobre o desempenho dos usuários.
    - **aplicacao**
        - `MainApp.java`: Classe principal que executa a aplicação.
    - **teste**
        - `AutenticacaoServiceTest.java`: Testes unitários para verificar a funcionalidade do serviço de autenticação.

## Dependências

- JUnit 5: Biblioteca de testes unitários.

### Adicionando Dependências JUnit ao IntelliJ IDEA

1. Clique em **File > Project Structure**.
2. Na janela **Project Structure**, selecione **Modules** no painel esquerdo.
3. Clique na aba **Dependencies**.
4. Clique no ícone **+** e selecione **Library**.
5. Escolha **From Maven**.
6. Adicione `org.junit.jupiter:junit-jupiter-api:5.8.1` e `org.junit.jupiter:junit-jupiter-engine:5.8.1`.

## Como Funciona a Aplicação

### Dados Mockados

A aplicação utiliza dados mockados para simular o comportamento de um sistema real. Atualmente, há um usuário pré-registrado com as seguintes credenciais:

- **Email:** igor@email.com
- **Senha:** senha123
- **Nome:** Igor
- **Curso:** Medicina
- **Ano de Formação:** 2024

### Executando a Aplicação

1. Clone este repositório para o seu ambiente de desenvolvimento local.
2. Abra o projeto no IntelliJ IDEA.
3. Configure o seu SDK do Java, se ainda não estiver configurado.
4. Adicione as dependências do JUnit conforme descrito acima.
5. Compile o projeto.
6. Execute a classe `MainApp.java`.

### Uso da Aplicação

1. Quando a aplicação iniciar, você verá a mensagem: "Bem-vindo ao Simulador de Cirurgia".
2. Você será solicitado a inserir seu email e senha.
3. Utilize o email e senha mockados mencionados acima.
4. Se o login for bem-sucedido, a simulação de cirurgia será iniciada, incluindo a execução de procedimentos e fornecimento de feedback.
5. Se o login falhar, você verá a mensagem: "Email ou senha incorretos".

### Exemplo de Execução

- Bem-vindo ao Simulador de Cirurgia
- Digite seu email: igor@email.com
- Digite sua senha: senha123
- Iniciando simulação para: Igor
- Realizando procedimento...
- Simulação finalizada.
- Feedback: Procedimento realizado com sucesso. Precisa melhorar a precisão.


### Testes Unitários

Para executar os testes unitários:

1. Abra a classe `AutenticacaoServiceTest.java`.
2. Clique com o botão direito na classe e selecione **Run 'AutenticacaoServiceTest'**.

Os testes verificarão se o serviço de autenticação está funcionando corretamente.