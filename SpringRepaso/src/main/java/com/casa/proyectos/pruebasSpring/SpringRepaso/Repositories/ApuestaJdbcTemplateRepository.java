package com.casa.proyectos.pruebasSpring.SpringRepaso.Repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.casa.proyectos.pruebasSpring.SpringRepaso.Controller.CrudAble;
import com.casa.proyectos.pruebasSpring.SpringRepaso.Modelo.Apuesta;

@Repository
public class ApuestaJdbcTemplateRepository implements CrudAble<Apuesta> {

	@Autowired
	private JdbcTemplate jdbc;
	
	
	@Override
	public List<Apuesta> getAll() {
		return jdbc.query("SELECT a.id, a.cuota, a.descripcion, a.acertada,m.nombre from apuesta a\\r\\n\" + \r\n" + 
				"				\"inner join mercado m on m.id = a.mercado_id",)
	}

	@Override
	public void insert(Apuesta objeto) {
		
		
	}

	@Override
	public void delete(long id) {
		
		
	}

}
