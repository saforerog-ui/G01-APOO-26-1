package com.example.tutoria03.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.tutoria03.models.Docente;

@Repository
public interface IDocenteRepository extends CrudRepository<Docente, Integer> {
    boolean existsByTipoDocumentoAndNumeroDocumento(String tipoDocumento, String numeroDocumento);
    Optional<Docente> findByTipoDocumentoAndNumeroDocumento(String tipoDocumento, String numeroDocumento);
}
