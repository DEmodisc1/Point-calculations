
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GradeRegister MathTest = new GradeRegister();
        UserInterface SchoolUI = new UserInterface(MathTest,scanner);


        SchoolUI.start();

    }
}
