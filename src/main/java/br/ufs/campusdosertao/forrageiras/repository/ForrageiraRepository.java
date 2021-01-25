package br.ufs.campusdosertao.forrageiras.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufs.campusdosertao.forrageiras.entity.Forrageira;

public interface ForrageiraRepository extends JpaRepository<Forrageira, Long> {
}
