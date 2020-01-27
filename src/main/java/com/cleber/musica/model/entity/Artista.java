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
@Table(name = "artista", schema = "musicadb")
public class Artista implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "artistaId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long artistaId;
	
	@Column(name = "nome_artista")
	private String nomeArtista; 
}
