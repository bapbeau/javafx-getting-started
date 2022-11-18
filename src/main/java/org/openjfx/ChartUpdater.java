package org.openjfx;

import javafx.application.Platform;
import javafx.scene.control.Button;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ChartUpdater extends Thread {
    private MyChart myChart;

    public ChartUpdater(MyChart myChart) {
        this.myChart = myChart;
    }
    @Override
    public void run() {
        try {
            ServerSocket ss = new ServerSocket(6666);
            Socket s = ss.accept();// establishes connection
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str = (String) dis.readUTF();
            System.out.println("message= " + str);
            ss.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}