package chapter1;

/**
 * 表示某个顾客租了一部影片
 */
public class Rental {

    private Movie mMovie;
    private int mDaysRented;

    public Rental(Movie movie, int daysRented) {
        mMovie = movie;
        mDaysRented = daysRented;
    }

    public Movie getMovie() {
        return mMovie;
    }

    public int getDaysRented() {
        return mDaysRented;
    }
}
