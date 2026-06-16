package com.example.tutoria03.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tutoria03.models.Docente;
import com.example.tutoria03.repositories.IDocenteRepository;

@Service
public class DocenteService {

    @Autowired
    private IDocenteRepository docenteRepository;

    public ArrayList<Docente> getAll() {
        return (ArrayList<Docente>) docenteRepository.findAll();
    }

    public Docente getById(int id) {
        return docenteRepository.findById(id).orElse(null);
    }

    public Docente create(Docente docente) {
        if (docenteRepository.existsByTipoDocumentoAndNumeroDocumento(docente.getTipoDocumento(), docente.getNumeroDocumento())) {
            return null;
        }
        return docenteRepository.save(docente);
    }

    public Docente update(Docente docente) {
        if (!docenteRepository.existsById(docente.getId())) {
            return null;
        }
        return docenteRepository.save(docente);
    }

    public boolean delete(int id) {
        if (!docenteRepository.existsById(id)) {
            return false;
        }
        docenteRepository.deleteById(id);
        return true;
    }
}
