/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.turma.entity;

import br.com.ifba.infrastructure.entity.PersistenceEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author Gabriel
 */
@Entity
@Table(name="turmas")
//Cria todos os Getters e Setters
@Data
public class Turma extends PersistenceEntity implements Serializable{
    
    @Column(name = "nome", nullable = false)
    private String nome;
    
       
}
