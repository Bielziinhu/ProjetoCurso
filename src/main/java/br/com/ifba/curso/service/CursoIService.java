/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.curso.service;

import br.com.ifba.curso.entity.Curso;
import java.util.List;

/**
 *
 * @author Gabriel
 */
public interface CursoIService {
    
    Curso save(Curso curso) throws RuntimeException;
    
    Curso update(Curso curso) throws RuntimeException;
    
    List<Curso> findAll() throws RuntimeException;
    
    Curso findById(long id) throws RuntimeException;
    
    void deleteById(long id) throws RuntimeException;
    
    List<Curso> findByNome(String nome) throws RuntimeException;
    
}
