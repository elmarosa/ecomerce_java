import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;
import java.util.concurrent.Executors;

public class Main {
        public static void main(String[] args) throws IOException
    {
        HttpServer httpServer = HttpServer.create(new InetSocketAddress("localhost", 8135),0);
        httpServer.createContext( "/ecommerce", new ecommerceHandler());
        httpServer.setExecutor(Executors.newSingleThreadExecutor());
        httpServer.start();
    }
    public static class ecommerceHandler implements HttpHandler {
        public void handle(HttpExchange exchange) throws IOException {
            //post
            //get

            if("GET".equals(exchange.getRequestMethod())){
                OutputStream outputStream = exchange.getResponseBody();
                String tes = "Elmarosa";
                exchange.sendResponseHeaders(200, tes.length());
                outputStream.write(tes.getBytes());
                outputStream.flush();
                outputStream.close();
             }
        }
        }
    }
