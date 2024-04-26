import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        System.out.println("""
                    **************************************************
                    Chose the Star Wars movie you want to consult:
                    
                    1- "A new hope"
                    2- "The Empire Strikes Back"
                    3- "Return of the Jedi"
                    4- "The Phantom Menace"
                    5- "Attack of the Clones"
                    6- "Revenge of the Sith"
                    7- "The Force Awakens"
                    8- EXIT
                    
                    **************************************************
                    """);
        var movieNumber = reading.nextLine();
        MovieConsult consult = new MovieConsult();
        Movie movie =  consult.MovieSearch(movieNumber);
        System.out.println(movie);
    }
}
