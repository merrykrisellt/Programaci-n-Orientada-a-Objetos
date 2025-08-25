package pe.edu.upeu.realizacion;

public class Principal  {
    public static void main(String[] args) {
        // no se puede instanciar una clse interfase//
        Volador volar=new Avion();
        volar.volar();

        volar=new pajaro();
        volar.volar();
    }
}
