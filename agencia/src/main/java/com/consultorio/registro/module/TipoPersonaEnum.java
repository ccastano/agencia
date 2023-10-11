package com.consultorio.registro.module;

public enum TipoPersonaEnum {

	/**
	 * Indicador que representa tipo persona "JURIDICA"
	 */
	JURIDICA("enum.tipopersona.juridica"),
	/**
	 * Indicador que representa tipo persona "NATURAL"
	 */
	NATURAL("enum.tipopersona.natural");
	
	/**
	 * Atributo que contiene la clave del mensaje para la internacionalizacion  
	 */
	private String codigoMensaje;

	/**
	 * Constructor que recibe como parametro el codigo del mensaje
	 * 
	 * @param codigoMensaje, Clave del mensaje para para internacionalizacion
	 */
	TipoPersonaEnum(String codigoMensaje) {		
		this.codigoMensaje = codigoMensaje;
	}

	/**
	 * Metodo que retorna el valor del atributo
	 * 
	 * @return cadena con el codigo del mensaje
	 */
	public String getCodigoMensaje() {
		return codigoMensaje;
	}

	/***
	 *
	 * Metodo encargado de retornar el enum segun su nombre
	 * @param nombre
	 * @return
	 */
	public static TipoPersonaEnum getEnumValue(String nombre) {
		if (nombre != null) {
			for (TipoPersonaEnum tipoPersonaEnum : TipoPersonaEnum.values()) {
				if (nombre.equalsIgnoreCase(tipoPersonaEnum.name())) {
					return tipoPersonaEnum;
				}
			}
		}
		return null;
	}

}
