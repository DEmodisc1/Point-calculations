
import java.util.Scanner;

public class UserInterface {

    private GradeRegister register; // verwaltet Punkte/Noten und stellt Methoden bereit
    private Scanner scanner; // ermöglicht Benutzereingaben

    public UserInterface(GradeRegister register, Scanner scanner) {
        this.register = register;
        this.scanner = scanner;
    }

    public void start() {
        readPoints();    // ruft readPoints auf und gibt die Verteilung der Noten aus
        System.out.println("");
        printGradeDistribution();
        System.out.println("The average of points: " + register.averageOfPoints());
        System.out.println("The average of grades: " + register.averageOfGrades());
    }

    public void readPoints() {
        while (true) {
            System.out.print("Points: ");       // fordert den Nutzer auf Punkte einzugeben
            String input = scanner.nextLine();
            if (input.equals("")) {             // wird beendet wenn nichts eigegeben wird
                break;
            }

            int points = Integer.valueOf(input);

            if (points < 0 || points > 100) {     // überprüft ob die Punkte im Bereich 0-100 liegen
                System.out.println("Impossible number.");
                continue;
            }

            this.register.addGradeBasedOnPoints(points); // fügt die Note durch Methode addGBOP zur GradeRegister Objekt hinzu
        }
    }

    public void printGradeDistribution() {
        int grade = 6;
        while (grade >= 1) {
            int stars = register.numberOfGrades(grade);  // gibt die Verteilung der Noten aus mithilfe von numberOG
            System.out.print(grade + ": ");
            printsStars(stars);                         // druckt durch printStars Sterne basierend auf Anzahl der Noten
            System.out.println("");

            grade = grade - 1;
        }

    }

    public static void printsStars(int stars) {     // stars = Anzahl der gedruckten Sterne
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
}
