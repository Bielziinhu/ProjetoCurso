/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.ifba.curso;

import br.com.ifba.curso.view.CursoView;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 *
 * @author Gabriel
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        
        ConfigurableApplicationContext context = new SpringApplicationBuilder(Application.class).headless(false).run(args);
        
        CursoView telaCurso = context.getBean(CursoView.class);
        telaCurso.setVisible(true);
        
        
    }
}
