package tp5;

public class ProgramFactory {
	public static Program createProgram(int programNbr) {
        switch (programNbr) {
            case 1:
                return new Program1();
            case 2:
                return new Program2(); 
            default:
                throw new IllegalArgumentException("Numéro de programme invalide: " + programNbr);
        }
    }
}
 