package ups.edu.ec.prueba.dao;

import java.util.List;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import ups.edu.ec.prueba.model.Universidad;

@Stateless
public class UniversidadDAO {
	
	@PersistenceContext
	private EntityManager em;

	public void insert(Universidad universidad) {
		em.persist(universidad);
	}
		
	public void update(Universidad universidad) {
		em.merge(universidad);	
	}

	public void remove(int codigo) {
		Universidad Universidad = em.find(Universidad.class, codigo);
		em.remove(Universidad);
	}
	
	public Universidad read(int codigo) {
		Universidad Universidad = em.find(Universidad.class, codigo);
		return Universidad;
	}
	
	public List<Universidad> getAll(){
		String jpql = "SELECT c FROM Universidad c";
		Query q = em.createQuery(jpql, Universidad.class);
		return q.getResultList();
	}
	
	
	public Universidad getUniversidadPorId(int id) {
		String jpql = "SELECT c FROM Universidad c WHERE c.id = :id";
		Query q = em.createQuery(jpql, Universidad.class);
		q.setParameter("id", id);
		List<Universidad> Universidads = q.getResultList();
		if (Universidads.size() > 0)
			return Universidads.get(0);
		return null;
		}
}
