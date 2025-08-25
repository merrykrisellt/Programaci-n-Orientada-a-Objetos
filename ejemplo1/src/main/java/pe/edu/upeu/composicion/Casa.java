package pe.edu.upeu.composicion;

public class Casa {
    private  Habitacion habitacion;
    Casa(){
        //referenciar algun parametro al crear para especificar
        habitacion=new Habitacion();// la habitacion se crea con la casa

    }
    public static void main (String[] args) {
        Casa casa=new Casa();
        System.out.println("habitacion de"+casa.habitacion.tamanho+"m2");
    }
}
