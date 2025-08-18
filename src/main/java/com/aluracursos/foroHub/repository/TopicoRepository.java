package com.aluracursos.foroHub.repository;

import com.aluracursos.foroHub.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicoRepository extends JpaRepository<Topico, Long> {
    // Aquí agregar métodos (búsquedas por curso, autor, etc...)
}
