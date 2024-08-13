/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.infrastructure.entity;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.springframework.stereotype.Component;
/**
 *
 * @author Gabriel
 */
@MappedSuperclass
@Component
//Cria todos os Getters e Setters
@Data
public class PersistenceEntity {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    
}
