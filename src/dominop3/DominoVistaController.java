package dominop3;

import dominop3.FichaDomino;
import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.StageStyle;

public class DominoVistaController implements Initializable {

    Domino dominoJuego = new Domino();
    LinkedList<FichaDomino> fichas;

    public DominoVistaController() {
        fichas = dominoJuego.oFichas();
    }

    @FXML
    private ImageView ptb1;

    @FXML
    private ImageView ptb2;

    @FXML
    private ImageView ptb3;

    @FXML
    private ImageView ptb4;

    @FXML
    private ImageView ptb5;

    @FXML
    private ImageView ptb6;

    @FXML
    private ImageView ptb7;

    @FXML
    private TextField txtPoc;

    @FXML
    private TextField txtPocMover;

    @FXML
    private TextField txtPocFinal;

    @FXML
    private Text lblpuntos;

    @FXML
    void btnSalir(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void btnRotar(ActionEvent event) {
        int posicionGirar;
        try {
            posicionGirar = Integer.parseInt(txtPocMover.getText());
            fichas.get(posicionGirar).girarFicha();
            imagen();
            lblpuntos.setText("Puntos: " + dominoJuego.Puntos(fichas));
            txtPocFinal.clear();
            txtPoc.clear();
            txtPocMover.clear();
            System.out.println(fichas);
        } catch (Exception e) {
            Alert dialogoAlerta = new Alert(AlertType.INFORMATION);
            dialogoAlerta.setTitle("Información");
            dialogoAlerta.setHeaderText("Información");
            dialogoAlerta.setContentText("No puedes dejar campos vacios");
            dialogoAlerta.initStyle(StageStyle.UTILITY);
            java.awt.Toolkit.getDefaultToolkit().beep();
            dialogoAlerta.showAndWait();
        }

    }

    @FXML
    void btnMover(ActionEvent event) {
        int posicion;
        int posicionFinal;
        try {
            posicion = Integer.parseInt(txtPoc.getText());
            posicionFinal = Integer.parseInt(txtPocFinal.getText());
            FichaDomino aux = fichas.get(posicion); //guardar elemento en una variable   
            fichas.add(posicionFinal, fichas.remove(posicion)); //insertamos este elemento y eliminamos el elemento poc
            imagen();
            lblpuntos.setText("Puntos: " + dominoJuego.Puntos(fichas));
            txtPocFinal.clear();
            txtPoc.clear();
            txtPocMover.clear();
            System.out.println(fichas);
        } catch (Exception e) {
            Alert dialogoAlerta = new Alert(AlertType.INFORMATION);
            dialogoAlerta.setTitle("Información");
            dialogoAlerta.setHeaderText("Información");
            dialogoAlerta.setContentText("No puedes dejar campos vacios");
            dialogoAlerta.initStyle(StageStyle.UTILITY);
            java.awt.Toolkit.getDefaultToolkit().beep();
            dialogoAlerta.showAndWait();
        }

    }

    public void imagen() {

        FichaDomino aux;

        for (int i = 0; i < fichas.size(); i++) {
            aux = fichas.get(i);

            switch (i) {
                case 0:
                    if (aux.getCara1() == 0) {
                        if (aux.getCara2() == 0) {
                            Image image1 = new Image("/imagenes/0-0.png");
                            ptb1.setImage(image1);
                        }
                        if (aux.getCara2() == 1) {
                            Image image1 = new Image("/imagenes/0-1.png");
                            ptb1.setImage(image1);

                        }
                        if (aux.getCara2() == 2) {
                            Image image1 = new Image("/imagenes/0-2.png");
                            ptb1.setImage(image1);
                        }
                        if (aux.getCara2() == 3) {
                            Image image1 = new Image("/imagenes/0-3.png");
                            ptb1.setImage(image1);
                        }
                        if (aux.getCara2() == 4) {
                            Image image1 = new Image("/imagenes/0-4.png");

                            ptb1.setImage(image1);
                        }
                        if (aux.getCara2() == 5) {
                            Image image1 = new Image("/imagenes/0-5.png");
                            ptb1.setImage(image1);
                        }
                        if (aux.getCara2() == 6) {
                            Image image1 = new Image("/imagenes/0-6.png");
                            ptb1.setImage(image1);
                        }
                    }
                    if (aux.getCara1() == 1) {
                        if (aux.getCara2() == 0) {
                            Image image1 = new Image("/imagenes/1-0.png");
                            ptb1.setImage(image1);
                        }
                        if (aux.getCara2() == 1) {
                            Image image1 = new Image("/imagenes/1-1.png");
                            ptb1.setImage(image1);

                        }
                        if (aux.getCara2() == 2) {
                            Image image1 = new Image("/imagenes/1-2.png");
                            ptb1.setImage(image1);
                        }
                        if (aux.getCara2() == 3) {
                            Image image1 = new Image("/imagenes/1-3.png");
                            ptb1.setImage(image1);
                        }
                        if (aux.getCara2() == 4) {
                            Image image1 = new Image("/imagenes/1-4.png");

                            ptb1.setImage(image1);
                        }
                        if (aux.getCara2() == 5) {
                            Image image1 = new Image("/imagenes/1-5.png");
                            ptb1.setImage(image1);
                        }
                        if (aux.getCara2() == 6) {
                            Image image1 = new Image("/imagenes/1-6.png");
                            ptb1.setImage(image1);
                        }
                    }
                    if (aux.getCara1() == 2) {
                        if (aux.getCara2() == 0) {
                            Image image1 = new Image("/imagenes/2-0.png");
                            ptb1.setImage(image1);
                        }
                        if (aux.getCara2() == 1) {
                            Image image1 = new Image("/imagenes/2-1.png");
                            ptb1.setImage(image1);

                        }
                        if (aux.getCara2() == 2) {
                            Image image1 = new Image("/imagenes/2-2.png");
                            ptb1.setImage(image1);
                        }
                        if (aux.getCara2() == 3) {
                            Image image1 = new Image("/imagenes/2-3.png");
                            ptb1.setImage(image1);
                        }
                        if (aux.getCara2() == 4) {
                            Image image1 = new Image("/imagenes/2-4.png");

                            ptb1.setImage(image1);
                        }
                        if (aux.getCara2() == 5) {
                            Image image1 = new Image("/imagenes/2-5.png");
                            ptb1.setImage(image1);
                        }
                        if (aux.getCara2() == 6) {
                            Image image1 = new Image("/imagenes/2-6.png");
                            ptb1.setImage(image1);
                        }
                    }
                    if (aux.getCara1() == 3) {
                        if (aux.getCara2() == 0) {
                            Image image1 = new Image("/imagenes/3-0.png");
                            ptb1.setImage(image1);
                        }
                        if (aux.getCara2() == 1) {
                            Image image1 = new Image("/imagenes/3-1.png");
                            ptb1.setImage(image1);

                        }
                        if (aux.getCara2() == 2) {
                            Image image1 = new Image("/imagenes/3-2.png");
                            ptb1.setImage(image1);
                        }
                        if (aux.getCara2() == 3) {
                            Image image1 = new Image("/imagenes/3-3.png");
                            ptb1.setImage(image1);
                        }
                        if (aux.getCara2() == 4) {
                            Image image1 = new Image("/imagenes/3-4.png");

                            ptb1.setImage(image1);
                        }
                        if (aux.getCara2() == 5) {
                            Image image1 = new Image("/imagenes/3-5.png");
                            ptb1.setImage(image1);
                        }
                        if (aux.getCara2() == 6) {
                            Image image1 = new Image("/imagenes/3-6.png");
                            ptb1.setImage(image1);
                        }
                    }
                    if (aux.getCara1() == 4) {
                        if (aux.getCara2() == 0) {
                            Image image1 = new Image("/imagenes/4-0.png");
                            ptb1.setImage(image1);
                        }
                        if (aux.getCara2() == 1) {
                            Image image1 = new Image("/imagenes/4-1.png");
                            ptb1.setImage(image1);

                        }
                        if (aux.getCara2() == 2) {
                            Image image1 = new Image("/imagenes/4-2.png");
                            ptb1.setImage(image1);
                        }
                        if (aux.getCara2() == 3) {
                            Image image1 = new Image("/imagenes/4-3.png");
                            ptb1.setImage(image1);
                        }
                        if (aux.getCara2() == 4) {
                            Image image1 = new Image("/imagenes/4-4.png");

                            ptb1.setImage(image1);
                        }
                        if (aux.getCara2() == 5) {
                            Image image1 = new Image("/imagenes/4-5.png");
                            ptb1.setImage(image1);
                        }
                        if (aux.getCara2() == 6) {
                            Image image1 = new Image("/imagenes/4-6.png");
                            ptb1.setImage(image1);
                        }
                    }
                    if (aux.getCara1() == 5) {
                        if (aux.getCara2() == 0) {
                            Image image1 = new Image("/imagenes/5-0.png");
                            ptb1.setImage(image1);
                        }
                        if (aux.getCara2() == 1) {
                            Image image1 = new Image("/imagenes/5-1.png");
                            ptb1.setImage(image1);

                        }
                        if (aux.getCara2() == 2) {
                            Image image1 = new Image("/imagenes/5-2.png");
                            ptb1.setImage(image1);
                        }
                        if (aux.getCara2() == 3) {
                            Image image1 = new Image("/imagenes/5-3.png");
                            ptb1.setImage(image1);
                        }
                        if (aux.getCara2() == 4) {
                            Image image1 = new Image("/imagenes/5-4.png");

                            ptb1.setImage(image1);
                        }
                        if (aux.getCara2() == 5) {
                            Image image1 = new Image("/imagenes/5-5.png");
                            ptb1.setImage(image1);
                        }
                        if (aux.getCara2() == 6) {
                            Image image1 = new Image("/imagenes/5-6.png");
                            ptb1.setImage(image1);
                        }
                    }
                    if (aux.getCara1() == 6) {
                        if (aux.getCara2() == 0) {
                            Image image1 = new Image("/imagenes/6-0.png");
                            ptb1.setImage(image1);
                        }
                        if (aux.getCara2() == 1) {
                            Image image1 = new Image("/imagenes/61.png");
                            ptb1.setImage(image1);

                        }
                        if (aux.getCara2() == 2) {
                            Image image1 = new Image("/imagenes/6-2.png");
                            ptb1.setImage(image1);
                        }
                        if (aux.getCara2() == 3) {
                            Image image1 = new Image("/imagenes/6-3.png");
                            ptb1.setImage(image1);
                        }
                        if (aux.getCara2() == 4) {
                            Image image1 = new Image("/imagenes/6-4.png");

                            ptb1.setImage(image1);
                        }
                        if (aux.getCara2() == 5) {
                            Image image1 = new Image("/imagenes/6-5.png");
                            ptb1.setImage(image1);
                        }
                        if (aux.getCara2() == 6) {
                            Image image1 = new Image("/imagenes/6-6.png");
                            ptb1.setImage(image1);
                        }
                    }

                    break;

                case 1:
                    if (aux.getCara1() == 0) {
                        if (aux.getCara2() == 0) {
                            Image image2 = new Image("/imagenes/0-0.png");
                            ptb2.setImage(image2);
                        }
                        if (aux.getCara2() == 1) {
                            Image image2 = new Image("/imagenes/0-1.png");
                            ptb2.setImage(image2);

                        }
                        if (aux.getCara2() == 2) {
                            Image image2 = new Image("/imagenes/0-2.png");
                            ptb2.setImage(image2);
                        }
                        if (aux.getCara2() == 3) {
                            Image image2 = new Image("/imagenes/0-3.png");
                            ptb2.setImage(image2);
                        }
                        if (aux.getCara2() == 4) {
                            Image image2 = new Image("/imagenes/0-4.png");

                            ptb2.setImage(image2);
                        }
                        if (aux.getCara2() == 5) {
                            Image image2 = new Image("/imagenes/0-5.png");
                            ptb2.setImage(image2);
                        }
                        if (aux.getCara2() == 6) {
                            Image image2 = new Image("/imagenes/0-6.png");
                            ptb2.setImage(image2);
                        }
                    }
                    if (aux.getCara1() == 1) {
                        if (aux.getCara2() == 0) {
                            Image image2 = new Image("/imagenes/1-0.png");
                            ptb2.setImage(image2);
                        }
                        if (aux.getCara2() == 1) {
                            Image image2 = new Image("/imagenes/1-1.png");
                            ptb2.setImage(image2);

                        }
                        if (aux.getCara2() == 2) {
                            Image image2 = new Image("/imagenes/1-2.png");
                            ptb2.setImage(image2);
                        }
                        if (aux.getCara2() == 3) {
                            Image image2 = new Image("/imagenes/1-3.png");
                            ptb2.setImage(image2);
                        }
                        if (aux.getCara2() == 4) {
                            Image image2 = new Image("/imagenes/1-4.png");

                            ptb2.setImage(image2);
                        }
                        if (aux.getCara2() == 5) {
                            Image image2 = new Image("/imagenes/1-5.png");
                            ptb2.setImage(image2);
                        }
                        if (aux.getCara2() == 6) {
                            Image image2 = new Image("/imagenes/1-6.png");
                            ptb2.setImage(image2);
                        }
                    }
                    if (aux.getCara1() == 2) {
                        if (aux.getCara2() == 0) {
                            Image image2 = new Image("/imagenes/2-0.png");
                            ptb2.setImage(image2);
                        }
                        if (aux.getCara2() == 1) {
                            Image image2 = new Image("/imagenes/2-1.png");
                            ptb2.setImage(image2);

                        }
                        if (aux.getCara2() == 2) {
                            Image image2 = new Image("/imagenes/2-2.png");
                            ptb2.setImage(image2);
                        }
                        if (aux.getCara2() == 3) {
                            Image image2 = new Image("/imagenes/2-3.png");
                            ptb2.setImage(image2);
                        }
                        if (aux.getCara2() == 4) {
                            Image image2 = new Image("/imagenes/2-4.png");

                            ptb2.setImage(image2);
                        }
                        if (aux.getCara2() == 5) {
                            Image image2 = new Image("/imagenes/2-5.png");
                            ptb2.setImage(image2);
                        }
                        if (aux.getCara2() == 6) {
                            Image image2 = new Image("/imagenes/2-6.png");
                            ptb2.setImage(image2);
                        }
                    }
                    if (aux.getCara1() == 3) {
                        if (aux.getCara2() == 0) {
                            Image image2 = new Image("/imagenes/3-0.png");
                            ptb2.setImage(image2);
                        }
                        if (aux.getCara2() == 1) {
                            Image image2 = new Image("/imagenes/3-1.png");
                            ptb2.setImage(image2);

                        }
                        if (aux.getCara2() == 2) {
                            Image image2 = new Image("/imagenes/3-2.png");
                            ptb2.setImage(image2);
                        }
                        if (aux.getCara2() == 3) {
                            Image image2 = new Image("/imagenes/3-3.png");
                            ptb2.setImage(image2);
                        }
                        if (aux.getCara2() == 4) {
                            Image image2 = new Image("/imagenes/3-4.png");

                            ptb2.setImage(image2);
                        }
                        if (aux.getCara2() == 5) {
                            Image image2 = new Image("/imagenes/3-5.png");
                            ptb2.setImage(image2);
                        }
                        if (aux.getCara2() == 6) {
                            Image image2 = new Image("/imagenes/3-6.png");
                            ptb2.setImage(image2);
                        }
                    }
                    if (aux.getCara1() == 4) {
                        if (aux.getCara2() == 0) {
                            Image image2 = new Image("/imagenes/4-0.png");
                            ptb2.setImage(image2);
                        }
                        if (aux.getCara2() == 1) {
                            Image image2 = new Image("/imagenes/4-1.png");
                            ptb2.setImage(image2);

                        }
                        if (aux.getCara2() == 2) {
                            Image image2 = new Image("/imagenes/4-2.png");
                            ptb2.setImage(image2);
                        }
                        if (aux.getCara2() == 3) {
                            Image image2 = new Image("/imagenes/4-3.png");
                            ptb2.setImage(image2);
                        }
                        if (aux.getCara2() == 4) {
                            Image image2 = new Image("/imagenes/4-4.png");

                            ptb2.setImage(image2);
                        }
                        if (aux.getCara2() == 5) {
                            Image image2 = new Image("/imagenes/4-5.png");
                            ptb2.setImage(image2);
                        }
                        if (aux.getCara2() == 6) {
                            Image image2 = new Image("/imagenes/4-6.png");
                            ptb2.setImage(image2);
                        }
                    }
                    if (aux.getCara1() == 5) {
                        if (aux.getCara2() == 0) {
                            Image image2 = new Image("/imagenes/5-0.png");
                            ptb2.setImage(image2);
                        }
                        if (aux.getCara2() == 1) {
                            Image image2 = new Image("/imagenes/5-1.png");
                            ptb2.setImage(image2);

                        }
                        if (aux.getCara2() == 2) {
                            Image image2 = new Image("/imagenes/5-2.png");
                            ptb2.setImage(image2);
                        }
                        if (aux.getCara2() == 3) {
                            Image image2 = new Image("/imagenes/5-3.png");
                            ptb2.setImage(image2);
                        }
                        if (aux.getCara2() == 4) {
                            Image image2 = new Image("/imagenes/5-4.png");

                            ptb2.setImage(image2);
                        }
                        if (aux.getCara2() == 5) {
                            Image image2 = new Image("/imagenes/5-5.png");
                            ptb2.setImage(image2);
                        }
                        if (aux.getCara2() == 6) {
                            Image image2 = new Image("/imagenes/5-6.png");
                            ptb2.setImage(image2);
                        }
                    }
                    if (aux.getCara1() == 6) {
                        if (aux.getCara2() == 0) {
                            Image image2 = new Image("/imagenes/6-0.png");
                            ptb2.setImage(image2);
                        }
                        if (aux.getCara2() == 1) {
                            Image image2 = new Image("/imagenes/61.png");
                            ptb2.setImage(image2);

                        }
                        if (aux.getCara2() == 2) {
                            Image image2 = new Image("/imagenes/6-2.png");
                            ptb2.setImage(image2);
                        }
                        if (aux.getCara2() == 3) {
                            Image image2 = new Image("/imagenes/6-3.png");
                            ptb2.setImage(image2);
                        }
                        if (aux.getCara2() == 4) {
                            Image image2 = new Image("/imagenes/6-4.png");

                            ptb2.setImage(image2);
                        }
                        if (aux.getCara2() == 5) {
                            Image image2 = new Image("/imagenes/6-5.png");
                            ptb2.setImage(image2);
                        }
                        if (aux.getCara2() == 6) {
                            Image image2 = new Image("/imagenes/6-6.png");
                            ptb2.setImage(image2);
                        }
                    }

                    break;

                case 2:
                    if (aux.getCara1() == 0) {
                        if (aux.getCara2() == 0) {
                            Image image3 = new Image("/imagenes/0-0.png");
                            ptb3.setImage(image3);
                        }
                        if (aux.getCara2() == 1) {
                            Image image3 = new Image("/imagenes/0-1.png");
                            ptb3.setImage(image3);

                        }
                        if (aux.getCara2() == 2) {
                            Image image3 = new Image("/imagenes/0-2.png");
                            ptb3.setImage(image3);
                        }
                        if (aux.getCara2() == 3) {
                            Image image3 = new Image("/imagenes/0-3.png");
                            ptb3.setImage(image3);
                        }
                        if (aux.getCara2() == 4) {
                            Image image3 = new Image("/imagenes/0-4.png");

                            ptb3.setImage(image3);
                        }
                        if (aux.getCara2() == 5) {
                            Image image3 = new Image("/imagenes/0-5.png");
                            ptb3.setImage(image3);
                        }
                        if (aux.getCara2() == 6) {
                            Image image3 = new Image("/imagenes/0-6.png");
                            ptb3.setImage(image3);
                        }
                    }
                    if (aux.getCara1() == 1) {
                        if (aux.getCara2() == 0) {
                            Image image3 = new Image("/imagenes/1-0.png");
                            ptb3.setImage(image3);
                        }
                        if (aux.getCara2() == 1) {
                            Image image3 = new Image("/imagenes/1-1.png");
                            ptb3.setImage(image3);

                        }
                        if (aux.getCara2() == 2) {
                            Image image3 = new Image("/imagenes/1-2.png");
                            ptb3.setImage(image3);
                        }
                        if (aux.getCara2() == 3) {
                            Image image3 = new Image("/imagenes/1-3.png");
                            ptb3.setImage(image3);
                        }
                        if (aux.getCara2() == 4) {
                            Image image3 = new Image("/imagenes/1-4.png");

                            ptb3.setImage(image3);
                        }
                        if (aux.getCara2() == 5) {
                            Image image3 = new Image("/imagenes/1-5.png");
                            ptb3.setImage(image3);
                        }
                        if (aux.getCara2() == 6) {
                            Image image3 = new Image("/imagenes/1-6.png");
                            ptb3.setImage(image3);
                        }
                    }
                    if (aux.getCara1() == 2) {
                        if (aux.getCara2() == 0) {
                            Image image3 = new Image("/imagenes/2-0.png");
                            ptb3.setImage(image3);
                        }
                        if (aux.getCara2() == 1) {
                            Image image3 = new Image("/imagenes/2-1.png");
                            ptb3.setImage(image3);

                        }
                        if (aux.getCara2() == 2) {
                            Image image3 = new Image("/imagenes/2-2.png");
                            ptb3.setImage(image3);
                        }
                        if (aux.getCara2() == 3) {
                            Image image3 = new Image("/imagenes/2-3.png");
                            ptb3.setImage(image3);
                        }
                        if (aux.getCara2() == 4) {
                            Image image3 = new Image("/imagenes/2-4.png");

                            ptb3.setImage(image3);
                        }
                        if (aux.getCara2() == 5) {
                            Image image3 = new Image("/imagenes/2-5.png");
                            ptb3.setImage(image3);
                        }
                        if (aux.getCara2() == 6) {
                            Image image3 = new Image("/imagenes/2-6.png");
                            ptb3.setImage(image3);
                        }
                    }
                    if (aux.getCara1() == 3) {
                        if (aux.getCara2() == 0) {
                            Image image3 = new Image("/imagenes/3-0.png");
                            ptb3.setImage(image3);
                        }
                        if (aux.getCara2() == 1) {
                            Image image3 = new Image("/imagenes/3-1.png");
                            ptb3.setImage(image3);

                        }
                        if (aux.getCara2() == 2) {
                            Image image3 = new Image("/imagenes/3-2.png");
                            ptb3.setImage(image3);
                        }
                        if (aux.getCara2() == 3) {
                            Image image3 = new Image("/imagenes/3-3.png");
                            ptb3.setImage(image3);
                        }
                        if (aux.getCara2() == 4) {
                            Image image3 = new Image("/imagenes/3-4.png");

                            ptb3.setImage(image3);
                        }
                        if (aux.getCara2() == 5) {
                            Image image3 = new Image("/imagenes/3-5.png");
                            ptb3.setImage(image3);
                        }
                        if (aux.getCara2() == 6) {
                            Image image3 = new Image("/imagenes/3-6.png");
                            ptb3.setImage(image3);
                        }
                    }
                    if (aux.getCara1() == 4) {
                        if (aux.getCara2() == 0) {
                            Image image3 = new Image("/imagenes/4-0.png");
                            ptb3.setImage(image3);
                        }
                        if (aux.getCara2() == 1) {
                            Image image3 = new Image("/imagenes/4-1.png");
                            ptb3.setImage(image3);

                        }
                        if (aux.getCara2() == 2) {
                            Image image3 = new Image("/imagenes/4-2.png");
                            ptb3.setImage(image3);
                        }
                        if (aux.getCara2() == 3) {
                            Image image3 = new Image("/imagenes/4-3.png");
                            ptb3.setImage(image3);
                        }
                        if (aux.getCara2() == 4) {
                            Image image3 = new Image("/imagenes/4-4.png");

                            ptb3.setImage(image3);
                        }
                        if (aux.getCara2() == 5) {
                            Image image3 = new Image("/imagenes/4-5.png");
                            ptb3.setImage(image3);
                        }
                        if (aux.getCara2() == 6) {
                            Image image3 = new Image("/imagenes/4-6.png");
                            ptb3.setImage(image3);
                        }
                    }
                    if (aux.getCara1() == 5) {
                        if (aux.getCara2() == 0) {
                            Image image3 = new Image("/imagenes/5-0.png");
                            ptb3.setImage(image3);
                        }
                        if (aux.getCara2() == 1) {
                            Image image3 = new Image("/imagenes/5-1.png");
                            ptb3.setImage(image3);

                        }
                        if (aux.getCara2() == 2) {
                            Image image3 = new Image("/imagenes/5-2.png");
                            ptb3.setImage(image3);
                        }
                        if (aux.getCara2() == 3) {
                            Image image3 = new Image("/imagenes/5-3.png");
                            ptb3.setImage(image3);
                        }
                        if (aux.getCara2() == 4) {
                            Image image3 = new Image("/imagenes/5-4.png");

                            ptb3.setImage(image3);
                        }
                        if (aux.getCara2() == 5) {
                            Image image3 = new Image("/imagenes/5-5.png");
                            ptb3.setImage(image3);
                        }
                        if (aux.getCara2() == 6) {
                            Image image3 = new Image("/imagenes/5-6.png");
                            ptb3.setImage(image3);
                        }
                    }
                    if (aux.getCara1() == 6) {
                        if (aux.getCara2() == 0) {
                            Image image3 = new Image("/imagenes/6-0.png");
                            ptb3.setImage(image3);
                        }
                        if (aux.getCara2() == 1) {
                            Image image3 = new Image("/imagenes/61.png");
                            ptb3.setImage(image3);

                        }
                        if (aux.getCara2() == 2) {
                            Image image3 = new Image("/imagenes/6-2.png");
                            ptb3.setImage(image3);
                        }
                        if (aux.getCara2() == 3) {
                            Image image3 = new Image("/imagenes/6-3.png");
                            ptb3.setImage(image3);
                        }
                        if (aux.getCara2() == 4) {
                            Image image3 = new Image("/imagenes/6-4.png");

                            ptb3.setImage(image3);
                        }
                        if (aux.getCara2() == 5) {
                            Image image3 = new Image("/imagenes/6-5.png");
                            ptb3.setImage(image3);
                        }
                        if (aux.getCara2() == 6) {
                            Image image3 = new Image("/imagenes/6-6.png");
                            ptb3.setImage(image3);
                        }
                    }

                    break;

                case 3:
                    if (aux.getCara1() == 0) {
                        if (aux.getCara2() == 0) {
                            Image image4 = new Image("/imagenes/0-0.png");
                            ptb4.setImage(image4);
                        }
                        if (aux.getCara2() == 1) {
                            Image image4 = new Image("/imagenes/0-1.png");
                            ptb4.setImage(image4);

                        }
                        if (aux.getCara2() == 2) {
                            Image image4 = new Image("/imagenes/0-2.png");
                            ptb4.setImage(image4);
                        }
                        if (aux.getCara2() == 3) {
                            Image image4 = new Image("/imagenes/0-3.png");
                            ptb4.setImage(image4);
                        }
                        if (aux.getCara2() == 4) {
                            Image image4 = new Image("/imagenes/0-4.png");

                            ptb4.setImage(image4);
                        }
                        if (aux.getCara2() == 5) {
                            Image image4 = new Image("/imagenes/0-5.png");
                            ptb4.setImage(image4);
                        }
                        if (aux.getCara2() == 6) {
                            Image image4 = new Image("/imagenes/0-6.png");
                            ptb4.setImage(image4);
                        }
                    }
                    if (aux.getCara1() == 1) {
                        if (aux.getCara2() == 0) {
                            Image image4 = new Image("/imagenes/1-0.png");
                            ptb4.setImage(image4);
                        }
                        if (aux.getCara2() == 1) {
                            Image image4 = new Image("/imagenes/1-1.png");
                            ptb4.setImage(image4);

                        }
                        if (aux.getCara2() == 2) {
                            Image image4 = new Image("/imagenes/1-2.png");
                            ptb4.setImage(image4);
                        }
                        if (aux.getCara2() == 3) {
                            Image image4 = new Image("/imagenes/1-3.png");
                            ptb4.setImage(image4);
                        }
                        if (aux.getCara2() == 4) {
                            Image image4 = new Image("/imagenes/1-4.png");

                            ptb4.setImage(image4);
                        }
                        if (aux.getCara2() == 5) {
                            Image image4 = new Image("/imagenes/1-5.png");
                            ptb4.setImage(image4);
                        }
                        if (aux.getCara2() == 6) {
                            Image image4 = new Image("/imagenes/1-6.png");
                            ptb4.setImage(image4);
                        }
                    }
                    if (aux.getCara1() == 2) {
                        if (aux.getCara2() == 0) {
                            Image image4 = new Image("/imagenes/2-0.png");
                            ptb4.setImage(image4);
                        }
                        if (aux.getCara2() == 1) {
                            Image image4 = new Image("/imagenes/2-1.png");
                            ptb4.setImage(image4);

                        }
                        if (aux.getCara2() == 2) {
                            Image image4 = new Image("/imagenes/2-2.png");
                            ptb4.setImage(image4);
                        }
                        if (aux.getCara2() == 3) {
                            Image image4 = new Image("/imagenes/2-3.png");
                            ptb4.setImage(image4);
                        }
                        if (aux.getCara2() == 4) {
                            Image image4 = new Image("/imagenes/2-4.png");

                            ptb4.setImage(image4);
                        }
                        if (aux.getCara2() == 5) {
                            Image image4 = new Image("/imagenes/2-5.png");
                            ptb4.setImage(image4);
                        }
                        if (aux.getCara2() == 6) {
                            Image image4 = new Image("/imagenes/2-6.png");
                            ptb4.setImage(image4);
                        }
                    }
                    if (aux.getCara1() == 3) {
                        if (aux.getCara2() == 0) {
                            Image image4 = new Image("/imagenes/3-0.png");
                            ptb4.setImage(image4);
                        }
                        if (aux.getCara2() == 1) {
                            Image image4 = new Image("/imagenes/3-1.png");
                            ptb4.setImage(image4);

                        }
                        if (aux.getCara2() == 2) {
                            Image image4 = new Image("/imagenes/3-2.png");
                            ptb4.setImage(image4);
                        }
                        if (aux.getCara2() == 3) {
                            Image image4 = new Image("/imagenes/3-3.png");
                            ptb4.setImage(image4);
                        }
                        if (aux.getCara2() == 4) {
                            Image image4 = new Image("/imagenes/3-4.png");

                            ptb4.setImage(image4);
                        }
                        if (aux.getCara2() == 5) {
                            Image image4 = new Image("/imagenes/3-5.png");
                            ptb4.setImage(image4);
                        }
                        if (aux.getCara2() == 6) {
                            Image image4 = new Image("/imagenes/3-6.png");
                            ptb4.setImage(image4);
                        }
                    }
                    if (aux.getCara1() == 4) {
                        if (aux.getCara2() == 0) {
                            Image image4 = new Image("/imagenes/4-0.png");
                            ptb4.setImage(image4);
                        }
                        if (aux.getCara2() == 1) {
                            Image image4 = new Image("/imagenes/4-1.png");
                            ptb4.setImage(image4);

                        }
                        if (aux.getCara2() == 2) {
                            Image image4 = new Image("/imagenes/4-2.png");
                            ptb4.setImage(image4);
                        }
                        if (aux.getCara2() == 3) {
                            Image image4 = new Image("/imagenes/4-3.png");
                            ptb4.setImage(image4);
                        }
                        if (aux.getCara2() == 4) {
                            Image image4 = new Image("/imagenes/4-4.png");

                            ptb4.setImage(image4);
                        }
                        if (aux.getCara2() == 5) {
                            Image image4 = new Image("/imagenes/4-5.png");
                            ptb4.setImage(image4);
                        }
                        if (aux.getCara2() == 6) {
                            Image image4 = new Image("/imagenes/4-6.png");
                            ptb4.setImage(image4);
                        }
                    }
                    if (aux.getCara1() == 5) {
                        if (aux.getCara2() == 0) {
                            Image image4 = new Image("/imagenes/5-0.png");
                            ptb4.setImage(image4);
                        }
                        if (aux.getCara2() == 1) {
                            Image image4 = new Image("/imagenes/5-1.png");
                            ptb4.setImage(image4);

                        }
                        if (aux.getCara2() == 2) {
                            Image image4 = new Image("/imagenes/5-2.png");
                            ptb4.setImage(image4);
                        }
                        if (aux.getCara2() == 3) {
                            Image image4 = new Image("/imagenes/5-3.png");
                            ptb4.setImage(image4);
                        }
                        if (aux.getCara2() == 4) {
                            Image image4 = new Image("/imagenes/5-4.png");

                            ptb4.setImage(image4);
                        }
                        if (aux.getCara2() == 5) {
                            Image image4 = new Image("/imagenes/5-5.png");
                            ptb4.setImage(image4);
                        }
                        if (aux.getCara2() == 6) {
                            Image image4 = new Image("/imagenes/5-6.png");
                            ptb4.setImage(image4);
                        }
                    }
                    if (aux.getCara1() == 6) {
                        if (aux.getCara2() == 0) {
                            Image image4 = new Image("/imagenes/6-0.png");
                            ptb4.setImage(image4);
                        }
                        if (aux.getCara2() == 1) {
                            Image image4 = new Image("/imagenes/61.png");
                            ptb4.setImage(image4);

                        }
                        if (aux.getCara2() == 2) {
                            Image image4 = new Image("/imagenes/6-2.png");
                            ptb4.setImage(image4);
                        }
                        if (aux.getCara2() == 3) {
                            Image image4 = new Image("/imagenes/6-3.png");
                            ptb4.setImage(image4);
                        }
                        if (aux.getCara2() == 4) {
                            Image image4 = new Image("/imagenes/6-4.png");

                            ptb4.setImage(image4);
                        }
                        if (aux.getCara2() == 5) {
                            Image image4 = new Image("/imagenes/6-5.png");
                            ptb4.setImage(image4);
                        }
                        if (aux.getCara2() == 6) {
                            Image image4 = new Image("/imagenes/6-6.png");
                            ptb4.setImage(image4);
                        }
                    }

                    break;

                case 4:
                    if (aux.getCara1() == 0) {
                        if (aux.getCara2() == 0) {
                            Image image5 = new Image("/imagenes/0-0.png");
                            ptb5.setImage(image5);
                        }
                        if (aux.getCara2() == 1) {
                            Image image5 = new Image("/imagenes/0-1.png");
                            ptb5.setImage(image5);

                        }
                        if (aux.getCara2() == 2) {
                            Image image5 = new Image("/imagenes/0-2.png");
                            ptb5.setImage(image5);
                        }
                        if (aux.getCara2() == 3) {
                            Image image5 = new Image("/imagenes/0-3.png");
                            ptb5.setImage(image5);
                        }
                        if (aux.getCara2() == 4) {
                            Image image5 = new Image("/imagenes/0-4.png");

                            ptb5.setImage(image5);
                        }
                        if (aux.getCara2() == 5) {
                            Image image5 = new Image("/imagenes/0-5.png");
                            ptb5.setImage(image5);
                        }
                        if (aux.getCara2() == 6) {
                            Image image5 = new Image("/imagenes/0-6.png");
                            ptb5.setImage(image5);
                        }
                    }
                    if (aux.getCara1() == 1) {
                        if (aux.getCara2() == 0) {
                            Image image5 = new Image("/imagenes/1-0.png");
                            ptb5.setImage(image5);
                        }
                        if (aux.getCara2() == 1) {
                            Image image5 = new Image("/imagenes/1-1.png");
                            ptb5.setImage(image5);

                        }
                        if (aux.getCara2() == 2) {
                            Image image5 = new Image("/imagenes/1-2.png");
                            ptb5.setImage(image5);
                        }
                        if (aux.getCara2() == 3) {
                            Image image5 = new Image("/imagenes/1-3.png");
                            ptb5.setImage(image5);
                        }
                        if (aux.getCara2() == 4) {
                            Image image5 = new Image("/imagenes/1-4.png");

                            ptb5.setImage(image5);
                        }
                        if (aux.getCara2() == 5) {
                            Image image5 = new Image("/imagenes/1-5.png");
                            ptb5.setImage(image5);
                        }
                        if (aux.getCara2() == 6) {
                            Image image5 = new Image("/imagenes/1-6.png");
                            ptb5.setImage(image5);
                        }
                    }
                    if (aux.getCara1() == 2) {
                        if (aux.getCara2() == 0) {
                            Image image5 = new Image("/imagenes/2-0.png");
                            ptb5.setImage(image5);
                        }
                        if (aux.getCara2() == 1) {
                            Image image5 = new Image("/imagenes/2-1.png");
                            ptb5.setImage(image5);

                        }
                        if (aux.getCara2() == 2) {
                            Image image5 = new Image("/imagenes/2-2.png");
                            ptb5.setImage(image5);
                        }
                        if (aux.getCara2() == 3) {
                            Image image5 = new Image("/imagenes/2-3.png");
                            ptb5.setImage(image5);
                        }
                        if (aux.getCara2() == 4) {
                            Image image5 = new Image("/imagenes/2-4.png");

                            ptb5.setImage(image5);
                        }
                        if (aux.getCara2() == 5) {
                            Image image5 = new Image("/imagenes/2-5.png");
                            ptb5.setImage(image5);
                        }
                        if (aux.getCara2() == 6) {
                            Image image5 = new Image("/imagenes/2-6.png");
                            ptb5.setImage(image5);
                        }
                    }
                    if (aux.getCara1() == 3) {
                        if (aux.getCara2() == 0) {
                            Image image5 = new Image("/imagenes/3-0.png");
                            ptb5.setImage(image5);
                        }
                        if (aux.getCara2() == 1) {
                            Image image5 = new Image("/imagenes/3-1.png");
                            ptb5.setImage(image5);

                        }
                        if (aux.getCara2() == 2) {
                            Image image5 = new Image("/imagenes/3-2.png");
                            ptb5.setImage(image5);
                        }
                        if (aux.getCara2() == 3) {
                            Image image5 = new Image("/imagenes/3-3.png");
                            ptb5.setImage(image5);
                        }
                        if (aux.getCara2() == 4) {
                            Image image5 = new Image("/imagenes/3-4.png");

                            ptb5.setImage(image5);
                        }
                        if (aux.getCara2() == 5) {
                            Image image5 = new Image("/imagenes/3-5.png");
                            ptb5.setImage(image5);
                        }
                        if (aux.getCara2() == 6) {
                            Image image5 = new Image("/imagenes/3-6.png");
                            ptb5.setImage(image5);
                        }
                    }
                    if (aux.getCara1() == 4) {
                        if (aux.getCara2() == 0) {
                            Image image5 = new Image("/imagenes/4-0.png");
                            ptb5.setImage(image5);
                        }
                        if (aux.getCara2() == 1) {
                            Image image5 = new Image("/imagenes/4-1.png");
                            ptb5.setImage(image5);

                        }
                        if (aux.getCara2() == 2) {
                            Image image5 = new Image("/imagenes/4-2.png");
                            ptb5.setImage(image5);
                        }
                        if (aux.getCara2() == 3) {
                            Image image5 = new Image("/imagenes/4-3.png");
                            ptb5.setImage(image5);
                        }
                        if (aux.getCara2() == 4) {
                            Image image5 = new Image("/imagenes/4-4.png");

                            ptb5.setImage(image5);
                        }
                        if (aux.getCara2() == 5) {
                            Image image5 = new Image("/imagenes/4-5.png");
                            ptb5.setImage(image5);
                        }
                        if (aux.getCara2() == 6) {
                            Image image5 = new Image("/imagenes/4-6.png");
                            ptb5.setImage(image5);
                        }
                    }
                    if (aux.getCara1() == 5) {
                        if (aux.getCara2() == 0) {
                            Image image5 = new Image("/imagenes/5-0.png");
                            ptb5.setImage(image5);
                        }
                        if (aux.getCara2() == 1) {
                            Image image5 = new Image("/imagenes/5-1.png");
                            ptb5.setImage(image5);

                        }
                        if (aux.getCara2() == 2) {
                            Image image5 = new Image("/imagenes/5-2.png");
                            ptb5.setImage(image5);
                        }
                        if (aux.getCara2() == 3) {
                            Image image5 = new Image("/imagenes/5-3.png");
                            ptb5.setImage(image5);
                        }
                        if (aux.getCara2() == 4) {
                            Image image5 = new Image("/imagenes/5-4.png");

                            ptb5.setImage(image5);
                        }
                        if (aux.getCara2() == 5) {
                            Image image5 = new Image("/imagenes/5-5.png");
                            ptb5.setImage(image5);
                        }
                        if (aux.getCara2() == 6) {
                            Image image5 = new Image("/imagenes/5-6.png");
                            ptb5.setImage(image5);
                        }
                    }
                    if (aux.getCara1() == 6) {
                        if (aux.getCara2() == 0) {
                            Image image5 = new Image("/imagenes/6-0.png");
                            ptb5.setImage(image5);
                        }
                        if (aux.getCara2() == 1) {
                            Image image5 = new Image("/imagenes/61.png");
                            ptb5.setImage(image5);

                        }
                        if (aux.getCara2() == 2) {
                            Image image5 = new Image("/imagenes/6-2.png");
                            ptb5.setImage(image5);
                        }
                        if (aux.getCara2() == 3) {
                            Image image5 = new Image("/imagenes/6-3.png");
                            ptb5.setImage(image5);
                        }
                        if (aux.getCara2() == 4) {
                            Image image5 = new Image("/imagenes/6-4.png");

                            ptb5.setImage(image5);
                        }
                        if (aux.getCara2() == 5) {
                            Image image5 = new Image("/imagenes/6-5.png");
                            ptb5.setImage(image5);
                        }
                        if (aux.getCara2() == 6) {
                            Image image5 = new Image("/imagenes/6-6.png");
                            ptb5.setImage(image5);
                        }
                    }

                    break;

                case 5:
                    if (aux.getCara1() == 0) {
                        if (aux.getCara2() == 0) {
                            Image image6 = new Image("/imagenes/0-0.png");
                            ptb6.setImage(image6);
                        }
                        if (aux.getCara2() == 1) {
                            Image image6 = new Image("/imagenes/0-1.png");
                            ptb6.setImage(image6);

                        }
                        if (aux.getCara2() == 2) {
                            Image image6 = new Image("/imagenes/0-2.png");
                            ptb6.setImage(image6);
                        }
                        if (aux.getCara2() == 3) {
                            Image image6 = new Image("/imagenes/0-3.png");
                            ptb6.setImage(image6);
                        }
                        if (aux.getCara2() == 4) {
                            Image image6 = new Image("/imagenes/0-4.png");

                            ptb6.setImage(image6);
                        }
                        if (aux.getCara2() == 5) {
                            Image image6 = new Image("/imagenes/0-5.png");
                            ptb6.setImage(image6);
                        }
                        if (aux.getCara2() == 6) {
                            Image image6 = new Image("/imagenes/0-6.png");
                            ptb6.setImage(image6);
                        }
                    }
                    if (aux.getCara1() == 1) {
                        if (aux.getCara2() == 0) {
                            Image image6 = new Image("/imagenes/1-0.png");
                            ptb6.setImage(image6);
                        }
                        if (aux.getCara2() == 1) {
                            Image image6 = new Image("/imagenes/1-1.png");
                            ptb6.setImage(image6);

                        }
                        if (aux.getCara2() == 2) {
                            Image image6 = new Image("/imagenes/1-2.png");
                            ptb6.setImage(image6);
                        }
                        if (aux.getCara2() == 3) {
                            Image image6 = new Image("/imagenes/1-3.png");
                            ptb6.setImage(image6);
                        }
                        if (aux.getCara2() == 4) {
                            Image image6 = new Image("/imagenes/1-4.png");

                            ptb6.setImage(image6);
                        }
                        if (aux.getCara2() == 5) {
                            Image image6 = new Image("/imagenes/1-5.png");
                            ptb6.setImage(image6);
                        }
                        if (aux.getCara2() == 6) {
                            Image image6 = new Image("/imagenes/1-6.png");
                            ptb6.setImage(image6);
                        }
                    }
                    if (aux.getCara1() == 2) {
                        if (aux.getCara2() == 0) {
                            Image image6 = new Image("/imagenes/2-0.png");
                            ptb6.setImage(image6);
                        }
                        if (aux.getCara2() == 1) {
                            Image image6 = new Image("/imagenes/2-1.png");
                            ptb6.setImage(image6);

                        }
                        if (aux.getCara2() == 2) {
                            Image image6 = new Image("/imagenes/2-2.png");
                            ptb6.setImage(image6);
                        }
                        if (aux.getCara2() == 3) {
                            Image image6 = new Image("/imagenes/2-3.png");
                            ptb6.setImage(image6);
                        }
                        if (aux.getCara2() == 4) {
                            Image image6 = new Image("/imagenes/2-4.png");

                            ptb6.setImage(image6);
                        }
                        if (aux.getCara2() == 5) {
                            Image image6 = new Image("/imagenes/2-5.png");
                            ptb6.setImage(image6);
                        }
                        if (aux.getCara2() == 6) {
                            Image image6 = new Image("/imagenes/2-6.png");
                            ptb6.setImage(image6);
                        }
                    }
                    if (aux.getCara1() == 3) {
                        if (aux.getCara2() == 0) {
                            Image image6 = new Image("/imagenes/3-0.png");
                            ptb6.setImage(image6);
                        }
                        if (aux.getCara2() == 1) {
                            Image image6 = new Image("/imagenes/3-1.png");
                            ptb6.setImage(image6);

                        }
                        if (aux.getCara2() == 2) {
                            Image image6 = new Image("/imagenes/3-2.png");
                            ptb6.setImage(image6);
                        }
                        if (aux.getCara2() == 3) {
                            Image image6 = new Image("/imagenes/3-3.png");
                            ptb6.setImage(image6);
                        }
                        if (aux.getCara2() == 4) {
                            Image image6 = new Image("/imagenes/3-4.png");

                            ptb6.setImage(image6);
                        }
                        if (aux.getCara2() == 5) {
                            Image image6 = new Image("/imagenes/3-5.png");
                            ptb6.setImage(image6);
                        }
                        if (aux.getCara2() == 6) {
                            Image image6 = new Image("/imagenes/3-6.png");
                            ptb6.setImage(image6);
                        }
                    }
                    if (aux.getCara1() == 4) {
                        if (aux.getCara2() == 0) {
                            Image image6 = new Image("/imagenes/4-0.png");
                            ptb6.setImage(image6);
                        }
                        if (aux.getCara2() == 1) {
                            Image image6 = new Image("/imagenes/4-1.png");
                            ptb6.setImage(image6);

                        }
                        if (aux.getCara2() == 2) {
                            Image image6 = new Image("/imagenes/4-2.png");
                            ptb6.setImage(image6);
                        }
                        if (aux.getCara2() == 3) {
                            Image image6 = new Image("/imagenes/4-3.png");
                            ptb6.setImage(image6);
                        }
                        if (aux.getCara2() == 4) {
                            Image image6 = new Image("/imagenes/4-4.png");

                            ptb6.setImage(image6);
                        }
                        if (aux.getCara2() == 5) {
                            Image image6 = new Image("/imagenes/4-5.png");
                            ptb6.setImage(image6);
                        }
                        if (aux.getCara2() == 6) {
                            Image image6 = new Image("/imagenes/4-6.png");
                            ptb6.setImage(image6);
                        }
                    }
                    if (aux.getCara1() == 5) {
                        if (aux.getCara2() == 0) {
                            Image image6 = new Image("/imagenes/5-0.png");
                            ptb6.setImage(image6);
                        }
                        if (aux.getCara2() == 1) {
                            Image image6 = new Image("/imagenes/5-1.png");
                            ptb6.setImage(image6);

                        }
                        if (aux.getCara2() == 2) {
                            Image image6 = new Image("/imagenes/5-2.png");
                            ptb6.setImage(image6);
                        }
                        if (aux.getCara2() == 3) {
                            Image image6 = new Image("/imagenes/5-3.png");
                            ptb6.setImage(image6);
                        }
                        if (aux.getCara2() == 4) {
                            Image image6 = new Image("/imagenes/5-4.png");

                            ptb6.setImage(image6);
                        }
                        if (aux.getCara2() == 5) {
                            Image image6 = new Image("/imagenes/5-5.png");
                            ptb6.setImage(image6);
                        }
                        if (aux.getCara2() == 6) {
                            Image image6 = new Image("/imagenes/5-6.png");
                            ptb6.setImage(image6);
                        }
                    }
                    if (aux.getCara1() == 6) {
                        if (aux.getCara2() == 0) {
                            Image image6 = new Image("/imagenes/6-0.png");
                            ptb6.setImage(image6);
                        }
                        if (aux.getCara2() == 1) {
                            Image image6 = new Image("/imagenes/61.png");
                            ptb6.setImage(image6);

                        }
                        if (aux.getCara2() == 2) {
                            Image image6 = new Image("/imagenes/6-2.png");
                            ptb6.setImage(image6);
                        }
                        if (aux.getCara2() == 3) {
                            Image image6 = new Image("/imagenes/6-3.png");
                            ptb6.setImage(image6);
                        }
                        if (aux.getCara2() == 4) {
                            Image image6 = new Image("/imagenes/6-4.png");

                            ptb6.setImage(image6);
                        }
                        if (aux.getCara2() == 5) {
                            Image image6 = new Image("/imagenes/6-5.png");
                            ptb6.setImage(image6);
                        }
                        if (aux.getCara2() == 6) {
                            Image image6 = new Image("/imagenes/6-6.png");
                            ptb6.setImage(image6);
                        }
                    }

                    break;

                case 6:
                    if (aux.getCara1() == 0) {
                        if (aux.getCara2() == 0) {
                            Image image7 = new Image("/imagenes/0-0.png");
                            ptb7.setImage(image7);
                        }
                        if (aux.getCara2() == 1) {
                            Image image7 = new Image("/imagenes/0-1.png");
                            ptb7.setImage(image7);

                        }
                        if (aux.getCara2() == 2) {
                            Image image7 = new Image("/imagenes/0-2.png");
                            ptb7.setImage(image7);
                        }
                        if (aux.getCara2() == 3) {
                            Image image7 = new Image("/imagenes/0-3.png");
                            ptb7.setImage(image7);
                        }
                        if (aux.getCara2() == 4) {
                            Image image7 = new Image("/imagenes/0-4.png");

                            ptb7.setImage(image7);
                        }
                        if (aux.getCara2() == 5) {
                            Image image7 = new Image("/imagenes/0-5.png");
                            ptb7.setImage(image7);
                        }
                        if (aux.getCara2() == 6) {
                            Image image7 = new Image("/imagenes/0-6.png");
                            ptb7.setImage(image7);
                        }
                    }
                    if (aux.getCara1() == 1) {
                        if (aux.getCara2() == 0) {
                            Image image7 = new Image("/imagenes/1-0.png");
                            ptb7.setImage(image7);
                        }
                        if (aux.getCara2() == 1) {
                            Image image7 = new Image("/imagenes/1-1.png");
                            ptb7.setImage(image7);

                        }
                        if (aux.getCara2() == 2) {
                            Image image7 = new Image("/imagenes/1-2.png");
                            ptb7.setImage(image7);
                        }
                        if (aux.getCara2() == 3) {
                            Image image7 = new Image("/imagenes/1-3.png");
                            ptb7.setImage(image7);
                        }
                        if (aux.getCara2() == 4) {
                            Image image7 = new Image("/imagenes/1-4.png");

                            ptb7.setImage(image7);
                        }
                        if (aux.getCara2() == 5) {
                            Image image7 = new Image("/imagenes/1-5.png");
                            ptb7.setImage(image7);
                        }
                        if (aux.getCara2() == 6) {
                            Image image7 = new Image("/imagenes/1-6.png");
                            ptb7.setImage(image7);
                        }
                    }
                    if (aux.getCara1() == 2) {
                        if (aux.getCara2() == 0) {
                            Image image7 = new Image("/imagenes/2-0.png");
                            ptb7.setImage(image7);
                        }
                        if (aux.getCara2() == 1) {
                            Image image7 = new Image("/imagenes/2-1.png");
                            ptb7.setImage(image7);

                        }
                        if (aux.getCara2() == 2) {
                            Image image7 = new Image("/imagenes/2-2.png");
                            ptb7.setImage(image7);
                        }
                        if (aux.getCara2() == 3) {
                            Image image7 = new Image("/imagenes/2-3.png");
                            ptb7.setImage(image7);
                        }
                        if (aux.getCara2() == 4) {
                            Image image7 = new Image("/imagenes/2-4.png");

                            ptb7.setImage(image7);
                        }
                        if (aux.getCara2() == 5) {
                            Image image7 = new Image("/imagenes/2-5.png");
                            ptb7.setImage(image7);
                        }
                        if (aux.getCara2() == 6) {
                            Image image7 = new Image("/imagenes/2-6.png");
                            ptb7.setImage(image7);
                        }
                    }
                    if (aux.getCara1() == 3) {
                        if (aux.getCara2() == 0) {
                            Image image7 = new Image("/imagenes/3-0.png");
                            ptb7.setImage(image7);
                        }
                        if (aux.getCara2() == 1) {
                            Image image7 = new Image("/imagenes/3-1.png");
                            ptb7.setImage(image7);

                        }
                        if (aux.getCara2() == 2) {
                            Image image7 = new Image("/imagenes/3-2.png");
                            ptb7.setImage(image7);
                        }
                        if (aux.getCara2() == 3) {
                            Image image7 = new Image("/imagenes/3-3.png");
                            ptb7.setImage(image7);
                        }
                        if (aux.getCara2() == 4) {
                            Image image7 = new Image("/imagenes/3-4.png");

                            ptb7.setImage(image7);
                        }
                        if (aux.getCara2() == 5) {
                            Image image7 = new Image("/imagenes/3-5.png");
                            ptb7.setImage(image7);
                        }
                        if (aux.getCara2() == 6) {
                            Image image7 = new Image("/imagenes/3-6.png");
                            ptb7.setImage(image7);
                        }
                    }
                    if (aux.getCara1() == 4) {
                        if (aux.getCara2() == 0) {
                            Image image7 = new Image("/imagenes/4-0.png");
                            ptb7.setImage(image7);
                        }
                        if (aux.getCara2() == 1) {
                            Image image7 = new Image("/imagenes/4-1.png");
                            ptb7.setImage(image7);

                        }
                        if (aux.getCara2() == 2) {
                            Image image7 = new Image("/imagenes/4-2.png");
                            ptb7.setImage(image7);
                        }
                        if (aux.getCara2() == 3) {
                            Image image7 = new Image("/imagenes/4-3.png");
                            ptb7.setImage(image7);
                        }
                        if (aux.getCara2() == 4) {
                            Image image7 = new Image("/imagenes/4-4.png");

                            ptb7.setImage(image7);
                        }
                        if (aux.getCara2() == 5) {
                            Image image7 = new Image("/imagenes/4-5.png");
                            ptb7.setImage(image7);
                        }
                        if (aux.getCara2() == 6) {
                            Image image7 = new Image("/imagenes/4-6.png");
                            ptb7.setImage(image7);
                        }
                    }
                    if (aux.getCara1() == 5) {
                        if (aux.getCara2() == 0) {
                            Image image7 = new Image("/imagenes/5-0.png");
                            ptb7.setImage(image7);
                        }
                        if (aux.getCara2() == 1) {
                            Image image7 = new Image("/imagenes/5-1.png");
                            ptb7.setImage(image7);

                        }
                        if (aux.getCara2() == 2) {
                            Image image7 = new Image("/imagenes/5-2.png");
                            ptb7.setImage(image7);
                        }
                        if (aux.getCara2() == 3) {
                            Image image7 = new Image("/imagenes/5-3.png");
                            ptb7.setImage(image7);
                        }
                        if (aux.getCara2() == 4) {
                            Image image7 = new Image("/imagenes/5-4.png");

                            ptb7.setImage(image7);
                        }
                        if (aux.getCara2() == 5) {
                            Image image7 = new Image("/imagenes/5-5.png");
                            ptb7.setImage(image7);
                        }
                        if (aux.getCara2() == 6) {
                            Image image7 = new Image("/imagenes/5-6.png");
                            ptb7.setImage(image7);
                        }
                    }
                    if (aux.getCara1() == 6) {
                        if (aux.getCara2() == 0) {
                            Image image7 = new Image("/imagenes/6-0.png");
                            ptb7.setImage(image7);
                        }
                        if (aux.getCara2() == 1) {
                            Image image7 = new Image("/imagenes/61.png");
                            ptb7.setImage(image7);

                        }
                        if (aux.getCara2() == 2) {
                            Image image7 = new Image("/imagenes/6-2.png");
                            ptb7.setImage(image7);
                        }
                        if (aux.getCara2() == 3) {
                            Image image7 = new Image("/imagenes/6-3.png");
                            ptb7.setImage(image7);
                        }
                        if (aux.getCara2() == 4) {
                            Image image7 = new Image("/imagenes/6-4.png");

                            ptb7.setImage(image7);
                        }
                        if (aux.getCara2() == 5) {
                            Image image7 = new Image("/imagenes/6-5.png");
                            ptb7.setImage(image7);
                        }
                        if (aux.getCara2() == 6) {
                            Image image7 = new Image("/imagenes/6-6.png");
                            ptb7.setImage(image7);
                        }
                    }

                    break;

            }
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        imagen();
        lblpuntos.setText("Puntos: " + dominoJuego.Puntos(fichas));

    }

}
