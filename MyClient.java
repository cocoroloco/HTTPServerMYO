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
            Socket soc = new Socket("localhost", 6666);

            DataOutputStream d = new DataOutputStream(
                    soc.getOutputStream());

            while (!msg.equals("quit")) {
                // Message to be displayed
                msg = scanner.nextLine();
                d.writeUTF(msg);
                d.flush();
            }
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
