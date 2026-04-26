# Installment Purchase Simulator

Sistema desenvolvido em **Java** para simulação de compras parceladas, permitindo calcular valores finais, parcelas mensais e aplicar regras financeiras relacionadas a pagamentos.

## Objetivo

Projeto criado para praticar conceitos fundamentais de desenvolvimento backend com Java, aplicando Programação Orientada a Objetos, lógica de negócio e modelagem de sistemas financeiros.

## Tecnologias Utilizadas

- Java
- Programação Orientada a Objetos (POO)
- Collections Framework
- Tratamento de Exceções
- Estrutura em Camadas
- Git e GitHub

## Funcionalidades

### Simulação de Compra

- Cadastro do valor total da compra
- Definição da quantidade de parcelas
- Cálculo automático do valor de cada parcela
- Exibição do valor total da compra parcelada
- Simulação detalhada da transação

### Regras Financeiras

- Parcelamento com ou sem juros
- Aplicação de juros conforme quantidade de parcelas
- Validação de número máximo de parcelas
- Validação de valores negativos ou inválidos
- Regras específicas por forma de pagamento

### Gerenciamento

- Histórico de simulações realizadas
- Consulta de operações registradas
- Organização dos dados processados

## Estrutura do Projeto

```text
src/
├── controller
├── model
├── view
├── exception
└── main


```

## Conceitos Praticados

- Encapsulamento
- Herança
- Polimorfismo
- Collections (`List`, `Map`)
- Regras de negócio
- Lógica condicional
- Validações
- Organização em camadas
- Separação de responsabilidades

## Pontos Positivos do Projeto

- Simula um cenário real de mercado (compras parceladas)
- Exercita cálculos financeiros e regras comerciais
- Demonstra capacidade de modelar domínio de negócio
- Reforça boas práticas com Java e POO
- Projeto relevante para portfólio backend
- Boa base para futura API financeira

## Melhorias Futuras

- Persistência com banco de dados MySQL/PostgreSQL
- API REST com Spring Boot
- Interface gráfica
- Testes automatizados com JUnit
- Exportação de relatórios
- Simulação de score de crédito
- Integração com gateway de pagamento real
- Autenticação de usuários

## Como Executar

1. Clone este repositório  
2. Abra o projeto em uma IDE Java  
3. Compile o projeto  
4. Execute a classe principal `Main`

## Autor

Desenvolvido por **Jhonatan Silva** como projeto de estudo voltado à evolução técnica em Java, Programação Orientada a Objetos e lógica aplicada a sistemas financeiros.