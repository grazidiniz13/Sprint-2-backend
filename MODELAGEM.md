# 🗺️ Documento do Modelo Conceitual - Sprint 2

## 1. Lista de Entidades
O sistema foi modelado com base nas seguintes entidades principais:
- Cliente
- Livro
- Pedido

## 2. Atributos e Chaves Primárias (PK)

### **Cliente**
- **`id_cliente` (PK)**: Identificador único do cliente.
- `nome`: Nome completo.
- `email`: Endereço de e-mail.
- `telefone`: Contato telefônico.

### **Livro**
- **`id_livro` (PK)**: Identificador único do livro.
- `titulo`: Título da obra.
- `autor`: Nome do autor.
- `preco`: Preço unitário.
- `estoque`: Quantidade de exemplares disponíveis.

### **Pedido**
- **`id_pedido` (PK)**: Identificador único da transação.
- `data_pedido`: Data da realização da compra.
- `valor_total`: Valor somado dos itens.

## 3. Relacionamentos
- **Cliente para Pedido (1:N):** Um cliente pode fazer zero ou múltiplos pedidos ao longo do tempo. Cada pedido pertence obrigatoriamente a um único cliente.
- **Pedido para Livro (N:N):** Um pedido pode registrar a compra de um ou mais livros, assim como um livro pode ser vendido em vários pedidos diferentes.
