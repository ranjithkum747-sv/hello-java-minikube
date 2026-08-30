import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class Helloworld {

    public static void main(String[] args) throws IOException {

        HttpServer server = HttpServer.create(
            new InetSocketAddress(8080), 0
        );

        server.createContext("/", exchange -> {

            String response = " Ranjith kumar devops engineer";

            exchange.sendResponseHeaders(
                200, response.length()
            );

            OutputStream output = exchange.getResponseBody();
            output.write(response.getBytes());
            output.close();
        });

        server.start();

        System.out.println("Server running on port 8080");
    }
}