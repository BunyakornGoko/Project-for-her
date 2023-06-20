package forher.drink;

public class User {
    private String Day;
    private String Feels;
    private String Synopsis;

    public User(String day, String feels, String synopsis) {
        Day = day;
        Feels = feels;
        Synopsis = synopsis;
    }

    public String getDay() {
        return Day;
    }

    public void setDay(String day) {
        Day = day;
    }

    public String getFeels() {
        return Feels;
    }

    public void setFeels(String feels) {
        Feels = feels;
    }

    public String getSynopsis() {
        return Synopsis;
    }

    public void setSynopsis(String synopsis) {
        Synopsis = synopsis;
    }
}
