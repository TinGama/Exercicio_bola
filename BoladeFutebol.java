public class BolaDeFutebol extends Bola {
    public BolaDeFutebol(String nomeDaMarca){
            super(nomeDaMarca);
    }
    public void lancar(){
        System.out.println("Marca Bolas de futebol"+ getnomeDaMarca() + "Boas de Lançar");
    }
    public void quicar(){
        System.out.println("Elas quicam muito");
    }
}
