package utilities;

public class Config {
    public static String geturl(String url) {
        switch (url) {
            case("trendyol"):
                url="https://www.trendyol.com/";
                break;
            case("amazon"):
                url="https://www.amazon.com/";
                break;
        }
        return url;
    }}




