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
@Table(name = "banda", schema = "musicadb")
public class Banda implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idbanda")
	private Long idbanda;
	
	@Column(name = "nome_banda")
	private String nomeBanda;
	
	@Column(name = "pais_banda")
	private String paisBanda;
	
	@Column(name = "cidade_banda")
	private String cidadeBanda;
	
	

}
