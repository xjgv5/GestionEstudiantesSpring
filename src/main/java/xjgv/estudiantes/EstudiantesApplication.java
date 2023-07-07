package xjgv.estudiantes;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import xjgv.estudiantes.servicio.EstudianteServicio;

@SpringBootApplication
public class EstudiantesApplication  implements CommandLineRunner {

	@Autowired
	private EstudianteServicio estudianteServicio;

	private static final Logger logger =
			LoggerFactory.getLogger(EstudiantesApplication.class);

	String nl = System.lineSeparator();
	public static void main(String[] args) {
		logger.info("Iniciando la aplicacion...");
		SpringApplication.run(EstudiantesApplication.class, args);
		logger.info("Aplicacion finalizada !");
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Ejecutanto metodo run de spring");
	}
}
