package pe.edu.upeu.asistencia.control;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.springframework.stereotype.Controller;

//anotaciones o decoradores
@Controller
public class AsistenciaController {
    @FXML private TextField txtnum1;
    @FXML private TextField txtnum2;
    //@FXML private Button btnSumar;
    @FXML private Label result;
    @FXML
    protected void sumar() {
        double num1 = Double.parseDouble(txtnum1.getText());
        double num2 = Double.parseDouble(txtnum2.getText());
        double resultado = num1 + num2;
        result.setText(String.valueOf(resultado));
    }



}
