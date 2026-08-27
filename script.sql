-- Criação da tabela Cliente
CREATE TABLE Cliente (
                         id_cliente INT PRIMARY KEY,
                         nome VARCHAR(100) NOT NULL,
                         email VARCHAR(100),
);

-- Criação da tabela Livro
CREATE TABLE Livro (
                       id_livro INT PRIMARY KEY,
                       titulo VARCHAR(150) NOT NULL,
                       autor VARCHAR(100),
);

-- Criação da tabela Pedido
CREATE TABLE Pedido (
                        id_pedido INT PRIMARY KEY,
                        data_pedido DATE,
                        valor_total DECIMAL(10,2),
);

