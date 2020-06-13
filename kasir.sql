-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 13 Jun 2020 pada 18.35
-- Versi server: 10.1.36-MariaDB
-- Versi PHP: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kasir`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `barang`
--

CREATE TABLE `barang` (
  `id_barang` int(11) DEFAULT NULL,
  `nama_barang` varchar(50) DEFAULT NULL,
  `id_satuan` varchar(11) DEFAULT NULL,
  `harga` decimal(10,0) DEFAULT NULL,
  `ket_barang` text
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `barang`
--

INSERT INTO `barang` (`id_barang`, `nama_barang`, `id_satuan`, `harga`, `ket_barang`) VALUES
(2, 'Kemeja Flanel', 'KF1', '125000', 'Kemeja cowok'),
(3, 'Kaos ', 'KK1', '50000', 'Kaos All Size'),
(4, 'Jeans', 'JJ1', '150000', 'Jeans bahan adem dan lentur'),
(5, 'Celana Kain', 'CK1', '100000', 'Celana Kain Hitam,Navy,Cream'),
(6, 'Kaos Lengan Panjang', 'KL1', '75000', 'Unisex'),
(1, 'Jaket Hoodie', 'JH1', '150000', 'Hoodie Unisex');

-- --------------------------------------------------------

--
-- Struktur dari tabel `detail_faktur`
--

CREATE TABLE `detail_faktur` (
  `no_faktur` int(11) DEFAULT NULL,
  `no_item` int(11) DEFAULT NULL,
  `id_barang` int(11) DEFAULT NULL,
  `kuantitas` int(11) DEFAULT NULL,
  `diskon` decimal(8,0) DEFAULT '0'
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `detail_faktur`
--

INSERT INTO `detail_faktur` (`no_faktur`, `no_item`, `id_barang`, `kuantitas`, `diskon`) VALUES
(2, 2, 3, 6, '10'),
(2, 1, 2, 2, '0'),
(2, 2, 6, 1, '0'),
(2, 3, 3, 1, '0'),
(3, 1, 2, 2, '0'),
(3, 2, 3, 1, '0'),
(3, 3, 6, 1, '0'),
(4, 1, 2, 6, '10'),
(4, 2, 3, 4, '0'),
(4, 3, 4, 1, '0'),
(7, 1, 2, 6, '10'),
(7, 2, 4, 4, '0'),
(7, 1, 2, 6, '10'),
(8, 1, 2, 6, '10'),
(8, 2, 3, 4, '0'),
(8, 3, 4, 1, '0'),
(7, 1, 2, 2, '0'),
(9, 1, 1, 1, '0'),
(9, 2, 4, 1, '0'),
(9, 3, 5, 7, '10');

--
-- Trigger `detail_faktur`
--
DELIMITER $$
CREATE TRIGGER `diskon` BEFORE INSERT ON `detail_faktur` FOR EACH ROW BEGIN
	SET new.diskon = 
	IF (new.kuantitas > 5, 10,0);
    END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Struktur dari tabel `faktur`
--

CREATE TABLE `faktur` (
  `no_faktur` int(11) DEFAULT NULL,
  `tgl_faktur` date DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `faktur`
--

INSERT INTO `faktur` (`no_faktur`, `tgl_faktur`) VALUES
(1, '2012-11-19'),
(1, '2012-11-19'),
(1, '2012-11-19'),
(2, '2012-11-19'),
(2, '2012-11-19'),
(2, '2012-11-19'),
(2, '2012-11-19'),
(3, '2012-11-19'),
(3, '2012-11-19'),
(3, '2012-11-19'),
(3, '2012-11-19'),
(3, '2012-11-19'),
(4, '2012-11-19'),
(4, '2012-11-19'),
(4, '2012-11-19'),
(4, '2012-11-19'),
(7, '2012-11-19'),
(7, '2012-11-19'),
(7, '2012-11-19'),
(7, '2012-11-19'),
(7, '2012-11-19'),
(8, '2012-11-19'),
(8, '2012-11-19'),
(8, '2012-11-19'),
(8, '2012-11-19'),
(7, '2012-11-26'),
(7, '2012-11-26'),
(9, '2012-11-26'),
(9, '2012-11-26'),
(9, '2012-11-26'),
(9, '2012-11-26'),
(1, '2020-06-05'),
(1, '2021-10-03');

-- --------------------------------------------------------

--
-- Struktur dari tabel `login`
--

CREATE TABLE `login` (
  `id` int(11) NOT NULL,
  `user` varchar(15) DEFAULT NULL,
  `pass` varchar(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `login`
--

INSERT INTO `login` (`id`, `user`, `pass`) VALUES
(1, 'Anisha', 'anisha123');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pegawai`
--

CREATE TABLE `pegawai` (
  `nip` varchar(10) NOT NULL,
  `nama_peg` varchar(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `rekapan`
--

CREATE TABLE `rekapan` (
  `user` varchar(15) DEFAULT NULL,
  `pass` varchar(20) DEFAULT NULL,
  `status` varchar(12) DEFAULT NULL,
  `waktu` datetime DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `rekapan`
--

INSERT INTO `rekapan` (`user`, `pass`, `status`, `waktu`) VALUES
('user2', 'user2', 'tidak aktif', '2012-11-26 20:21:21'),
('user1', 'user1', 'aktif', '2012-11-26 20:20:40');

-- --------------------------------------------------------

--
-- Struktur dari tabel `satuan`
--

CREATE TABLE `satuan` (
  `id_satuan` int(11) NOT NULL,
  `jenis_satuan` varchar(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `satuan`
--

INSERT INTO `satuan` (`id_satuan`, `jenis_satuan`) VALUES
(1, '4'),
(2, '5'),
(100, 'buah');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `barang`
--
ALTER TABLE `barang` ADD FULLTEXT KEY `nama_barang` (`nama_barang`,`ket_barang`);

--
-- Indeks untuk tabel `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `pegawai`
--
ALTER TABLE `pegawai`
  ADD PRIMARY KEY (`nip`);

--
-- Indeks untuk tabel `satuan`
--
ALTER TABLE `satuan`
  ADD PRIMARY KEY (`id_satuan`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `satuan`
--
ALTER TABLE `satuan`
  MODIFY `id_satuan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=101;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
