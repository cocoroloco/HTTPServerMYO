import java.io.IOException;

public class MyProgram {
    public static void main(String[] args) throws IOException {
        MyServer myServer = new MyServer(6666);
        myServer.start();
    }
}
