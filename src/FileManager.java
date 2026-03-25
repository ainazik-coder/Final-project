import java.io.*;
import java.util.*;

public class FileManager {

    public static void saveToFile(List<Movie> movies) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("movies.txt"))) {
            for (Movie m : movies) {
                writer.println(m.getDetails());
            }
        } catch (IOException e) {
            System.out.println("Error saving file.");
        }
    }

    public static List<Movie> loadFromFile() {
        List<Movie> movies = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("movies.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // просто загружаем как обычные фильмы
                String[] parts = line.split("\\|");
                if (parts.length >= 4) {
                    String title = parts[0].trim();
                    String genre = parts[1].trim();
                    String time = parts[2].trim();
                    int hall = Integer.parseInt(parts[3].replace("Hall:", "").trim());

                    movies.add(new Movie(title, genre, time, hall));
                }
            }
        } catch (Exception e) {
            System.out.println("No previous data found.");
        }

        return movies;
    }
}