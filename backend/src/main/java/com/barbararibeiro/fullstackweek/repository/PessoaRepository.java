package com.barbararibeiro.fullstackweek.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barbararibeiro.fullstackweek.domain.Pessoa;


public interface PessoaRepository extends JpaRepository <Pessoa, Long> {

} 
