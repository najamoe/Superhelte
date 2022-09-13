import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;


public class main {
    public static void main(String [] args) {
        Database database = new Database();
        Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);

        System.out.println("Velkommen til superheltene");
        int numb;

        //Menu
        do {

            System.out.println("1. Opret ny superhelt \n2. Se liste af superhelte\n9. Afslut programmet");
            numb= scan.nextInt();
            scan.nextLine();

            if (numb == 1) {

                System.out.println("Du har valgt at oprette en ny superhelt");
                System.out.println("Indtast det navn du ønsker at give din superhelt");
                String navn = scan.nextLine();
                System.out.println("Indtast det superhelte navn du ønsker den skal have");
                String superheltenavn = scan.nextLine();
                System.out.println("Indtast de ønskede superkrafter");
                String superkrafter = scan.nextLine();
                System.out.println("Er din superhelt et menneske?");
                boolean menneske = scan.nextLine().substring(0, 1).equalsIgnoreCase("j");
                System.out.println("Hvilket år er din superhelt fra?");
                int oprindelsesår = scan.nextInt();
                System.out.println("Hvilken styrke skal din superhelt have?");
                double styrke = scan.nextDouble();
                database.createSuperhero(navn, superheltenavn, superkrafter, menneske, oprindelsesår, styrke);

            }   else if (numb == 2) {
                System.out.println("Din superhelte-liste:\n");
            }

            else if (numb == 9) {
                System.out.println("Hav en god dag");
            }

        }while (numb != 9) ;
    }
}
