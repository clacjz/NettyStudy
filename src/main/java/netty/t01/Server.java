package netty.t01;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        ServerSocket ss = null;

        try {
            ss = new ServerSocket();
            ss.bind(new InetSocketAddress(12349));
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (true) {
            try {
                Socket s = ss.accept();
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("A client connect!");
        }
    }
}
