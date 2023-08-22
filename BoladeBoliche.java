public class BolaDeBoliche extends Bola {
    public BolaDeBoliche(String nomeDaMarca){
            super(nomeDaMarca);
    }
    public void lancar(){
        System.out.println("Marca Bolas de Boliche"+ getnomeDaMarca() + "Dificeis de Lançar");
    }
    public void quicar(){
        System.out.println("Elas não quicam direito");
    }
}
