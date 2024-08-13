/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.curso.controller;

import br.com.ifba.curso.entity.Curso;
import java.util.List;

/**
 *
 * @author Gabriel
 */
public interface CursoIController {
        
    Curso save(Curso curso);
    
    Curso update(Curso curso);
    
    List<Curso> findAll();
    
    void delete(long id);
    
    Curso findById(long id);
    
    List<Curso> findByNome(String nome);
}
