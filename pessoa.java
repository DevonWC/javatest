public abstract class pessoa {

    private String nome;
    private Moralidade moral;

    public pessoa(String n, Moralidade m) {
        this.nome = n;
        this.moral = m;
    }

    public String getNome() {
        return this.nome;
    }

    public void setMoral(Moralidade m){
        this.moral = m;
    }

    public int moral() {
        return moral.iniciar();
    }

}