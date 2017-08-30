import java.util.ArrayList;

public class init {

    private ArrayList<pessoa> p = new ArrayList<>();
    private imoral im = new imoral();
    private serio ser = new serio();

    public static void main(String[] args) {
        System.out.println("Iniciando...");
        init ine = new init();
    }
    
    public init() {
        p.add(new mulherMoral());
        p.add(new mulherImoral());
        System.out.println("Init completed");
        start();

    }

    public void start() {
        int turnos = 50;
        int[] pos = new int[p.size()];

        for(int i = 0; i < turnos; i++) {
            for(int j = 0; j < p.size(); j++) {
                try {
                    pessoa c = p.get(j);
                    pos[j] += c.moral();
                    System.out.println(c.getNome() + " - " + pos[j]);

                    
                    if(pos[j] > 150){
                        System.out.println(p.get(j).getNome() + " Ganhou com " + pos[j] + " pontos");
                        return;
                    }

                    if(i > 40 && c instanceof mulherMoral){
                        c.setMoral(ser);
                    }

                    if(i > (turnos/2) && c instanceof mulherImoral && pos[j] < pos[0]){
                        c.setMoral(im);                        
                    }

                    Thread.sleep(150);
                } catch (Exception e) {}

            }
        }

    }

}
