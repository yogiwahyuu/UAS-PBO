-- phpMyAdmin SQL Dump
-- version 4.1.6
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jan 06, 2017 at 05:59 AM
-- Server version: 5.6.16
-- PHP Version: 5.5.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `datapemesanantiket`
--

-- --------------------------------------------------------

--
-- Table structure for table `pemesanan`
--

CREATE TABLE IF NOT EXISTS `pemesanan` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nama_pemesan` varchar(30) DEFAULT NULL,
  `telp` varchar(15) NOT NULL,
  `nama_kereta` varchar(15) NOT NULL,
  `kelas` varchar(10) NOT NULL,
  `stasiun_asal` varchar(10) NOT NULL,
  `stasiun_tujuan` varchar(10) NOT NULL,
  `tgl_berangkat` varchar(20) NOT NULL,
  `jam_berangkat` varchar(5) NOT NULL,
  `harga` int(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `pemesanan`
--

INSERT INTO `pemesanan` (`id`, `nama_pemesan`, `telp`, `nama_kereta`, `kelas`, `stasiun_asal`, `stasiun_tujuan`, `tgl_berangkat`, `jam_berangkat`, `harga`) VALUES
(1, 'Rutri', '0846345', 'Argo', 'Bisnis', 'solo', 'jkt', '9', '9', 100000);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
