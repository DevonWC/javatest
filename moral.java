import java.util.Random;

public class moral implements Moralidade {

    private Random r = new Random();

    @Override
    public int iniciar() {
        return r.nextInt(5) + 1;
    }

}