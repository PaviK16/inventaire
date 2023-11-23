package fr.hummaction.inventaire.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.hummaction.inventaire.entity.Aliment;

public interface AlimentRepository extends JpaRepository<Aliment, Integer>{

}
