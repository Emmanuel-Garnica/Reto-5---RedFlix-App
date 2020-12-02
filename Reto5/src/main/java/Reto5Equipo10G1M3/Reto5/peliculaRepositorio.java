/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto5Equipo10G1M3.Reto5;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author JessidEscobar
 */
@Repository
public interface peliculaRepositorio extends  JpaRepository <peliculas, Integer>{        
    
}
