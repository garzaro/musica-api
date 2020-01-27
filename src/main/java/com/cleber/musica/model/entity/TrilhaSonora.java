package com.cleber.musica.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;

@Data
@Entity
@Table(name = "trilhaSonora",schema = "musicadb")
public class TrilhaSonora implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "trilhaSonoraId")
	private Long trilhaSonoraId;
	
	@Column(name = "nomeTrilhaSonora")
	private String  nomeTrilhaSonora;
	
	@Transient
	@Column(name = "milisegundos")
	private Long milisegundos; //tempo de duração
	
	@Transient
	@Column(name = "bytes")
	private Long Bytes; 

}
