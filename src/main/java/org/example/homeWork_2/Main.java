package org.example.homeWork_2;

import org.example.homeWork_2.client.ClientGUI;
import org.example.homeWork_2.server.ServerWindow;

public class Main {
    public static void main(String[] args) {

        ServerWindow serverWindow = new ServerWindow();
        new ClientGUI(serverWindow);
        new ClientGUI(serverWindow);

    }
}
