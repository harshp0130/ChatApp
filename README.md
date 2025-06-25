## MULTITHREADED-CHAT-APPLICATION

**COMPANY:** CODTECH IT SOLUTIONS  
**NAME:** PATEL HARSH  
**INTERN ID:** CT04DM112  
**DOMAIN:** JAVA PROGRAMMING  
**DURATION:** 4 WEEKS  
**MENTOR:** NEELA SANTOSH  

---

## 📌 Project Overview

This Java-based project illustrates a **multithreaded client-server chat system** using Java Sockets. It supports real-time messaging between multiple clients, all managed through a central server process.

### 🔍 Features & Concepts Demonstrated:

- Implementation of TCP connections via `ServerSocket` and `Socket`
- Concurrent client handling using Java multithreading
- Real-time **broadcasting** of messages from one client to all others
- Thread-safe communication and clean shutdown handling
- Simple **console-based UI** for focus on networking logic

This project serves as a beginner-friendly introduction to Java’s network programming capabilities.

---

## ▶️ How to Run the Application

### 1️⃣ Compile the Source Code

Navigate to the project folder and compile the Java files:

```
javac ChatServer.java ChatClient.java
```
## ▶️ 2. Start the Server
Run the server using:

```
java ChatServer
```
Keep this terminal open — it will handle all client messages and broadcasts.

## 🧑‍💻 3. Start the Clients
Open a new terminal for each client and run:

```
java ChatClient
```
You’ll be prompted to enter your name.

Type messages to broadcast them to all connected users.

Open multiple terminals to simulate multiple clients.

## ✅ Conclusion
This project provided practical experience in building a real-time chat application using Java's socket programming and multithreading features. It serves as a stepping stone toward more advanced messaging systems.

🔄 Future Improvements:
🌐 Add GUI using JavaFX or Swing for a user-friendly experience

🔐 Implement authentication and user registration

📨 Enable private messages and group chat features

💾 Store chat history in files or databases

🌍 Deploy the server on a remote host for online access
