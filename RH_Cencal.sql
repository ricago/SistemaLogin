
CREATE SCHEMA IF NOT EXISTS RHCencal DEFAULT CHARACTER SET utf8 ;
USE RHCencal ;

-- -----------------------------------------------------
-- Table RHCencal.Utilizador
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS RHCencal.Utilizador (
  idUtilizador INT NOT NULL AUTO_INCREMENT,
  nome VARCHAR(60) NOT NULL,
  email VARCHAR(40) NOT NULL,
  morada VARCHAR(80) NOT NULL,
  telefone DECIMAL(9) NOT NULL,
  nif DECIMAL(9) NOT NULL,
  login VARCHAR(30) NOT NULL,
  password VARCHAR(25) NOT NULL,
  PRIMARY KEY (idUtilizador));