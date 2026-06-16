package com.example.tutoria03.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tutoria03.models.Estudiante;
import com.example.tutoria03.services.EstudianteService;



@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {
    
    @Autowired
    private EstudianteService estudianteService;
    
    @GetMapping
    public ResponseEntity<ArrayList<Estudiante>> getAll(){
        return ResponseEntity.ok(estudianteService.GetAll());
    }
    /**
     * Devuelve la lista completa de estudiantes.
     * @return ResponseEntity con ArrayList de Estudiante y estado 200.
     */
    @GetMapping("/{id}")
    public ResponseEntity<Estudiante> getStudentById(@PathVariable("id") int id) {
        return ResponseEntity.ok(estudianteService.GetStudentById(id));
    }

    /**
     * Devuelve un estudiante por su id.
     * @param id Identificador del estudiante
     * @return ResponseEntity con el estudiante o 200 con null si no existe
     */

    @PostMapping
    public ResponseEntity<Estudiante> save(@RequestBody Estudiante estudiante){
        return ResponseEntity.ok(estudianteService.save(estudiante) );
    }

    /**
     * Crea un nuevo estudiante si no existe el id.
     * @param estudiante Entidad a crear
     * @return ResponseEntity con el estudiante creado o null si ya existe
     */

    @PutMapping
    public ResponseEntity<Estudiante> update(@RequestBody Estudiante estudiante){
        return ResponseEntity.ok(estudianteService.update(estudiante) );
    }

    /**
     * Actualiza un estudiante existente.
     * @param estudiante Entidad con los datos actualizados
     * @return ResponseEntity con el estudiante actualizado o null si no existe
     */

    /**
     * Elimina un estudiante por su id.
     * @param id Identificador del estudiante a eliminar
     * @return ResponseEntity 200 si se eliminó, 404 si no existía
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int id){
        boolean deleted = estudianteService.Delete(id);
        if (deleted) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
