package ups.edu.ec.prueba.business;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.inject.Inject;
import ups.edu.ec.prueba.dao.UniversidadDAO;
import ups.edu.ec.prueba.model.Universidad;


@Singleton
@Startup
public class GestionDatos {
	
	@Inject
	private UniversidadDAO daoUniversidad;
	
	@PostConstruct
	public void init() {
System.out.println("iniciando");
		
		Universidad universidad = new Universidad();
		universidad.setNombre("Universidad Politecnica Salesiana");
		universidad.setPais("Ecuador");
		universidad.setNumeroEstudiantes(10000);
		
		daoUniversidad.insert(universidad);
		
		Universidad universidad2 = new Universidad();
		universidad2.setNombre("Universidad Catolica");
		universidad2.setPais("Ecuador");
		universidad2.setNumeroEstudiantes(5000);
		
		daoUniversidad.insert(universidad2);
		
		System.out.println("\n------------- Universidades");
		List<Universidad> list = daoUniversidad.getAll();
		for (Universidad uni: list) {
			System.out.println(uni);
		}
		
	}
}
