package ekstraklasaTeams;

public class Ekstraklasa {
    public static void main(String[] args) {
        Teams legia = new Teams("Legia", "Warszawa", 1916,"Lazienkowska 3");
        Stadiums legiaStadium = new Stadiums(legia, "Stadion imieniem Marsałka Józefa Piłsudskiego",
                1930, 31800);
        System.out.println(legiaStadium.getOwner().getName());
    }
}
