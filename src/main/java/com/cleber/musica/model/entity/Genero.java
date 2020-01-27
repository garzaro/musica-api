package com.cleber.musica.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "genero", schema = "musicadb")
public class Genero implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long generoId;
	
	@Column(name = "nome_genero")
	private String nomeGenero;
	
	@Column(name = "nome_Sub_Genero")
	private String nomeSubGenero;
	    
}
