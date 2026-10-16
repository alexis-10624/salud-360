package domain;
public class CitaMedica {
    private String idCita;
    private String idPaciente;
    private String especialidad;
    private String sede;
    private String fechaHora;
    private String estado;

    public CitaMedica(String idCita, String idPaciente, String especialidad, String sede, String fechaHora) {
        this.idCita = idCita;
        this.idPaciente = idPaciente;
        this.especialidad = especialidad;
        this.sede = sede;
        this.fechaHora = fechaHora;
        this.estado = "PROGRAMADA";
    }

    public String getIdCita() { return idCita; }
    public String getIdPaciente() { return idPaciente; }
    public String getEspecialidad() { return especialidad; }
    public String getSede() { return sede; }
    public String getFechaHora() { return fechaHora; }
    public String getEstado() { return estado; }

    public void setEstado(String estado) { this.estado = estado; }
}
