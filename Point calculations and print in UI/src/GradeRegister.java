import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades; // speichert die Noten
    private ArrayList<Integer> examPoints; // speichert die Punkte

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.examPoints = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points)); // Methode zum hinzufügen einer Note in die Listen basierend auf den punkten,
        this.examPoints.add(points);            // (Note wird mithilfe der M. pointsToGrade berechnet.)
    }

    public int numberOfGrades(int grade) {      // Methode zum Zählen der Anzahl von einzelnen Noten
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) { // Punkte werden in 10ner Schritten zu Noten.

        int grade = 0;
        if (points < 50) {
            grade = 6;
        } else if (points < 60) {
            grade = 5;
        } else if (points < 70) {
            grade = 4;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 2;
        } else {
            grade = 1;
        }

        return grade;
    }
    public double averageOfPoints(){ // berechnet den durschnitt der Punkte
        if(grades.isEmpty()){
            return -1;
        }else{
            int avg = 0;
            for(int gradePoints : examPoints){
                avg = avg + gradePoints;
            }
            return (double) avg / examPoints.size();
        }

    }

    public double averageOfGrades() { // berechnet den durchschnitt der Noten
        if (grades.isEmpty()) {
            return -1;
        } else {
             int sum = 0;
             for(int grade : grades){
                 sum = sum + grade;
          }
            return ((double) sum / grades.size());
        }
    }
}