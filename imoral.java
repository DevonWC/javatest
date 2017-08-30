import java.util.Random;

public class imoral implements Moralidade {

    private Random r = new Random();

    @Override
    public int iniciar(){
        return r.nextInt(10) + 1;
    }

}