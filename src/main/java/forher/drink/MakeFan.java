package forher.drink;

public abstract class MakeFan implements Behavior {
    private String Firstname;
    private String Lastname;
    private String Nickname;

    public MakeFan(String firstname, String lastname, String nickname) {
        this.Firstname = firstname;
        this.Lastname = lastname;
        this.Nickname = nickname;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getNickname() {
        return Nickname;
    }

    public void setNickname(String nickname) {
        Nickname = nickname;
    }

    @Override
    public String toString() {
        return "MakeFan{" +
                "Firstname='" + Firstname + '\'' +
                ", Lastname='" + Lastname + '\'' +
                ", Nickname='" + Nickname + '\'' +
                '}';
    }
    @Override
    public abstract void FirstMet();

    @Override
    public abstract void IThink();

    @Override
    public abstract void IFeelsBad();

    @Override
    public abstract void Moment();

    @Override
    public abstract void Makef();
}
