package ec.edu.ups.Modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: CitaMedica
 *
 */
@Entity

public class CitaMedica implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String fecha;
	private String hora;
	private String sintomas;
	private String alergias;
	private String EnfermedadesPrevias;
	@ManyToOne
	@JoinColumn
	private Paciente paciente;
	@OneToOne
	@JoinColumn
	private SignosVitales signos;
	
	
	
	
	public CitaMedica() {
		
	}



	public CitaMedica(String fecha, String hora, String sintomas, String alergias, String enfermedadesPrevias) {
		super();
		this.fecha = fecha;
		this.hora = hora;
		this.sintomas = sintomas;
		this.alergias = alergias;
		EnfermedadesPrevias = enfermedadesPrevias;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getFecha() {
		return fecha;
	}



	public void setFecha(String fecha) {
		this.fecha = fecha;
	}



	public String getHora() {
		return hora;
	}



	public void setHora(String hora) {
		this.hora = hora;
	}



	public String getSintomas() {
		return sintomas;
	}



	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}



	public String getAlergias() {
		return alergias;
	}



	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}



	public String getEnfermedadesPrevias() {
		return EnfermedadesPrevias;
	}



	public void setEnfermedadesPrevias(String enfermedadesPrevias) {
		EnfermedadesPrevias = enfermedadesPrevias;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CitaMedica other = (CitaMedica) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
	
	
	

}