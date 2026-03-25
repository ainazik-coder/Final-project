public class SpecialMovie extends Movie {
    private double rating;

    public SpecialMovie(String title, String genre, String time, int hall, double rating) {
        super(title, genre, time, hall);
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    // Polymorphism (override)
    @Override
    public String getDetails() {
        return super.getDetails() + " | Rating: " + rating;
    }
}