CREATE DATABASE ficha_cadastro;
USE ficha_cadastro; 

CREATE TABLE ficha(
id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(150) NOT NULL,
email VARCHAR(150) NOT NULL,
dataVencimento DATE NOT NULL


);


INSERT INTO  ficha (nome, email, dataVencimento) VALUES ('Mateus Souza', 'mateussouzabr1@gmail.com', '2026-02-24');
SELECT nome AS 'Nome do Usúario', email AS 'Email de Cadastro', date_format(dataVencimento, '%d/%m/%Y') AS 'DATA VENCIMENTO OFFICE' FROM ficha;

-- Fazer select  SELECT * FROM ficha_cadastro
-- Fazer select  SELECT dataVencimento FROM ficha_Cadastro order By desc
-- Fazer um delete para um id especifico (usar WHERE)
-- Alterar o campo dataVencimento de um id especifico 
-- Criar um novo registro com nome, email, data vencimento 