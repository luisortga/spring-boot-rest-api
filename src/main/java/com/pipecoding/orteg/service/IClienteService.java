package com.pipecoding.orteg.service;

import com.pipecoding.orteg.model.dto.ClienteDto;
import com.pipecoding.orteg.model.entity.Cliente;

import java.util.List;

public interface IClienteService {

    List<Cliente> listAlll();

    Cliente save(ClienteDto cliente);

    Cliente findById(Integer id);

    void delete(Cliente cliente);

    boolean existsById(Integer id);

}
