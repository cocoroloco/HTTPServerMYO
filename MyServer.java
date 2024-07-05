// Java Program to implement ServerSocket class
// Server Side

// Importing required libraries
import java.io.*;
import java.net.*;

// Main class
public class MyServer extends Thread {

    private int port = 6666;
    private ServerSocket serverSocket;

    public MyServer(int port) throws IOException {
        this.port = port;
        this.serverSocket = new ServerSocket(this.port);
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public void run() {
        super.run();
        try {

            while (this.serverSocket.isBound() && !this.serverSocket.isClosed()) {
                // Establishing a connection
                Socket soc = serverSocket.accept();

                MyWorkerThread wt = new MyWorkerThread(soc);
                wt.start();

            }
        } catch (Exception e) {

            // Display the exception on the console
            System.out.println(e);
        } finally {
            if (this.serverSocket != null) {
                try {
                    this.serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
