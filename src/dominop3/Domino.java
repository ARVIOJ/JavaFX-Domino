package dominop3;

import dominop3.FichaDomino;
import java.util.LinkedList;

public class Domino {

    LinkedList<FichaDomino> fichas = new LinkedList<>();

    public Domino() {

        fichas.add(new FichaDomino(0, 0));
        fichas.add(new FichaDomino(0, 1));
        fichas.add(new FichaDomino(0, 2));
        fichas.add(new FichaDomino(0, 3));
        fichas.add(new FichaDomino(0, 4));
        fichas.add(new FichaDomino(0, 5));
        fichas.add(new FichaDomino(0, 6));

        fichas.add(new FichaDomino(1, 1));
        fichas.add(new FichaDomino(1, 2));
        fichas.add(new FichaDomino(1, 3));
        fichas.add(new FichaDomino(1, 4));
        fichas.add(new FichaDomino(1, 5));
        fichas.add(new FichaDomino(1, 6));

        fichas.add(new FichaDomino(2, 2));
        fichas.add(new FichaDomino(2, 3));
        fichas.add(new FichaDomino(2, 4));
        fichas.add(new FichaDomino(2, 5));
        fichas.add(new FichaDomino(2, 6));

        fichas.add(new FichaDomino(3, 3));
        fichas.add(new FichaDomino(3, 4));
        fichas.add(new FichaDomino(3, 5));
        fichas.add(new FichaDomino(3, 6));

        fichas.add(new FichaDomino(4, 4));
        fichas.add(new FichaDomino(4, 5));
        fichas.add(new FichaDomino(4, 6));

        fichas.add(new FichaDomino(5, 5));
        fichas.add(new FichaDomino(5, 6));

        fichas.add(new FichaDomino(6, 6));

    }

    public int Puntos(LinkedList<FichaDomino> pt) {
        int puntos = 0;
        for (int i = 0; i < fJuego.size() - 1; i++) {
            if (pt.get(i).getCara2() == pt.get(i + 1).getCara1()) {
                puntos += 1;
            }
        }
        return puntos;
    }

    FichaDomino aux;
    LinkedList<FichaDomino> fJuego = new LinkedList<>();

    public LinkedList<FichaDomino> oFichas() {
        int i = 0;
        int j;
        while (i < 7) {
            j = (int) (Math.random() * fichas.size());
            aux = fichas.get(j);
            fJuego.add(aux);
            fichas.remove(j);
            i++;
        }

        return fJuego;
    }

}
