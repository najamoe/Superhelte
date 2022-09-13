import java.util.ArrayList;

public class Superhero {
    //Attributes
    private String navn;
    private String superheltenavn;
    private String superkraft;
    private boolean menneske;
    private double oprindelsesår;
    private double styrke;

    //Constructor
    public Superhero(String navn, String superheltenavn, String superkraft, boolean menneske, double oprindelsesår, double styrke) {
        this.navn=navn;
        this.superheltenavn=superheltenavn;
        this.superkraft=superkraft;
        this.menneske=menneske;
        this.oprindelsesår=oprindelsesår;
        this.styrke=styrke;

    }
    //Gettere
    public String getNavn() {
        return navn;
    }

    public String getSuperheltenavn() {
        return superheltenavn;
    }

    public String getSuperkraft() {
        return superkraft;
    }
    public boolean isMenneske(){
        return menneske;
    }

    public double getOprindelsesår(){
        return oprindelsesår;
    }

    public double getStyrke() {
        return styrke;
    }


}
