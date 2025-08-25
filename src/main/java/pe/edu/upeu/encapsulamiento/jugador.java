package pe.edu.upeu.encapsulamiento;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//la depencia lombog va a crear el metodo get an seter
@Getter
@Setter
//@Data
public class jugador {
    private String nombre;
    private String apellidos;
    private int edad;
    private String posicion;
    private int numero;
    private char Genero;

    @Override
    public String toString(){
        return "jugador: " +
                "\n nombre=" + nombre +
                "\n apellidos=" + apellidos +
                "\n edad=" + edad +
                "\n posicion=" + posicion +
                "\n numero=" + numero +
                "\n Genero=" + Genero
                ;


    }

}
