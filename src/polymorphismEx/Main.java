package polymorphismEx;

public class Main {

    public static void main(String[] args) {

        People people = new Woman();
        // People people = new Man();

        people.talk();
    }

}
