package com.consultorio.registro.service;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//http://localhost:8080/agencia/service/ConsultaPersonaRest/consultarPersona
@Path("/ConsultaPersonaRest")
@Stateless
public class ConsultaPersonaRest {

	@GET
	@Path("/consultarPersona")
    @Produces(MediaType.APPLICATION_JSON)
	public String consultarPersona() {
		return "Hola mundo";
	}
}
