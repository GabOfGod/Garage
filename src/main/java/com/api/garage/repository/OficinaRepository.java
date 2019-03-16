/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.garage.repository;

import com.api.garage.models.Oficina;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author lucas
 */
public interface OficinaRepository extends JpaRepository<Oficina, Long> {
    Oficina findById(long id);
}
