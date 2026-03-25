import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MovieManager manager = new MovieManager();

        while (true) {
            System.out.println("\n--- MOVIE MENU ---");
            System.out.println("1. Add Movie");
            System.out.println("2. View Movies");
            System.out.println("3. Update Movie");
            System.out.println("4. Delete Movie");
            System.out.println("5. Exit");

            System.out.print("Choose: ");
            String input = sc.nextLine();

            switch (input) {

                case "1":
                    System.out.print("Title: ");
                    String title = sc.nextLine();

                    if (title.isEmpty()) {
                        System.out.println("Title cannot be empty!");
                        break;
                    }

                    System.out.print("Genre: ");
                    String genre = sc.nextLine();

                    System.out.print("Time: ");
                    String time = sc.nextLine();

                    System.out.print("Hall: ");
                    int hall;

                    try {
                        hall = Integer.parseInt(sc.nextLine());
                    } catch (Exception e) {
                        System.out.println("Invalid number!");
                        break;
                    }

                    Movie movie = new Movie(title, genre, time, hall);
                    manager.addMovie(movie);
                    break;

                case "2":
                    manager.viewMovies();
                    break;

                case "3":
                    manager.viewMovies();
                    System.out.print("Enter index: ");
                    int updateIndex = Integer.parseInt(sc.nextLine());
                    manager.updateMovie(updateIndex, sc);
                    break;

                case "4":
                    manager.viewMovies();
                    System.out.print("Enter index: ");
                    int deleteIndex = Integer.parseInt(sc.nextLine());
                    manager.deleteMovie(deleteIndex);
                    break;

                case "5":
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}