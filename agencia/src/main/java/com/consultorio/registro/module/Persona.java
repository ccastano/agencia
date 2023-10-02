package com.consultorio.registro.module;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


/**
 * The persistent class for the TPER_PERSONA database table.
 * 
 * @author
 */
@Entity
@Table(name = "PERSONA")
public class Persona  implements Serializable  {

	/**
	 * Atributo de seralización
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo que determina el Id de la tabla
	 */
	@Id
	@SequenceGenerator(allocationSize = 1, name = "T implements Serializable _PERSONA_ID_GENERATOR", sequenceName = "SEC_PERSONA")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TPER_PERSONA_ID_GENERATOR")
	@Column(name = "PERID")
	private Long idPersona;

	/**
	 * Atributo que determina el número de identificación
	 */
	@Column(name = "PERCDNUMEROIDENTIFICACION")
	private String numeroIdentificacion;
	
	/**
	 * Atributo que determina el primer nombre
	 */
	@Column(name = "PERDSPRIMERNOMBRE")
	private String primerNombre;

	/**
	 * Atributo que determina el segundo nombre
	 */
	@Column(name = "PERDSSEGUNDONOMBRE")
	private String segundoNombre;

	/**
	 * Atributo que determina el primer apellido
	 */
	@Column(name = "PERDSPRIMERAPELLIDO")
	private String primerApellido;

	/**
	 * Atributo que determina el segundo apellido
	 */
	@Column(name = "PERDSSEGUNDOAPELLIDO")
	private String segundoApellido;
	
	/**
	 * Atributo que determina el tipo de persona
	 */
	@Enumerated(value = EnumType.STRING)
	@Column(name = "PERDSTIPOPERSONA")
	private TipoPersonaEnum tipoPersonaEnum;

	public Long getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}

	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public TipoPersonaEnum getTipoPersonaEnum() {
		return tipoPersonaEnum;
	}

	public void setTipoPersonaEnum(TipoPersonaEnum tipoPersonaEnum) {
		this.tipoPersonaEnum = tipoPersonaEnum;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idPersona, numeroIdentificacion, primerApellido, primerNombre, segundoApellido,
				segundoNombre, tipoPersonaEnum);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(idPersona, other.idPersona)
				&& Objects.equals(numeroIdentificacion, other.numeroIdentificacion)
				&& Objects.equals(primerApellido, other.primerApellido)
				&& Objects.equals(primerNombre, other.primerNombre)
				&& Objects.equals(segundoApellido, other.segundoApellido)
				&& Objects.equals(segundoNombre, other.segundoNombre) && tipoPersonaEnum == other.tipoPersonaEnum;
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", numeroIdentificacion=" + numeroIdentificacion + ", primerNombre="
				+ primerNombre + ", segundoNombre=" + segundoNombre + ", primerApellido=" + primerApellido
				+ ", segundoApellido=" + segundoApellido + ", tipoPersonaEnum=" + tipoPersonaEnum + "]";
	}
	
	
}
