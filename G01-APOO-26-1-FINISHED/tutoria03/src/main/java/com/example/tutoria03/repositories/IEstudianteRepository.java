package com.example.tutoria03.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.tutoria03.models.Estudiante;

@Repository
public interface IEstudianteRepository extends CrudRepository<Estudiante,Integer> {
    // Interfaz de acceso a datos para la entidad Estudiante.
    // Hereda operaciones CRUD básicas de CrudRepository:
    // - findById, findAll, save, deleteById, etc.
    // Aquí se pueden declarar consultas personalizadas si son necesarias.
}
