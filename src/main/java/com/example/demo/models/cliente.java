package com.example.demo.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cliente")
public class cliente {
	  @Id
	  public ObjectId _id;
	  
	  public String name;
	  public String apellido;
	  public String fechaNacimiento;
	  public String edad;
	  
	  // Constructors
	  public cliente(ObjectId _id, String name, String apellido, String fechaNacimiento, String edad) {
	    this._id = _id;
	    this.name = name;
	    this.apellido = apellido;
	    this.fechaNacimiento = fechaNacimiento;
	    this.edad = edad;
	  }
	  
	  // ObjectId needs to be converted to string
	  public String get_id() { return _id.toHexString(); }
	  public void set_id(ObjectId _id) { this._id = _id; }
	  
	  public String getName() { return name; }
	  public void setName(String name) { this.name = name; }
	  
	  public String getApellido() { return apellido; }
	  public void setApellido(String apellido) { this.name = apellido; }
	  
	  public String getFechaNacimiento() { return fechaNacimiento; }
	  public void setFechaNacimiento(String fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }
	  
	  public String getEdad() { return edad; }
	  public void setEdad(String edad) { this.edad = edad; }
	}

