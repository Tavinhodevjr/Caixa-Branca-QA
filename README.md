# 📊 Análise de Código - Teste de Caixa Branca Estático 🛠️

Este repositório contém a análise de código do exercício de Teste de Caixa Branca Estático para a disciplina de QA e Testes de Software, que foi realizado em 4 Etapas.

# Etapa 1 - Identificação de Erros, criação do repositório e elaboração do read.me (esse que está lendo)

## ⚠️ Problemas Identificados  

Abaixo, estão listados os problemas encontrados no código, junto com as correções sugeridas:  

### 📝 1. Documentação Ausente  
- **Erro:** O código não possui comentários explicativos ou documentação.  
- **Correção:** Adicionar comentários para descrever os métodos, variáveis e fluxos do programa.  

### 💡 2. Nomeclatura Pouco Significativa  
- **Erro:** A classe `User` e variáveis como `nome`, `result` e `sql` não são descritivas, ainda mais se considerarmos a mistura de idioma e não cumprimento de boas práticas para descrição de variáveis. 

- **Correção:**  
  - Renomear a classe para algo mais representativo, como `loginUser`.  
  - Usar nomes de variáveis mais específicos, como `nameUser`, `resultConnection` e `querySql`.  

### 🚫 3. Possível `NullPointerException`  
- **Erro:** No método `verificarUsuario`, a variável `conn` pode ser `null` se a conexão falhar no método `conectarBD`.  
- **Correção:** Verificar se `conn` é diferente de `null` antes de usá-la para confirmar a conexão com o banco de dados. 

### 🔍 4. Tratamento de Exceções Incompleto  
- **Erro:** Os blocos `catch` não tratam as exceções ou exibem mensagens, além de estarem incompletos tanto descritivamente, como na sua sintaxe.
- **Correção:** Adicionar mensagens de erro para visualização dos problemas é uma solução.  

### 🏛️ 5. Violação de Arquitetura  
- **Erro:** O código mistura a lógica de acesso ao banco de dados e a lógica de negócio na mesma classe.  
- **Correção:**  
  - Separar a lógica utilizada no código, se possível utilizando o padrão DAO.

# Etapa 2 - Preenchimento do Formulário de Teste Estático

### Sobre o Formulário  
O formulário, disponível no arquivo **PLANO DE TESTE.xls**, contém:  
- Identificação dos problemas encontrados no código.  
- Status de conformidade com os itens avaliados.  
- Correções sugeridas para cada problema identificado.  

### Ações Realizadas  
1. Preenchimento completo do formulário com base nos erros identificados.  
2. Salvamento do arquivo no formato `.xls`.  
3. Inclusão do arquivo no repositório remoto na branch atual.  

### Localização do Arquivo  
O arquivo está disponível na seguinte estrutura do repositório:  

- 📂/public/planilhas/
└── Plano de Teste.xls

## Etapa 3 - Elaboração do Grafo de Fluxo e Cálculo da Complexidade Ciclomática

### 🔄 1. Grafo de Fluxo

- O grafo de fluxo foi elaborado com base nos pontos significativos do código, considerando os fluxos de controle.
- Para a elaboração do grafo de fluxo, foi criado um novo arquivo loginUser.java no qual foram pontuados os nós dentro do código, através de comentários. 

- Grafo Visual 🎨

### Grafo de Fluxo ![Imagem do Grafo de Fluxo](public/images/Grafo%20de%20Fluxo.png)

### 🔄 2. Complexidade Ciclomática

- A complexidade ciclomática foi calculada utilizando a fórmula:
  - M=E−N+2P
  - M=E−N+2P

- Onde:
    -  E (arestas): 🔗 26
    -  N (nós): 📍 15
    -  P (componentes conectados): 1️⃣

- Resultado: A complexidade ciclomática é 3️⃣, indicando que o código possui três caminhos lineares independentes.

**Autor:** [Otávio Pampolha]  
**Data:** [01-12-2024]  
