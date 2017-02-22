package Ex102;


import java.util.TreeSet;

public class ex102 {

    private static TreeSet<Integer> readSet() {

        TreeSet<Integer> set = new TreeSet<>();

        TextIO.skipBlanks();
        if (TextIO.peek() != '[') {
            throw new IllegalArgumentException("A set should start with '['");
        }
        TextIO.getAnyChar();

        TextIO.skipBlanks();
        if (TextIO.peek() == ']') {
            TextIO.getAnyChar();
            return set; //ne pas oublier les sets vides !!
        }

        while (true) {
            TextIO.skipBlanks();
            if (!Character.isDigit(TextIO.peek())) {
                throw new IllegalArgumentException("You should only use integers");
            }
            int n = TextIO.getInt();
            set.add(new Integer(n));
            TextIO.skipBlanks();
            if (TextIO.peek() == ',') {
                TextIO.getAnyChar();
            } else if (TextIO.peek() == ']') {
                break;
            } else {
                throw new IllegalArgumentException("You should only use numbers, comma or brackets");
            }

           

        }
         TextIO.getAnyChar(); //pour le dernier ']'
            return set;
    }
    
    

    public static void main(String[] args) {
        System.out.println("Enter an operation using sets");
        TreeSet<Integer> A, B;
        char operation;

        A = readSet();

        TextIO.skipBlanks();
        if (TextIO.peek() != '*' && TextIO.peek() != '+' && TextIO.peek() != '-') {
            throw new IllegalArgumentException("Use '+' '-' or '*' after the first set");

        }
        operation = TextIO.getAnyChar(); // Read the operator.

        B = readSet(); // Read the second set.

        TextIO.skipBlanks();

        if (operation == '+') {
            A.addAll(B);
        } else if (operation == '-') {
            A.removeAll(B);
        } else if (operation == '*') {
            A.retainAll(B);
        }

        System.out.print(A);
    }

}
