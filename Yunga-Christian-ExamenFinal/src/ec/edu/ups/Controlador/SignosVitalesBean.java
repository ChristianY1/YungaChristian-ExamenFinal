package ec.edu.ups.Controlador;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import org.jboss.logging.annotations.Pos;

import ec.edu.ups.EJB.SignosVitalesFacade;
import ec.edu.ups.Modelo.SignosVitales;

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@SessionScoped
public class SignosVitalesBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EJB
	private SignosVitalesFacade ejbSignosVitalesFacade;
	private SignosVitales signosVitales;
	private List<SignosVitales> signosList;
	
	public SignosVitalesBean() {
	
	}
	
	@PostConstruct
	public void init() {
		signosList = ejbSignosVitalesFacade.findAll();
	}

	public List<SignosVitales> getSignosList() {
		return signosList;
	}

	public void setSignosList(List<SignosVitales> signosList) {
		this.signosList = signosList;
	}
	
	
	
	

}
