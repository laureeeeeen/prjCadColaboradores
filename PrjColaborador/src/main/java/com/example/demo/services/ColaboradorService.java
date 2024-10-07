package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Colaborador;
import com.example.demo.entities.Fornecedor;
import com.example.demo.entities.Products;
import com.example.demo.repositories.ColaboradorRepository;
import com.example.demo.repositories.FornecedorRepository;

@Service
public class ColaboradorService {

	private final ColaboradorRepository colaboradorrepository;
	
	@Autowired
	public ColaboradorService(ColaboradorRepository colaboradorrepository) {
		this.colaboradorrepository = colaboradorrepository;
	}
	
	//criacao de produto
	public Colaborador saveColaborador(Colaborador colaborador) {
		return colaboradorrepository.save(colaborador);
	}
	
	//buscar produto
	public Colaborador getColaboradorById(Long id) {
		return colaboradorrepository.findById(id).orElse(null);
	}
	
	//buscar todos os produtos
	public List<Colaborador> getAllColaborador() {
		return colaboradorrepository.findAll();
	}
	
	//excluir produtos
	public void deleteColaborador(Long id) {
		colaboradorrepository.deleteById(id);
	}
	
}

