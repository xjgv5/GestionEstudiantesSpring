package xjgv.estudiantes.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import xjgv.estudiantes.modelo.Estudiante;

public interface EstudianteRepositorio extends JpaRepository<Estudiante, Integer> {
}
