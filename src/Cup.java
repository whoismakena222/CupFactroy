public class Cup {

        public String color;
        public boolean isHot;
        public int nFull;
        public boolean isHandle;

        public int nSize;

        public Cup(boolean paramisHot, boolean paramisHandle, String paramColor, int paramnSize) {
            isHot = paramisHot;
            isHandle = paramisHandle;
            color = paramColor;
            nSize = paramnSize;
            nFull = (int) (Math.random() * 16 + 8);
        }

        public void printCup() {
            System.out.println("This cup is named Lisa ");
            if (isHot) {
                System.out.println("Lisa is hot!");}
            else System.out.println("Lisa is ice cold");
            System.out.println("she is " + color);
            if (isHandle) {
                System.out.println("and she has a handle.");}
            else System.out.println("and she doesn't have a handle.");
            System.out.print(" Lisa is " + nSize + " inches tall");

            System.out.print(" and is " + nFull + " ounces full");
        }

        public void printCup2() {
            System.out.println("This cup is named Lola ");
            if (isHot) {
                System.out.println("Lola is hot! ");}
            else System.out.println("Lola is ice cold");
            System.out.println("she is " + color);
            if (isHandle) {
                System.out.println("and she has a handle.");}
            else System.out.println("and she doesn't have a handle.");
            System.out.print(" Lola is " + nSize + " inches tall");
            System.out.print(" and is " + nFull + " ounces full");
        }
}
