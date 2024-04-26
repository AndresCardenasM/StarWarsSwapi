import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class MovieConsult {
    Movie MovieSearch(String movieNumber){
        String link = "https://swapi.py4e.com/api/films/" + movieNumber + "/";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(link))
                .build();
        HttpResponse<String> response = null;

        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException  e) {
            throw new RuntimeException(e);
        }
        return new Gson().fromJson(response.body(), Movie.class);
    }
}
