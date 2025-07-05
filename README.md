# 🚛 Cálculo de Frete – Serviço GraphQL

Este serviço calcula o **valor do frete para entrega de caixas de tomate**, com base na **distância** e no **tipo de veículo** utilizado (caminhão ou carreta). Aplica descontos em trechos longos e inclui taxas fixas.

Projeto desenvolvido para a disciplina **Sistemas Web 3** – UFRRJ  
Aluno: **Matheus Torres**

---

## 🧰 Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring GraphQL
- Maven

---

## 🎯 Objetivo

Oferecer um endpoint GraphQL que receba a distância e o tipo de veículo, e retorne o valor total do frete conforme as regras de negócio.

---

## 🚚 Regras de Cálculo do Frete

| Tipo de veículo | Até caixas | Custo por km | Desconto após 100km | Taxa fixa |
|------------------|------------|----------------|----------------------|------------|
| Caminhão         | até 250    | R$ 20,00/km    | 20% nos km excedentes| R$ 200     |
| Carreta          | até 1500   | R$ 40,00/km    | 20% nos km excedentes| R$ 400     |

---

## 🚀 Como Executar o Projeto

### 1. Clonar o repositório

```
git clone https://github.com/MatheuzTorres/frete.git
cd frete
```

2. Rodar com Maven
```
./mvnw spring-boot:run
```

Ou, se usar Maven instalado:
```
mvn spring-boot:run
```

O serviço ficará disponível em:

```
http://localhost:8082
```

🌐 Interface para Testes
Acesse:
```
http://localhost:8082/graphiql
````

🧪 Exemplo de Query
```
query {
  calcularFrete(distancia: 120.0, tipo: "caminhao")
}
```
Resposta esperada:
2520.0
