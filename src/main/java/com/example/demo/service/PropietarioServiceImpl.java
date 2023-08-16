package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IPropietarioRepo;
import com.example.demo.repository.modelo.Propietario;

import jakarta.transaction.Transactional;
@Service
@Transactional

public class PropietarioServiceImpl implements IPropietarioService{

	@Autowired
	private IPropietarioRepo iPropietarioRepo;
	
	@Override
	public void guardar(Propietario propietario) {
		this.iPropietarioRepo.insertar(propietario);
		
	}

	@Override
	public void actualizar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.iPropietarioRepo.actualizar(propietario);
		
	}

	@Override
	public void quitar(Integer id) {
		// TODO Auto-generated method stub
		this.iPropietarioRepo.eliminar(id);
		
	}

	@Override
	public Propietario buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iPropietarioRepo.buscar(id);
	}

	@Override
	public List<Propietario> buscarTodos() {
		// TODO Auto-generated method stub
		return this.iPropietarioRepo.buscarTodos();
	}

}
