package Chatapp;

import java.io.*;
import java.net.*;
import java.util.*;

public class ClientHandler implements Runnable {
    private Socket socket;
    private BufferedReader reader;
    private BufferedWriter writer;
    private String clientName;
    private Set<ClientHandler> clientHandlers;

    public ClientHandler(Socket socket, Set<ClientHandler> clientHandlers) throws IOException {
        this.socket = socket;
        this.clientHandlers = clientHandlers;
        this.reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        this.writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        this.clientName = "User" + socket.getPort();
    }

    @Override
    public void run() {
        String message;
        try {
            writer.write("Welcome " + clientName + "!\n");
            writer.flush();

            while ((message = reader.readLine()) != null) {
                System.out.println(clientName + ": " + message);
                Server.broadcast(clientName + ": " + message, this);
            }
        } catch (IOException e) {
            System.out.println(clientName + " disconnected.");
        } finally {
            try {
                socket.close();
                Server.removeClient(this);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void sendMessage(String message) {
        try {
            writer.write(message + "\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
