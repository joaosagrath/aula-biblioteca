package app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import entity.Biblioteca;

@Service
public class BibliotecaService {

	public String save (Biblioteca biblioteca) {
		return "Carro cadastrado com sucesso";
	}
	
	public String update (Biblioteca biblioteca, long id) {
		return "Atualizado com sucesso";
	}
	
	public Biblioteca findById (long id) {
		
		List<Biblioteca> listaTemp = this.findAll();
		
		for (int i = 0; i < listaTemp.size(); i++) {
			if(listaTemp.get(i).getId() == id) {
				return listaTemp.get(i);
			}
		}
		
		return null;
		
	}
	
	public List<Biblioteca> findAll () {
		
		List<Biblioteca> lista = new ArrayList<>();
		lista.add(new Biblioteca(1,"Gol", "VW"));
		lista.add(new Biblioteca(2,"Gol 2", "VW"));
		lista.add(new Biblioteca(3,"Gol 3", "VW"));
		lista.add(new Biblioteca(4,"Gol 4", "VW"));
		
		return lista;
	}
	
	public String delete (long id) {
		
		List<Biblioteca> listaTemp = this.findAll();
		
		for (int i = 0; i < listaTemp.size(); i++) {
			if(listaTemp.get(i).getId() == id) {
				return "deletado com sucesso";
			}
		}
		return "Veículo não encontrado";
	}
	
}

