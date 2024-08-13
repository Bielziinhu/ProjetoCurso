/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.service;

import br.com.ifba.curso.entity.Curso;
import br.com.ifba.curso.repository.CursoRepository;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 *
 * @author Gabriel
 */
@Service
//Cria um construtor para atributos final
@RequiredArgsConstructor
public class CursoService implements CursoIService{

    private final CursoRepository cursoRepository;
    
    //Atributo para o Log
    private static final Logger log = LoggerFactory.getLogger(CursoService.class);
    
    @Override
    public Curso save(Curso curso) throws RuntimeException {
        if (curso == null) {
            throw new RuntimeException("Dados do Curso não preenchidos");
        } else if (cursoRepository.existsById(curso.getId())) {
            throw new RuntimeException("Curso já existe");
        } else {
            log.info("Um Curso foi salvo!");
            return cursoRepository.save(curso);
        }
    }

    @Override
    public Curso update(Curso curso) throws RuntimeException {
        if (curso == null) {
            throw new RuntimeException("Dados do Curso não preenchidos");
        } else if (!cursoRepository.existsById(curso.getId())) {
            throw new RuntimeException("Curso não encontrado");
        } else {
            log.info("Um Curso foi atualizado!");
            return cursoRepository.save(curso);
        }
    }

    @Override
    public List<Curso> findAll() throws RuntimeException {
        List<Curso> cursos = cursoRepository.findAll();
        if (cursos.isEmpty()) {
            throw new RuntimeException("Nenhum curso encontrado");
        } else {
            return cursos;
        }
    }

    @Override
    public void deleteById(long id) throws RuntimeException {
        if (!cursoRepository.existsById(id)) {
            throw new RuntimeException("Curso não encontrado");
        } else {
            log.info("Um curso foi deletado!");
            cursoRepository.deleteById(id);
            throw new RuntimeException("Curso deletado");
        }
    }

    @Override
    public Curso findById(long id) throws RuntimeException {
        Optional<Curso> curso = cursoRepository.findById(id);
        if (curso.isPresent()) {
            return curso.get();
        } else {
            throw new RuntimeException("Curso não encontrado");
        }
    }

    @Override
    public List<Curso> findByNome(String nome) throws RuntimeException {
        List<Curso> cursos = cursoRepository.findByNome(nome);
        if (cursos.isEmpty()) {
            throw new RuntimeException("Curso não encontrado");
        } else {
            return cursos;
        }
    }
}
