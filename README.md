COMPANY: CODTECH IT SOLUTIONS
NAME: PATEl HARSH
INTERN ID: CT04DM112
DOMAIN: JAVA PROGRAMMING
DURATION: 4 WEEKS
MENTOR: NEELA SANTOSH

TASK DESCRIPTION
This Java project demonstrates a multithreaded client-server chat application using Java Sockets. It enables real-time communication between multiple clients via a central server.

Key concepts covered:
Use of ServerSocket and Socket classes for TCP connections
Handling multiple clients simultaneously using multithreading
Broadcasting messages from one client to all others
Clean disconnection and thread-safe message handling
Console-based communication without GUI
This application showcases Java's capability to build basic networked systems.

HOW TO RUN
1. Compile
Open a terminal and navigate to the project directory containing the .java files:

javac ChatServer.java ChatClient.java
2. Run the Server
java ChatServer
Leave this terminal open — it will handle all client messages.

3. Run Clients (in separate terminals)
java ChatClient
Enter a name when prompted.
Type messages to broadcast to all connected clients.
Repeat this step to simulate multiple clients in different terminal windows.
OUTPUT
Server and Client Connected
2.

Message Broadcast

CONCLUSION
This project provided practical experience in Java network programming using sockets and multithreading. It is a foundational exercise for understanding how real-time systems work, and can be extended into more advanced messaging platforms with features like private messaging, chat rooms, or GUI integration.
