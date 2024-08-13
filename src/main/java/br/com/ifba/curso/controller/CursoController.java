/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.controller;

import br.com.ifba.curso.entity.Curso;
import br.com.ifba.curso.service.CursoIService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author Gabriel
 */
@Controller
public class CursoController implements CursoIController{
    
    @Autowired
    private CursoIService cursoIService;
    
    @Override
    public Curso save(Curso curso) {
        return cursoIService.save(curso);
    }

    @Override
    public Curso update(Curso curso) {
        return cursoIService.update(curso);
    }

    @Override
    public List<Curso> findAll() {
        return cursoIService.findAll();
    }

    @Override
    public void delete(long id) {
        cursoIService.deleteById(id);
    }

    @Override
    public Curso findById(long id) {
        return cursoIService.findById(id);
    }

    @Override
    public List<Curso> findByNome(String nome) {
        return cursoIService.findByNome(nome);
    }
    
}
