package ec.edu.ups.EJB;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.Modelo.Paciente;

@Stateless
public class PacienteFacade extends AbstractFacade<Paciente>  {
	

	@PersistenceContext(unitName = "Examen")
	private EntityManager em;
	
	public PacienteFacade() {
		super(Paciente.class);
	}
	
	@Override
	protected EntityManager getEntityManager() {
		return em;
	}
	
	

}
