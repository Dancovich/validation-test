package br.gov.serpro.test.validation_test.domain;

import static javax.persistence.GenerationType.SEQUENCE;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import br.gov.frameworkdemoiselle.validation.annotation.Cep;
import br.gov.frameworkdemoiselle.validation.annotation.Cpf;

@Entity
public class Bookmark implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/*
	 *  If you are using Glassfish then remove the strategy attribute
	 */
	@Id
	@GeneratedValue(strategy = SEQUENCE)
	private Long id;
	
	@Column
	private String description;
	
	@Column
	private String link;
	
	@Cep
	private String cep;
	
	@Cpf
	private String cpf;
	
	public Bookmark() {
		super();
	}
	
	public Bookmark(String description, String link, String cep, String cpf) {
		super();
		this.description = description;
		this.link = link;
		this.cep = cep;
		this.cpf = cpf;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getLink() {
		return link;
	}
	
	public void setLink(String link) {
		this.link = link;
	}

	
	public String getCep() {
		return cep;
	}

	
	public void setCep(String cep) {
		this.cep = cep;
	}

	
	public String getCpf() {
		return cpf;
	}

	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
