package ec.edu.ups.EJB;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.Modelo.SignosVitales;

public class SignosVitalesFacade extends AbstractFacade<SignosVitalesFacade>{




	@PersistenceContext(unitName = "Examen")
	private EntityManager em;
	
	
	public SignosVitalesFacade(Class<SignosVitalesFacade> entityClass) {
		super(entityClass);
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	protected EntityManager getEntityManager() {
		return em;
	}
	
	
}
