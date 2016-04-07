package VgenAbau;

/**
 * Hello world!
 *
 */
public final class Bowling {

    /**
     * Hello world!
     *
     */
    private Bowling() {
        super();
    }

    @Override
    public String toString() {
        return "Bowling";
    }

     /**
     * Hello world!
     * @param args argument du main
     */
    public static void main(final String[] args) {
        Bowling b = new Bowling();
        System.out.println(b.toString());
        System.out.println("Hello World!");
    }
}
