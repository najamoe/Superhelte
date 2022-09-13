import javax.xml.crypto.Data;
import java.util.ArrayList;

public class Database {
    ArrayList<Superhero> hero = new ArrayList<>();

    public void createSuperhero(String navn, String superheltenavn, String superkraft, boolean menneske, double oprindelsesår, double styrke) {
        Superhero hero = new Superhero(navn, superheltenavn, superkraft, menneske, oprindelsesår, styrke);


    }
}

