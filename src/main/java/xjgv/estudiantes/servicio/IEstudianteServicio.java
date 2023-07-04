package xjgv.estudiantes.servicio;

import xjgv.estudiantes.modelo.Estudiante;

import java.util.List;

public interface IEstudianteServicio {
    public List<Estudiante> listarEstudiante();
    public Estudiante buscarEstudiantePorID(Integer idEstudiante);
    public void guardarEstudiante(Estudiante estudiante);
    public void eliminarEstudiante(Estudiante estudiante);
}
