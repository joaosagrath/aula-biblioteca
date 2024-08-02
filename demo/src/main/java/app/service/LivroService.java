package app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import entity.Livro;

@Service
public class LivroService {

	public String save (Livro livro) {
		return "Livro cadastrado com sucesso";
	}
	
	public String update (Livro livro, long id) {
		return "Atualizado com sucesso";
	}
	
	public Livro findById (long id) {
		
		List<Livro> listaTemp = this.findAll();
		
		for (int i = 0; i < listaTemp.size(); i++) {
			if(listaTemp.get(i).getId() == id) {
				return listaTemp.get(i);
			}
		}
		
		return null;
		
	}
	
	public List<Livro> findAll () {
		
		List<Livro> lista = new ArrayList<>();
		lista.add(new Livro(1,"Gol", "VW", "ok"));
		lista.add(new Livro(2,"Gol 2", "VW", "ok"));
		lista.add(new Livro(3,"Gol 3", "VW", "ok"));
		lista.add(new Livro(4,"Gol 4", "VW", "ok"));
		
		return lista;
	}
	
	public String delete (long id) {
		
		List<Livro> listaTemp = this.findAll();
		
		for (int i = 0; i < listaTemp.size(); i++) {
			if(listaTemp.get(i).getId() == id) {
				return "deletado com sucesso";
			}
		}
		return "Veículo não encontrado";
	}
	
}

