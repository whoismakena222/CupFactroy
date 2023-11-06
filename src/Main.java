public class Main {
    public static void main(String[] args) {
        Main myFactory = new Main();
    }

    public Main() {

        System.out.println("----------------");
        Cup Lisa;
        Lisa = new Cup(true, true, "green ", 6);
        Lisa.printCup();

        System.out.println("\n----------------");
        Cup Lola;
        Lola = new Cup(false, false, "pink ", 8);
        Lola.printCup2();

    }
}
