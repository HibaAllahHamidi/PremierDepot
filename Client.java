package tp5;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Veuillez spécifier un numéro de programme :");
        int programNbr = scanner.nextInt();
        
        try {
            Program program = ProgramFactory.createProgram(programNbr);
            program.go();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        scanner.close();
    }
}




/*
  public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Veuillez spécifier un numéro de programme (1, 2 ou 3) : ");
        int programNbr = scanner.nextInt();
        
        if (programNbr == 1) {
            Program1 program = new Program1();
            program.go();
        } else if (programNbr == 2) {
            Program2 program = new Program2();
            program.go();
        } else if (programNbr == 3) {
            Program3 program = new Program3();
            program.go();
        } else {
            System.out.println("Numéro de programme invalide");
        }
        
        scanner.close();
    }
    */
