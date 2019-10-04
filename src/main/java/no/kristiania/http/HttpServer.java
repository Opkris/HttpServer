package no.kristiania.http;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        Socket socket = serverSocket.accept();

        socket.getOutputStream().write(("HTTP/1.0 200 OK\r\n" +
                "Content-length: 12 \r\n" +
                "\r\n" +
                "Hello World!").getBytes());

    } // end main
} // end HttpServer
