package ups.edu.ec.prueba.business;

import java.util.List;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import ups.edu.ec.prueba.dao.UniversidadDAO;
import ups.edu.ec.prueba.model.Universidad;


@Stateless
public class GestionUniversidades{

	@Inject
	private UniversidadDAO daoUniversidad;
	
	public void actualizarUniversidad(Universidad Universidad) throws Exception {
		Universidad cli = daoUniversidad.read(Universidad.getId());
		if (cli != null){
			daoUniversidad.update(Universidad);
		}else {
			throw new Exception("Universidad no existe");
		}
	}
	
	public void guardarUniversidades(Universidad Universidad) {
		System.out.println("Codigo: " + Universidad.getId());
		Universidad cli = daoUniversidad.read(Universidad.getId());
		if (cli != null) {
			System.out.println("Este es: " + Universidad);
			daoUniversidad.update(Universidad);
		}else {
			daoUniversidad.insert(Universidad);
		}
	}
	
	public Universidad getUniversidadPorId(int codigo){
			return daoUniversidad.getUniversidadPorId(codigo);
	}
	
	public void borrarUniversidad(int codigo) {
		daoUniversidad.remove(codigo);
	}
	
	public List<Universidad> getUniversidades(){
		return daoUniversidad.getAll();
	}
	
}
