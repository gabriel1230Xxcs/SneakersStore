package modelos;

public class Persona {

    protected String nombre;
    protected String correo;

    public Persona(String nombre, String correo) {

        this.nombre = nombre;

        this.correo = correo;
    }

    public void mostrarDatos() {

        System.out.println("Nombre: " + nombre);

        System.out.println("Correo: " + correo);
    }
}