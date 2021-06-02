package com.produto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.produto.model.Produto;
import com.produto.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	
	@Autowired
	private ProdutoRepository repository;
	
	
	public List<Produto> lista(){
		return this.repository.findAll();
	}
	
	
	

}
