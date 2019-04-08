package com.casa.proyectos.pruebasSpring.SpringRepaso.Repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.casa.proyectos.pruebasSpring.SpringRepaso.Controller.CrudAble;
import com.casa.proyectos.pruebasSpring.SpringRepaso.Modelo.Apuesta;
import com.casa.proyectos.pruebasSpring.SpringRepaso.Modelo.Mercado;

@Repository
public class ApuestaJdbcTemplateRepository implements CrudAble<Apuesta> {

	@Autowired
	private JdbcTemplate jdbc;
	
	
	@Override
	public List<Apuesta> getAll() {
		String sql="SELECT a.id, a.cuota, a.descripcion, a.acertada,m.nombre from apuesta a\\\\r\\\\n\\\" + \\r\\n\" + \r\n" + 
				"				\"				\\\"inner join mercado m on m.id = a.mercado_id";
		return jdbc.query(sql, new ApuestaMapper());
	}

	@Override
	public void insert(Apuesta apu) {
		String sql = "INSERT INTO apuesta (cuota,descripcion,mercado_id) VALUES (?,?,?)";
		jdbc.update(sql, new Object[] {apu.getCuota(), apu.getDescripcion(),apu.getId_mercado()});
			
	}

	@Override
	public void delete(long id) {
		String sql= "Delete from apuesta where id=?";	
		jdbc.update(sql, new Object[] {id});
		
	}

	
	private static final class ApuestaMapper implements RowMapper<Apuesta>{
		public Apuesta mapRow(ResultSet rs, int rowNum) throws SQLException {
			Mercado me;
			me = new Mercado(rs.getString("nombre"));
			return new Apuesta (rs.getLong("id"), rs.getDouble("cuota"),rs.getString("descripcion"),rs.getBoolean("acertada"),me);
		}
	}
}
