package modelos;

public class Administrador extends Persona {

    public Administrador(String nombre, String correo) {

        super(nombre, correo);
    }

    @Override
    public void mostrarDatos() {

        System.out.println("Administrador: " + nombre);
    }
}