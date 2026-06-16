package com.example.tutoria03.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tutoria03.models.Docente;
import com.example.tutoria03.services.DocenteService;

@RestController
@RequestMapping("/docentes")
public class DocenteController {

    @Autowired
    private DocenteService docenteService;

    @GetMapping
    public ResponseEntity<ArrayList<Docente>> getAll() {
        return ResponseEntity.ok(docenteService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Docente> getById(@PathVariable("id") int id) {
        Docente docente = docenteService.getById(id);
        return docente != null ? ResponseEntity.ok(docente) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Docente> create(@RequestBody Docente docente) {
        Docente created = docenteService.create(docente);
        if (created == null) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping
    public ResponseEntity<Docente> update(@RequestBody Docente docente) {
        Docente updated = docenteService.update(docente);
        return updated != null ? ResponseEntity.ok(updated) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int id) {
        return docenteService.delete(id) ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
    }
}
