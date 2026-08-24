package com.pipecoding.orteg.model.dao;

import com.pipecoding.orteg.model.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDao extends CrudRepository<Cliente, Integer> {
}
