package app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.entity.Editora;
import app.repository.EditoraRepository;

@Service
public class EditoraService {
	
	@Autowired
	private EditoraRepository editoraRepository;
	

	public String save (Editora editora) {
		this.editoraRepository.save(editora);
		return "Editora cadastrado com sucesso";
	}
	
	public String update (Editora editora, long id) {
		editora.setId(id);
		this.editoraRepository.save(editora);
		return "Atualizado com sucesso";
	}
	
	public Editora findById (long id) {
		
		Optional<Editora> optional = this.editoraRepository.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}else
			return null;
		
	}
	
	public List<Editora> findAll () {
		
		return this.editoraRepository.findAll();
		
	}
	
	public String delete (long id) {
		this.editoraRepository.deleteById(id);
		return "Veículo deletado com sucesso!";
	}
	
}