package br.ufs.campusdosertao.forrageiras.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
public class Forrageira {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	@Length(min=2, max=128,message="O tamanho do nome deve ser entre {min} e {max} caracteres")
	private String nomeCientifico;
	@NotNull
	@Length(min=2, max=128,message="O tamanho do nome deve ser entre {min} e {max} caracteres")
	private String nomeComum;
	@NotNull
	@Length(min=2, max=64,message="O tamanho do nome deve ser entre {min} e {max} caracteres")
	private String genero;
	@NotNull
	@Length(min=2, max=64,message="O tamanho do nome deve ser entre {min} e {max} caracteres")
	private String origem;
	@NotNull
	private Integer exigenciaFertilidade;
	@NotNull
	private Integer precipiticaoMinima;
	@NotNull
	private Boolean toleranciaAlagamento;
	@NotNull
	private Integer toleranciaSeca;
	@NotNull
	private Integer toleranciaFrio;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNomeCientifico() {
		return nomeCientifico;
	}
	public void setNomeCientifico(String nomeCientifico) {
		this.nomeCientifico = nomeCientifico;
	}
	
	public String getNomeComum() {
		return nomeComum;
	}
	public void setNomeComum(String nomeComum) {
		this.nomeComum = nomeComum;
	}
	
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	
	public Integer getExigenciaFertilidade() {
		return exigenciaFertilidade;
	}
	public void setExigenciaFertilidade(Integer exigenciaFertilidade) {
		this.exigenciaFertilidade = exigenciaFertilidade;
	}
	
	public Integer getPrecipiticaoMinima() {
		return precipiticaoMinima;
	}
	public void setPrecipiticaoMinima(Integer precipiticaoMinima) {
		this.precipiticaoMinima = precipiticaoMinima;
	}
	
	public Boolean getToleranciaAlagamento() {
		return toleranciaAlagamento;
	}
	public void setToleranciaAlagamento(Boolean toleranciaAlagamento) {
		this.toleranciaAlagamento = toleranciaAlagamento;
	}
	
	public Integer getToleranciaSeca() {
		return toleranciaSeca;
	}
	public void setToleranciaSeca(Integer toleranciaSeca) {
		this.toleranciaSeca = toleranciaSeca;
	}
	
	public Integer getToleranciaFrio() {
		return toleranciaFrio;
	}
	public void setToleranciaFrio(Integer toleranciaFrio) {
		this.toleranciaFrio = toleranciaFrio;
	}
	
	public Forrageira() {
		
	}
	
	public Forrageira(Long id, String nomeCientifico, String nomeComum, String genero, String origem, Integer exigenciaFertilidade, Integer precipiticaoMinima, Boolean toleranciaAlagamento, Integer toleranciaSeca, Integer toleranciaFrio) {
		super();
		this.id = id;
		this.nomeCientifico = nomeCientifico;
		this.nomeComum = nomeComum;
		this.genero = genero;
		this.origem = origem;
		this.exigenciaFertilidade = exigenciaFertilidade;
		this.precipiticaoMinima = precipiticaoMinima;
		this.toleranciaAlagamento = toleranciaAlagamento;
		this.toleranciaSeca = toleranciaSeca;
		this.toleranciaFrio = toleranciaFrio;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Forrageira other = (Forrageira) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Forrageira [id=" + id + ", nomeCientifico=" + nomeCientifico + ", nomeComum=" + nomeComum + ", genero="
				+ genero + ", origem=" + origem + ", exigenciaFertilidade=" + exigenciaFertilidade
				+ ", precipiticaoMinima=" + precipiticaoMinima + ", toleranciaAlagamento=" + toleranciaAlagamento
				+ ", toleranciaSeca=" + toleranciaSeca + ", toleranciaFrio=" + toleranciaFrio + "]";
	}
		
}
