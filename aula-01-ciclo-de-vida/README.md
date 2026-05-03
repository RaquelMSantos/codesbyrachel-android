# 📱 Aula 01 — Ciclo de Vida da Activity

Aprenda na prática como funciona o Ciclo de Vida de uma Activity no Android! E por que seu app
“reseta” ao girar a tela.

> ⚠️ Este repositório é um material de apoio.  
> A explicação completa está no vídeo.

---

## 🎥 Assista no Youtube

👉Assista a aula completa: https://youtu.be/u5UXKjP0DAo

---

## 🧠 Resumo da aula

Nesta aula você vai entender:

- Como os principais callbacks do ciclo de vida funcionam
- O que acontece quando a Activity é recriada
- Por que os dados somem ao rotacionar a tela
- Como resolver isso usando `onSaveInstanceState`

---

## 🧩 Estrutura do projeto

O projeto foi construído de forma progressiva seguindo os passos da aula:

- **step-01** → Criação do layout inicial
- **step-02** → Logs do ciclo de vida
- **step-03** → Salvando estado com `onSaveInstanceState`
- **step-04** → Mini desafio (salvar último pedido)

---

## 🚀 Como usar este repositório

Você pode aprender de duas formas:

### 👉 1. Assistindo a aula

Siga o vídeo e acompanhe o código aqui.

### 👉 2. Navegando pelos commits

Cada etapa da aula foi separada em commits seguindo este padrão:

- feat(aula-01): step-01 create initial order counter layout
- feat(aula-01): step-02 add logs to all activity lifecycle callbacks
- feat(aula-01): step-03 save state using onSaveInstanceState
- feat(aula-01): step-04 add mini challenge

Isso permite que você volte no histórico e acompanhe a evolução do código passo a passo.

---

## 🎯 Desafio

Tente implementar o mini desafio antes de ver a solução.

---

## 📌 Observação

Este projeto usa `findViewById` para manter o foco no ciclo de vida.