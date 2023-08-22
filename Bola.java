 abstract class Bola implements Lacavel {
    private String nomeDaMarca;
    public Bola(String nomeDaMarca) {
        this.nomeDaMarca = nomeDaMarca;
    }    
    public String getnomeDaMarca() {
            return nomeDaMarca;
    }
        abstract void quicar();
}