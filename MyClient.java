// Java Program to implement ServerSocket class
// Client - side

// Importing required libraries
import java.io.*;
import java.net.*;
import java.util.Scanner;

// Main class
public class MyClient extends Thread {

    // Main driver method
    public static void main(String[] args) {
        String msg = "";
        Scanner scanner = new Scanner(System.in);
        // Try block to check if exception occurs
        try {

            // Creating Socket class object and
            // initializing Socket
            Socket soc = new Socket("localhost", 8080);

            // Creating dataOutput Stream
            DataOutputStream d = new DataOutputStream(
                    soc.getOutputStream());

            // Send msg until type quit
            while (!msg.equals("quit")) {
                msg = scanner.nextLine();
                d.writeUTF(msg);
                d.flush();
            }
            // Send the "quit" msg to notify the server
            d.writeUTF(msg);
            // Flushing out internal buffers,
            // optimizing for better performance
            scanner.close();
            // Closing the connections

            // Closing DataOutputStream
            d.close();
            // Closing socket
            soc.close();
        }

        // Catch block to handle exceptions
        catch (Exception e) {

            // Print the exception on the console
            System.out.println(e);
        }
    }
}
