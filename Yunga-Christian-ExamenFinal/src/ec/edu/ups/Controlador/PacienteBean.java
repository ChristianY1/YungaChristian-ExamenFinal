package ec.edu.ups.Controlador;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.edu.ups.EJB.PacienteFacade;
import ec.edu.ups.Modelo.Paciente;

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@SessionScoped
public class PacienteBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EJB
	private PacienteFacade ejbPacienteFacade;
	private Paciente paciente;
	private List<Paciente> pacienteList;
	
	public PacienteBean() {
		
		
	}
	
	@PostConstruct
	public void init() {
		paciente = new Paciente();
		this.pacienteList = ejbPacienteFacade.findAll();
		
	}
	
	
	
	public List<Paciente> getPacienteList() {
		return pacienteList;
	}

	public void setPacienteList(List<Paciente> pacienteList) {
		this.pacienteList = pacienteList;
	}

	public String add() {
		ejbPacienteFacade.create(new Paciente());
		pacienteList = ejbPacienteFacade.findAll();
		return null;
	}
	
	
	
	

}
