package com.farmacia.Farmacia10.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmacia.Farmacia10.model.CategoriaModel;

public interface CategoriaRepositoy extends JpaRepository<CategoriaModel, Long>{
	public List<CategoriaModel> findAllByDescriçãoContainingIgnoreCase (String descrição);
	


}
