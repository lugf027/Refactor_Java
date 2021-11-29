package chapter1;

/**
 * 影片
 */
public class Movie {

    public static final int CHILDREN = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String mTitle;
    private int mPriceCode;

    public Movie(String title, int priceCode) {
        mTitle = title;
        mPriceCode = priceCode;
    }

    public int getPriceCode() {
        return mPriceCode;
    }

    public void setPriceCode(int priceCode) {
        mPriceCode = mPriceCode;
    }

    public String getTitle() {
        return mTitle;
    }
}
