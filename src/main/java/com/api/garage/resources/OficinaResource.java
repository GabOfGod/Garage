/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.garage.resources;

import com.api.garage.models.Oficina;
import com.api.garage.repository.OficinaRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lucas
 */
@CrossOrigin(origins = "*")
@Api(value="API REST Produtos")
@RestController
@RequestMapping(value="/api")
public class OficinaResource {
    @Autowired
    OficinaRepository oficinaRepository;

    @ApiOperation(value="Retorna uma lista de Oficinas")
    @GetMapping("/oficina")
    public List<Oficina> listaProdutos(){
            return oficinaRepository.findAll();
    }

    @ApiOperation(value="Retorna uma oficina")
    @GetMapping("/oficina/{id}")
    public Oficina listaProdutoUnico(@PathVariable(value="id") long id){
            return oficinaRepository.findById(id);
    }

    @ApiOperation(value="Salva uma oficina")
    @PostMapping("/oficina")
    public Oficina salvaProduto(@RequestBody Oficina oficina) {
            return oficinaRepository.save(oficina);
    }

    @ApiOperation(value="Deleta uma oficina")
    @DeleteMapping("/oficina")
    public void deletaProduto(@RequestBody Oficina oficina) {
           oficinaRepository.delete(oficina);
    }

    @ApiOperation(value="Atualiza uma oficina")
    @PutMapping("/oficina")
    public Oficina atualizaProduto(@RequestBody Oficina oficina) {
            return oficinaRepository.save(oficina);
    }
}
