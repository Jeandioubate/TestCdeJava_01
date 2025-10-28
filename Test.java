
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int nomber = 0;                         // Une valeur par défaut
        boolean saisieValide = false;

        
        if (args.length > 0) {                  // Si un argument est fourni en ligne de commande
            String argument = args[0];

            if (argument.matches("-?\\d+")) {   // Vérifie si c'est un entier positif ou négatif
                nomber = Integer.parseInt(argument);
                saisieValide = true;
            } else {
                System.out.println("Erreur : Veuillez entrer un nombre entier !");
                return;         // Le programme s'arrête.
            }

        
        } else {                                        // Sinon, je demande une saisie manuelle
            Scanner scan = new Scanner(System.in);
            System.out.print("Entrez un nombre entier : ");

            while (!saisieValide) {
                String saisie = scan.nextLine();

                if (saisie.matches("-?\\d+")) { 
                    nomber = Integer.parseInt(saisie);
                    saisieValide = true;
                } else {
                    System.out.print("Valeur invalide. Veuillez entrer un nombre entier : ");
                }
            }

        scan.close();
            
        }

        
        String result = "Valeur ";                // J'analyse les différentes conditions

        if (nomber > 0) {
            result += "positive";
        } else if (nomber < 0) {
            result += "negative";
        } else {
            result += "nulle";
        }

        if (nomber != 0) {
            if (nomber % 2 == 0) {
                result += " et paire.";
            } else {
                result += " et impaire.";
            }
        } else {
            result += ".";
        }

        
        System.out.println(result);
    }
}


/*------------------------------------ Si on saisit une valeur inattendue, le programme va lever une exception: 
 Exception in thread "main" java.util.InputMismatchException et s'arrêter brutalement.
 Pour régler ce problème, on peut utiliser la méthode (matches("-?\\d+"))
 qui vérifie avant la lecture si la prochaine entrée est bien un entier. Si oui, le programme convertit en entier avec
 (Integer.parseInt()).
 sinon, on affiche un message d'erreur au lieu de planter le programme.-----------------------------------------*/
