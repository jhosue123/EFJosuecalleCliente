package com.idat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.model.Cliente;
import com.idat.service.ClienteService;

@Controller
@RequestMapping("/api/v1/cliente")
public class ClienteController {

	
	@Autowired
	private ClienteService service;
	
	@GetMapping("/hola")
	public @ResponseBody String holamundo() {
		return "Hola mundo";
	}
	
	@GetMapping("/listar")
	public @ResponseBody List<Cliente> listarClientes(){
		return service.listarClientes();
	}
	
	@GetMapping("/listar/{id}")
	public @ResponseBody Cliente obtenerCliente(@PathVariable Integer id){
		return null;
	}
	
	@PostMapping("/guardar")
	public @ResponseBody void guardarCliente(@RequestBody Cliente cliente) {
		service.guardarClientes(cliente);
	}
	
	@PutMapping("/actualizar")
	public void actualizarCliente(@RequestBody Cliente cliente) {
		
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminarCliente(@PathVariable Integer id) {
		
	}
}
