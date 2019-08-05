package com.example.demo;

import com.example.demo.models.cliente;
import com.example.demo.repositories.ClienteRepository;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//import javax.validation.Valid;
import java.util.List;

import javax.validation.Valid;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
  @Autowired
  private ClienteRepository repository;
  
  @RequestMapping(value = "/", method = RequestMethod.GET)
  public List<cliente> getAllCliente() {
    return repository.findAll();
  }
  
  @RequestMapping(value = "/", method = RequestMethod.POST)
  public cliente createCliente(@Valid @RequestBody cliente cliente) {
	cliente.set_id(ObjectId.get());
    repository.save(cliente);
    return cliente;
  }
}