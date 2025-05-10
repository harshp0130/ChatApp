package Chatapp;

import java.io.*;
import java.net.*;
import java.util.*;

public class Server {
    private static final   Set<ClientHandler> clientHandlers = new HashSet<>();

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1234);
        System.out.println("Server started on port 1234...");

        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("New client connected: " + socket);

            ClientHandler clientHandler = new ClientHandler(socket, clientHandlers);
            clientHandlers.add(clientHandler);
            new Thread(clientHandler).start();
        }
    }

    public static void broadcast(String message, ClientHandler sender) {
        for (ClientHandler ch : clientHandlers) {
            if (ch != sender) {
                ch.sendMessage(message);
            }
        }
    }

    public static void removeClient(ClientHandler clientHandler) {
        clientHandlers.remove(clientHandler);
    }
}
