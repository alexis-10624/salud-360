package domain;

public class Paciente {
    private String id;
    private String nombre;
    private String correo;
    private String telefono;
    private String contrasena;
    private boolean afiliacionActiva;

    public Paciente(String id, String nombre, String correo, String telefono, String contrasena) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.contrasena = contrasena;
        this.afiliacionActiva = true;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getCorreo() { return correo; }
    public String getTelefono() { return telefono; }
    public String getContrasena() { return contrasena; }
    public boolean isAfiliacionActiva() { return afiliacionActiva; }
}

