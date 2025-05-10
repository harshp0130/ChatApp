package Chatapp;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 1234);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        // Thread to listen to server messages
        new Thread(() -> {
            String msgFromServer;
            try {
                while ((msgFromServer = input.readLine()) != null) {
                    System.out.println(msgFromServer);
                }
            } catch (IOException e) {
                System.out.println("Disconnected from server.");
            }
        }).start();

        // Main thread sends user input to server
        String msgToServer;
        while ((msgToServer = reader.readLine()) != null) {
            output.write(msgToServer + "\n");
            output.flush();
        }

        socket.close();
    }
}
