package com.ig.cursomc.services;

import com.ig.cursomc.domain.Cliente;
import com.ig.cursomc.repositories.ClienteRepository;
import com.ig.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;

	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
		}

//	public Cliente buscar(Integer id) {
//		Cliente obj = repo.findOne(id);
//		if (obj == null) {
//			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id
//					+ ", Tipo: " + Cliente.class.getName());
//		}
//		return obj;
//	}

}
