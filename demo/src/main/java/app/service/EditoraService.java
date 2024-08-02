package app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import entity.Editora;

@Service
public class EditoraService {

	public String save (Editora editora) {
		return "Editora cadastrado com sucesso";
	}
	
	public String update (Editora editora, long id) {
		return "Atualizado com sucesso";
	}
	
	public Editora findById (long id) {
		
		List<Editora> listaTemp = this.findAll();
		
		for (int i = 0; i < listaTemp.size(); i++) {
			if(listaTemp.get(i).getId() == id) {
				return listaTemp.get(i);
			}
		}
		
		return null;
		
	}
	
	public List<Editora> findAll () {
		
		List<Editora> lista = new ArrayList<>();
		lista.add(new Editora(1,"Gol", "OK"));
		lista.add(new Editora(2,"Gol 2","OK"));
		lista.add(new Editora(3,"Gol 3","OK"));
		lista.add(new Editora(4,"Gol 4","OK"));
		
		return lista;
	}
	
	public String delete (long id) {
		
		List<Editora> listaTemp = this.findAll();
		
		for (int i = 0; i < listaTemp.size(); i++) {
			if(listaTemp.get(i).getId() == id) {
				return "deletado com sucesso";
			}
		}
		return "Veículo não encontrado";
	}
	
}

