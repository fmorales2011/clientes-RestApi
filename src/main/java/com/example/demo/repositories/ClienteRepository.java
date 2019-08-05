package com.example.demo.repositories;

import com.example.demo.models.cliente;

import java.util.List;

//import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClienteRepository extends MongoRepository<cliente, String> {

}
