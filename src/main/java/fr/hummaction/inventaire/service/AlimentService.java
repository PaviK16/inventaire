package fr.hummaction.inventaire.service;

import java.util.List;

import fr.hummaction.inventaire.entity.Aliment;

public interface AlimentService {
	
	List<Aliment> findAll();

	Aliment findById(int theId);

	void save(Aliment theAliment);

	void deleteById(int theId);

}
