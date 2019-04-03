package com.casa.proyectos.pruebasSpring.SpringRepaso.Controller;

import java.util.List;

public interface CrudAble <T>{
	
	List<T> getAll();
	
	void insert (T objeto);
	void delete (long id);
}
