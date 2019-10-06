package no.kristiania.http;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class HttpServerTest {

    @Test
    void shouldReturnStatusCode200() throws IOException {
        HttpServer server = new HttpServer(0);
        server.start();
        HttpClient client = new HttpClient("localhost", server.getPort(), "/echo");
        assertEquals(200,client.execute().getStatusCode());
    }
 @Test
    void shouldReturnStatusCode401() throws IOException {
        HttpServer server = new HttpServer(0);
        server.start();
        HttpClient client = new HttpClient("localhost", server.getPort(), "/echo");
        assertEquals(401,client.execute().getStatusCode());
    }

}// end HttpServerTest