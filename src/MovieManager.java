import java.util.*;

public class MovieManager {
    private List<Movie> movies = new ArrayList<>();

    public MovieManager() {
        movies = FileManager.loadFromFile();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
        FileManager.saveToFile(movies);
    }

    public void viewMovies() {
        if (movies.isEmpty()) {
            System.out.println("No movies available.");
            return;
        }

        for (int i = 0; i < movies.size(); i++) {
            System.out.println(i + ": " + movies.get(i).getDetails());
        }
    }

    public void updateMovie(int index, Scanner sc) {
        if (index < 0 || index >= movies.size()) {
            System.out.println("Invalid index.");
            return;
        }

        Movie m = movies.get(index);

        System.out.print("New title: ");
        m.setTitle(sc.nextLine());

        System.out.print("New genre: ");
        m.setGenre(sc.nextLine());

        FileManager.saveToFile(movies);
    }

    public void deleteMovie(int index) {
        if (index < 0 || index >= movies.size()) {
            System.out.println("Invalid index.");
            return;
        }

        movies.remove(index);
        FileManager.saveToFile(movies);
    }
}