package Ex11;

public class Elevador {

    private int andar;
    private int totalAndares;
    private int capacidade;
    private int p;

    public Elevador() {
    }

    public Elevador(int andar, int totalAndares, int capacidade, int p) {
        this.andar = andar;
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
        this.p = p;
    }

    public int entrar() {
        if (this.p < this.capacidade) {
            this.p += 1;
        } else {
            System.out.println("O elevador está lotado.");
        }
        return p;
    }

    public int sair() {
        if (this.p > 0) {
            this.p -= 1;
        } else {
            System.out.println("O elevador está vazio.");
        }
        return p;
    }

    public int subir() {
        if (this.andar < this.totalAndares) {
            this.andar += 1;
        } else {
            System.out.println("Este é o ultimo andar.");
        }
        return andar;
    }

    public int descer() {
        if (this.andar > 0) {
            this.andar -= 1;
        }
        return andar;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public int getTotalDeAndares() {
        return totalAndares;
    }

    public void setTotalDeAndares(int totalDeAndares) {
        this.totalAndares = totalDeAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getPessoas() {
        return p;
    }

    public void setPessoas(int pessoas) {
        this.p = pessoas;
    }
}