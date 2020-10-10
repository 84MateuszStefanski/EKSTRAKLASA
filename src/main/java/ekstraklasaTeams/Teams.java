package ekstraklasaTeams;

public class Teams extends Ekstraklasa{
    private String name;
    private String city;
    private int yearFounded;
    private String address;

    public Teams(String name, String city, int yearFounded, String address) {
        this.name = name;
        this.city = city;
        this.yearFounded = yearFounded;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getYearFounded() {
        return yearFounded;
    }

    public String getAddress() {
        return address;
    }

}
