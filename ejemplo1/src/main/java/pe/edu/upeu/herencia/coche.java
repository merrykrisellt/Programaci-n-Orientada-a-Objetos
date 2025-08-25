package pe.edu.upeu.herencia;

public class coche extends  Vehiculo {
    void abrirPuertas (){
        System.out.println("eabriendo puertas del coche");

    }
    public static void main(String[] args) {
        coche coche = new coche();
        coche.abrirPuertas();
        coche.mover();
    }
}
