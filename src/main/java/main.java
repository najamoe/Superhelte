import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String [] args){
        Database database = new Database();
        Scanner scan= new Scanner(System.in);

        System.out.println("Velkommen til superheltene");

        //Menu
        System.out.println("1. Superhelt \n9. Afslut");
        int numb = scan.nextInt();
        if (numb == 1) {

                System.out.println("Du har valgt at oprette en ny superhelt");
            System.out.println( "Indtast det navn du ønsker at give din superhelt");
                String navn = scan.next();
            System.out.println("Indtast det superhelte navn du ønsker den skal have");
                String superheltenavn = scan.next();
            System.out.println("Indtast de ønskede superkrafter");
                String superkrafter = scan.next();
            System.out.println("Er din superhelt et menneske?");
                boolean menneske = scan.nextBoolean();
            System.out.println("Hvilket år er din superhelt fra?");
                int oprindelsesår = scan.nextInt();
            System.out.println("Hvilken styrke skal din superhelt have?");
                int styrke = scan.nextInt();
        database.createSuperhero(navn, superheltenavn, superkrafter, menneske, oprindelsesår, styrke);
        }
            else if ( numb == 9)
            System.out.println("Hav en god dag");


    }

}
