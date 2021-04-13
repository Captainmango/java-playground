

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Playground {

    public static void main(String [] args){
        ProcessHandle currentProcess = ProcessHandle.current();
        ProcessHandle.Info currentProcessInfo = currentProcess.info();
        System.out.println("PID: " + currentProcess.pid());
        System.out.println("Info: " + currentProcessInfo);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(
                URI.create("https://google.com"))
                .header("accept", "application/json")
                .build();

        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println)
                .join();
    }





}
