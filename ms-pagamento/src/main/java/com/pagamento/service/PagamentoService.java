package com.pagamento.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pagamento.model.Pagamento;
import com.pagamento.repository.PagamentoRepository;
import java.util.List;



@Service
public class PagamentoService {
	
	@Autowired
	private PagamentoRepository repository;
	
	
	public List<Pagamento> lista (){
		return this.repository.findAll();
	}
	
	


}
