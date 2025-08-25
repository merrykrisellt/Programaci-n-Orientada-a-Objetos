package pe.edu.upeu.encapsulamiento;

import pe.edu.upeu.encapsulamiento.modelo.persona;

public class ClaseGeneral {
    public static void probar(){
        // metodo adseter y seleccionar atributos
        // -------set para colocar o mandar un nuevo valo
        //-------get es par aobtener el valor colocado
        //caso de encasulamiento
        Estudiante estudiante=new Estudiante();
        estudiante.setCodigo("juan peres");
        estudiante.setCarrera("ingenieria de sistemas");
        estudiante.tranajo();
    }
    public static void probarJugador(){
        jugador jugador=new jugador();
        jugador.setNombre("juancho");
        jugador.setApellidos("ali ali");
        jugador.setEdad(25);
        jugador.setPosicion("Delantero");
        jugador.setNumero(10);
        jugador.setGenero('M');
        System.out.println(jugador);

    }
   // @Override
    public static void main(String[] args) {
        //caso de encasulamiento
        persona persona=new persona();
        persona.setNombre("Juan");
        persona.setEdad(25);
        persona.setGenero('m');

        persona.saludo();
        probar();
        probarJugador();

    }


}
