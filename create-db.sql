CREATE DATABASE  IF NOT EXISTS `inventaire_directory`;
USE `inventaire_directory`;

DROP TABLE IF EXISTS `alimentaire`;

CREATE TABLE `alimentaire` (
  `id` int NOT NULL AUTO_INCREMENT,
  `code` varchar(200) DEFAULT NULL,
  `product_name` varchar(200) DEFAULT NULL,
  `categories_tags` varchar(200) DEFAULT NULL,
  `brand` varchar(200) DEFAULT NULL,
  `nutriscore` varchar(1) DEFAULT NULL,
  `allergens` varchar(200) DEFAULT NULL,
  `number` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
