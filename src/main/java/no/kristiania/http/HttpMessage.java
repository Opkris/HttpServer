package no.kristiania.http;

import java.io.IOException;
import java.io.InputStream;

public class HttpMessage {
    public static String readLine(InputStream inputStream) throws IOException {
          StringBuilder line = new StringBuilder();
          int c;
          while((c = inputStream.read()) != -1){
              if(c == '\r'){
                  //noinspection ResultOfMethodCallIgnored
                  inputStream.read();
                  break;
              }
              line.append((char)c);
          }
          return line.toString();
    }
}
