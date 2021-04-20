package TimChuoiLienTiep;


    import java.util.*;

    public class ChuoiLienTiep {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            LinkedList<Character> max = new LinkedList<>();
            LinkedList<Character> list = new LinkedList<>();


            System.out.print("Enter a string: ");
            String string = input.nextLine();


            for (int i = 0; i < string.length(); i++) { 		// single loop
                if (list.size() > 1 && string.charAt(i) <= list.getLast() &&
                        list.contains(string.charAt(i))) {
                    list.clear(); // Simple statement
                }

                list.add(string.charAt(i));

                if (list.size() > max.size()) {
                    max.clear();
                    max.addAll(list);
                }
            }

            // Display the maximum consecutive
            // increasingly ordered substring
            for (Character ch: max) { // single loop
                System.out.print(ch); // Simple statement
            }
            System.out.println();
        }

    }

