package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.example.demo.ValidationGroups;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
@Entity
//@Table(name= "")
public class Cliente {
	
	@EqualsAndHashCode.Include
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//@Column(name = "nome")
	@NotBlank
	@Size(max = 60)
	private String nome;
	
	@NotBlank
	@Email
	private String email;
	
	@NotBlank
	private String telefone;
	
	
//SEM LOMBOOK
	
//	@Override
//	public int hashCode() {
//		return Objects.hash(id);
//	}
//	
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Cliente other = (Cliente) obj;
//		return Objects.equals(id, other.id);
//	}
//	public Long getId() {
//		return id;
//	}
//	
//	public void setId(Long id) {
//		this.id = id;
//	}
//	
//	public String getNome() {
//		return nome;
//	}
//	
//	public void setNome(String nome) {
//		this.nome = nome;
//	}
//	
//	public String getEmail() {
//		return email;
//	}
//	
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	
//	public String getTelefone() {
//		return telefone;
//	}
//	
//	public void setTelefone(String telefone) {
//		this.telefone = telefone;
//	}
}
