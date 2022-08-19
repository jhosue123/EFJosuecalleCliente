package com.idat.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.idat.model.Cliente;
import com.idat.repository.ClienteRepository;

@Service
public class ClienteServiceImpl  implements  ClienteService{

	
	
	@Autowired
	private ClienteRepository repository;
	
	
	@Override
	public List<Cliente> listarClientes() {
		return repository.findAll();
	}

	@Override
	public Cliente obtenerClientes() {

		return null;
	}

	@Override
	public void guardarClientes(Cliente cliente) {
		repository.save(cliente);
	}

	@Override
	public void actualizarClientes(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarClientes() {
		// TODO Auto-generated method stub
		
	}

}
