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
