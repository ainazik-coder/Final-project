public class Movie {
    private String title;
    private String genre;
    private String time;
    private int hall;

    public Movie(String title, String genre, String time, int hall) {
        this.title = title;
        this.genre = genre;
        this.time = time;
        this.hall = hall;
    }

    // getters
    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getTime() {
        return time;
    }

    public int getHall() {
        return hall;
    }

    // setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setHall(int hall) {
        this.hall = hall;
    }

    // polymorphism (будет переопределяться)
    public String getDetails() {
        return title + " | " + genre + " | " + time + " | Hall: " + hall;
    }
}
