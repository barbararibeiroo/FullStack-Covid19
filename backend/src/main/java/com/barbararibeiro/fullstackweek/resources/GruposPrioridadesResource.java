package com.barbararibeiro.fullstackweek.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.barbararibeiro.fullstackweek.domain.GruposPrioridades;
import com.barbararibeiro.fullstackweek.repository.GruposPrioridadesRepository;

@RestController
@RequestMapping("/gruposprioridades")
public class GruposPrioridadesResource {

	@Autowired
	private GruposPrioridadesRepository gruposPrioridadesRepository;
	
	@GetMapping
	public List<GruposPrioridades> listarTodos(){
		return gruposPrioridadesRepository.findAll();
	}
}
