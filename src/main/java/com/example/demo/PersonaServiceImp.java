package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Implementan todos los metodos del servicio
@Service
public class PersonaServiceImp implements PersonaService {
	
	@Autowired
	private PersonaRepositorio repositorio;
	
	@Override
	public List<Persona> getAllList() {
		return repositorio.findAll();
	}
	
	@Override
	public Persona add(Persona p) {
		return repositorio.save(p);	
	}
	
	@Override
	public Persona getById(Long id) {
      return repositorio.findById(id).get();
	}

	@Override
	public Persona edit(Persona p) {
		return repositorio.save(p);
	}

	@Override
	public Persona delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}


}
