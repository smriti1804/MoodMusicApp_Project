CREATE DATABASE  IF NOT EXISTS `mood_db` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `mood_db`;
-- MySQL dump 10.13  Distrib 8.0.43, for Win64 (x86_64)
--
-- Host: localhost    Database: mood_db
-- ------------------------------------------------------
-- Server version	8.4.6

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `mood_data`
--

DROP TABLE IF EXISTS `mood_data`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mood_data` (
  `id` int NOT NULL AUTO_INCREMENT,
  `mood` varchar(50) DEFAULT NULL,
  `music_link` text,
  `quote` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mood_data`
--

LOCK TABLES `mood_data` WRITE;
/*!40000 ALTER TABLE `mood_data` DISABLE KEYS */;
INSERT INTO `mood_data` VALUES (1,'Happy','https://youtu.be/TqBa4XeUcRQ?si=hYo4cNJs2PSnYf1S','Happiness is a journey, not a destination.'),(2,'Sad','https://www.youtube.com/watch?v=RgKAFK5djSk','Tears are words the heart cannot express, but you can overcome your sadness :)'),(3,'Angry','https://www.youtube.com/watch?v=QJO3ROT-A4E','An action committed in anger is an action doomed to failure.'),(4,'Upset','https://www.youtube.com/watch?v=RB-RcX5DS5A','It?s okay to feel sad sometimes, it means you care.'),(5,'Motivated','https://www.youtube.com/watch?v=ZXsQAXx_ao0','Push yourself, because no one else will do it for you.'),(6,'Relaxed','https://www.youtube.com/watch?v=2Vv-BfVoq4g','Peace begins with a smile.');
/*!40000 ALTER TABLE `mood_data` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-08-17  1:26:03
