package pe.edu.upeu.encapsulamiento;

public class Estudiante {
    String codigo;
    String carrera;
    public void tranajo (){
        System.out.println("Estudiar, investigar en la carrera de: "+carrera);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
