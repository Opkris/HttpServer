package no.kristiania.http;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServer {

    private ServerSocket serverSocket;

    public HttpServer(int port) throws IOException {
        serverSocket = new ServerSocket(port);
    }

    public static void main(String[] args) throws IOException {
        new HttpServer(8080).start();
    } // end main

    void start() {
        new Thread(this::run).start();
    }

    private void run()  {
        try {
            Socket socket = serverSocket.accept();

            socket.getOutputStream().write(("HTTP/1.0 200 OK\r\n" +
                    "Content-length: 12 \r\n" +
                    "\r\n" +
                    "Hello World!").getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public int getPort() {
        return serverSocket.getLocalPort();
    }
} // end HttpServer
