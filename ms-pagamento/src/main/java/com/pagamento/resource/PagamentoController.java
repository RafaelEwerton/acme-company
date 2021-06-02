package com.pagamento.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pagamento.model.Pagamento;
import com.pagamento.service.PagamentoService;

@RestController
@RequestMapping("/v1/api/pagamentos")
public class PagamentoController {
	
	
	@Autowired
	private PagamentoService service;
	
	@GetMapping
	public ResponseEntity<List<Pagamento>> lista(){
		return ResponseEntity.ok(this.service.lista());
	}
	
	

}
