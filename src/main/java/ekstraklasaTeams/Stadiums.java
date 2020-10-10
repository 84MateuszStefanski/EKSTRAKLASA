package ekstraklasaTeams;



public class Stadiums extends Ekstraklasa{
    private Teams owner;
    private String name;
    private int yearOfBuild;
    private int capacity;

    public Stadiums(Teams owner, String name, int yearOfBuild, int capacity) {
        this.owner = owner;
        this.name = name;
        this.yearOfBuild = yearOfBuild;
        this.capacity = capacity;
    }

    public Teams getOwner() {
        return owner;
    }

    public void setOwner(Teams owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBuild() {
        return yearOfBuild;
    }

    public int getCapacity() {
        return capacity;
    }

}
