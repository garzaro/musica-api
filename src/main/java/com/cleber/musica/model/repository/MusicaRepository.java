package com.cleber.musica.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cleber.musica.model.entity.Album;

public interface MusicaRepository extends JpaRepository<Album, Long>{
	
	

}
