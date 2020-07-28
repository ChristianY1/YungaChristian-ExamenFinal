package ec.edu.ups.EJB;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.Modelo.CitaMedica;

@Stateless
public class CitaFacade extends AbstractFacade<CitaMedica>{
	@PersistenceContext(unitName = "Examen")
	private EntityManager em;
	
	public CitaFacade() {
		super(CitaMedica.class);
	}
	
	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}
