class Continent {
    protected String continentName;
    public Continent(String continentName) {
    this.continentName = continentName;
    }
    public void displayContinent() {
    System.out.println("Continent: " + continentName);
    }
    }
    class Country extends Continent {
    protected String countryName;
    public Country(String continentName, String countryName) {
    super(continentName);
    this.countryName = countryName;
    }
    public void displayCountry() {
    displayContinent();
    System.out.println("Country: " + countryName);
    }
    }
    
    class State extends Country {
    private String stateName;
    public State(String continentName, String countryName, String stateName) {
    super(continentName, countryName);
    this.stateName = stateName;
    }
    public void displayState() {
    displayCountry();
    System.out.println("State: " + stateName);
    }
    }
    public class MultilevelInheritanceExample {
    public static void main(String[] args) {
    State state = new State("Asia", "India", "Maharashtra");
    state.displayState();
    }
    }