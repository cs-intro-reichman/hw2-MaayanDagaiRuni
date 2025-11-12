// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String cheer = args[0].toUpperCase();
	        int times_to_cheer = Integer.parseInt(args[1]);
                int i = 0;
                String[] letters = cheer.split("");

                // Set a or an
                for (String letter : letters) {
                        String a_an = "a  ";
                        if ("AEFHILMNORSX".contains(letter)) {
                                a_an = "an ";
                        }
                        System.out.println("Give me " + a_an  + letter + ": " + letter + "!");
                        }

                        System.out.println("What does that spell?");
                        
                        // Repeat cheer
                        while (i < times_to_cheer) {
                        System.out.println(cheer + "!!!");
                        i = i + 1;
                        }
                }
        }
