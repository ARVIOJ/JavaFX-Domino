package dominop3;

public class FichaDomino {

    private int cara1;
    private int cara2;
    private int aux;

    public FichaDomino(int cara1, int cara2) {
        this.cara1 = cara1;
        this.cara2 = cara2;
    }

    public void girarFicha() {
        aux = cara1;
        cara1 = cara2;
        cara2 = aux;
    }

    public int getCara1() {
        return cara1;
    }

    public void setCara1(int cara1) {
        this.cara1 = cara1;
    }

    public int getCara2() {
        return cara2;
    }

    public void setCara2(int cara2) {
        this.cara2 = cara2;
    }

    @Override
    public String toString() {
        return String.format("%d|%d", cara1, cara2);
    }

}
