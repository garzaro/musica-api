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
@Table(name = "album", schema = "musicadb")

public class Album implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "albumId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long albumId;
	
	@Column(name = "titulo_album")
    private String tituloAlbum;
}
