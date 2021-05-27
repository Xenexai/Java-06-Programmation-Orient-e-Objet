
public class Classroom {

    public static void main(String[] args) {
        Wilder[] wilders = {
                new Wilder("Gabrielle", true),
                new Wilder("Mauranne", true),
                new Wilder("Laura", true),
                new Wilder("Clara", false),
        };

        for (Wilder wilder: wilders) {
            System.out.println(wilder.whoAmI());
        }
    }
}
