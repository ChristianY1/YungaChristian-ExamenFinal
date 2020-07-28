package ec.edu.ups.Controlador;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.edu.ups.EJB.CitaFacade;
import ec.edu.ups.Modelo.CitaMedica;

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@SessionScoped

public class CitaBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EJB
	private CitaFacade ejbCitaFacade;
	private CitaMedica citaMedica;
	private List<CitaMedica> citaList;
	
	
	
	
	public CitaBean() {
		
	}




	@PostConstruct
	public void init() {
		citaMedica = new CitaMedica();
		this.citaList = ejbCitaFacade.findAll();
	}
	
	
	public List<CitaMedica> getCitaList() {
		return citaList;
	}




	public void setCitaList(List<CitaMedica> citaList) {
		this.citaList = citaList;
	}




	public String add() {
		ejbCitaFacade.create(new CitaMedica());
		citaList = ejbCitaFacade.findAll();
		return null;
	}
	
	

}
