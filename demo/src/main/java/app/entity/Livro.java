package app.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Livro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String titulo;
	private String ano_publicacao;
	private String autor;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JsonIgnoreProperties("livros")
	private Editora editora;
	
	public Livro() {
		
	}
	
	public Livro(long id, String titulo, String ano_publicacao, String autor) {

		this.id = id;
		this.titulo = titulo;
		this.ano_publicacao = ano_publicacao;
		this.autor = autor;
	}
	
	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAno_publicacao() {
		return ano_publicacao;
	}
	public void setAno_publicacao(String ano_publicacao) {
		this.ano_publicacao = ano_publicacao;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
}
