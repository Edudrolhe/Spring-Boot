-- A estrutura é criada automaticamente pelo Hibernate, 
-- mas você pode personalizar se necessário
DROP TABLE IF EXISTS pessoas;

CREATE TABLE pessoas (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    usuario VARCHAR(100) NOT NULL,
    telefone VARCHAR(20) NOT NULL
);