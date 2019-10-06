package no.kristiania.http;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServer {
    private final int port;
    private ServerSocket serverSocket;

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        Socket socket = serverSocket.accept();

        socket.getOutputStream().write(("HTTP/1.0 200 OK\r\n" +
                "Content-length: 12 \r\n" +
                "\r\n" +
                "Hello World!").getBytes());

    } // end main
    public HttpServer(int port) throws IOException {
        this.port = port;
        serverSocket = new ServerSocket(port);
    }

    public int getPort() {
        return serverSocket.getLocalPort();
    }
} // end HttpServer
