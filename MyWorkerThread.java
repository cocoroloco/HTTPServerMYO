import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class MyWorkerThread extends Thread {

    Socket soc = new Socket();

    public MyWorkerThread(Socket soc) {
        this.soc = soc;
    }

    @Override
    public void run() {
        super.run();
        DataInputStream dis = null;
        DataOutputStream dos = null;
        try {
            // Invoking input stream via getInputStream()
            // method by creating DataInputStream class
            // object
            dis = new DataInputStream(this.soc.getInputStream());
            dos = new DataOutputStream(soc.getOutputStream());

            String str = (String) dis.readUTF();

            while (!str.equals("quit")) {
                // Display the string on the console
                System.out.println("Echo= " + str);
                str = (String) dis.readUTF();
            }

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                if (dis != null) {
                    dis.close();
                }
                if (dos != null) {
                    dos.close();
                }
                if (soc != null) {
                    soc.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
