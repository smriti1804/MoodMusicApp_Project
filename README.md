# 🎶 Mood-Based Music & Quote Suggestion System  

## 📌 Project Description  
The **Mood-Based Music & Quote Suggestion System** is a **Java Swing GUI application** integrated with a **MySQL database** that suggests **personalized music and motivational quotes** based on the user’s mood.  

Users can select their current mood (Happy, Sad, Angry, Relaxed, etc.), and the system will instantly display:  
- 🎵 A **YouTube music link** that matches the mood  
- 💬 An **inspirational quote** to uplift or complement the emotion  

This project is designed to combine **emotional intelligence** with **technology**, showcasing how software can adapt to human feelings.  

---

## ✨ Features  
✅ Simple & interactive **Java Swing GUI**  
✅ **Mood detection via button selection** (Happy, Sad, Angry, Excited, etc.)  
✅ **Real-time music recommendation** (YouTube links open in the browser)  
✅ **Motivational quotes** fetched from a MySQL database  
✅ **Database-driven design** for scalability (easy to add more moods & data)  
✅ Supports **emoji display** for mood representation  
✅ Clean, modular, and beginner-friendly **Java + MySQL integration**  

---

## 🛠️ Tech Stack  
- **Programming Language**: Java (Core Java, Swing for GUI)  
- **Database**: MySQL  
- **Connector**: JDBC (MySQL Connector/J)  
- **IDE**: VS Code  

---

## ⚙️ How It Works  
1. User launches the GUI application.  
2. Selects their mood by clicking a mood button.  
3. The system queries the **MySQL database** (`mood_db` → `mood_data` table).  
4. Retrieves the matching **music link & quote**.  
5. Displays the results in the GUI (and opens YouTube link).  

---

## 📂 Database Schema  

**Database Name:** `mood_db`  
**Table Name:** `mood_data`  

| id  | mood   | quote                         | music_link (YouTube)              |
|-----|--------|-------------------------------|-----------------------------------|
| 1   | Happy  | "Happiness is contagious."   | https://youtu.be/...              |
| 2   | Sad    | "This too shall pass."       | https://youtu.be/...              |
| 3   | Angry  | "Calm mind brings strength." | https://youtu.be/...              |

---
# Mood-Based Music and Quote Suggestion System

A Java-based GUI project that suggests **music** and **quotes** based on user mood.  
Built with **Java (Swing + JDBC)** and **MySQL**.

---

## 📂 Database Setup

This project uses **MySQL** as the backend. The database dump is included in the repo.

### Steps to Import Database
1. Open **MySQL Workbench**.
2. Create a new schema:
   ```sql
   CREATE DATABASE mood_db;

### 3. Update Database Credentials in Code
Open your Java code and update the MySQL connection details:
```java
String url = "jdbc:mysql://localhost:3306/mood_db";
String user = "root";
String password = "your_password";

---

##▶️ Running the Project
1. Open the project in VS Code
2. Configure Java (JDK 17+ recommended).
3. Compile and run the main java file:

javac Main.java
java Main

4.The GUI will open where you can:
🔹 Select your mood
🔹 Get a music suggestion (Youtube Link will play inside GUI)
🔹 Get an inspirational Quote.

---

##🗂 Project Structure

project/
│── src/                   # Java source files
│── database/
│   └── mood_music_quotes_db.sql
│── README.md

---

## 🚀 Future Enhancements  
🔹 Add **AI/ML-based sentiment analysis** for automatic mood detection  
🔹 Support **Spotify API integration** for direct music streaming  
🔹 Enhance **UI/UX with JavaFX** or modern frameworks  
🔹 Store **user history** for personalized recommendations  

---

## 📖 Learning Outcomes  
- Practical understanding of **Java GUI development (Swing)**  
- Hands-on experience with **JDBC & MySQL database integration**  
- Building a **real-world project** that blends creativity & technology  
- Improved skills in **project structuring & GitHub deployment**  

---

## 🏃‍♂️ How to Run the Project  

1. Clone the repository:  
   ```bash
   git clone https://github.com/your-username/mood-music-quote-system.git
