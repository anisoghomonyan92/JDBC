package eventRegister.db;

public class SingltoneExample {
    private static SingltoneExample instance;

    private SingltoneExample() {

    }

    public static SingltoneExample getInstance() {

        return instance;
    }
}
