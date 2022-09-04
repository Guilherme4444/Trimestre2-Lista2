package Ex9;

public class lampada {

    private boolean ligado;

    public void estado() {
        if (this.ligado == true) {
            System.out.println("A lampada está acessa.");
        } else {
            System.out.println("A lampada não está acessa.");
        }
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
}