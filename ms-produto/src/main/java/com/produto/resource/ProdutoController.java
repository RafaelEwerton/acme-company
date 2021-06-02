package com.produto.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.produto.model.Produto;
import com.produto.service.ProdutoService;

@RestController
@RequestMapping("v1/api/produtos")
public class ProdutoController {
	
	
	@Autowired
	private ProdutoService service;
	
	@GetMapping
	public ResponseEntity<List<Produto>>lista(){
		return ResponseEntity.ok(this.service.lista());
	}
	
	
	
	
	
	

	
	
	
	
}
