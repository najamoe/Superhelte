import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String [] args){
        Scanner scan= new Scanner(System.in);

        System.out.println("Velkommen til superheltene");

        //Menu
        System.out.println("1. Superhelt \n9. Afslut");
        int numb = scan.nextInt();
        if (numb == 1) {

                System.out.println("Du har valgt at oprette en ny superhelt");
                System.out.println("Indtast din superhelts navn");
                String navn = scan.nextLine();

        }

            else if ( numb == 9)
            System.out.println("Hav en god dag");


    }

}
