-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 30-Jun-2017 às 22:51
-- Versão do servidor: 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `masb_jogador`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `masb_jogador`
--

CREATE TABLE `masb_jogador` (
  `id` int(50) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `data_nascimento` varchar(50) NOT NULL,
  `sexo` varchar(50) NOT NULL,
  `altura` double NOT NULL,
  `peso` double NOT NULL,
  `imc` double NOT NULL,
  `classificacao` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `masb_jogador`
--

INSERT INTO `masb_jogador` (`id`, `nome`, `data_nascimento`, `sexo`, `altura`, `peso`, `imc`, `classificacao`) VALUES
(1, 'maria', '7051997', '0', 1.65, 53, 29, 'Acima do peso'),
(2, 'maria', '7051997', '0', 1.65, 53, 29, 'Acima do peso'),
(3, 'maria', '7051997', 'masculino', 1.65, 53, 29, 'Acima do peso'),
(4, 'marcio', '09111996', 'masculino', 1.65, 53, 29, 'Acima do peso');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `masb_jogador`
--
ALTER TABLE `masb_jogador`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `masb_jogador`
--
ALTER TABLE `masb_jogador`
  MODIFY `id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
