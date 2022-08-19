package com.idat.service;

import java.util.List;


import com.idat.model.Cliente;

public interface ClienteService {
	
	public List<Cliente> listarClientes();
	public Cliente obtenerClientes();
	public void guardarClientes(Cliente cliente);
	public void actualizarClientes(Cliente cliente);
	public void eliminarClientes();

}
