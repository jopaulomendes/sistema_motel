package br.com.financeiro.domain;

import javax.persistence.Column;
import javax.persistence.Entity;


@Entity
public class Fornecedor extends GenericDomain {
	
	@Column(length = 50, nullable = false)
	private String descricao;	

	@Column(length = 15, nullable = false)
	private String celular;
	
	@Column(length = 14, nullable = false)
	private String telefone;
	
	@Column(length = 50, nullable = false)
	private String email;
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}	
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
}