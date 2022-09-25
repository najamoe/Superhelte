import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Database {
    ArrayList<Superhero> heroes = new ArrayList<>();
    ArrayList<Superhero> searchResults = new ArrayList<>();

    Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);

    public void createSuperhero(String navn, String superheltenavn, String superkraft, boolean menneske, double oprindelsesår, double styrke) {
        Superhero hero = new Superhero(navn, superheltenavn, superkraft, menneske, oprindelsesår, styrke);
        heroes.add(hero);
    }

    public ArrayList<Superhero> getHeroes() {
        return heroes;
    }

public ArrayList<Superhero> getSearchResults(){
        return searchResults;
}
}




