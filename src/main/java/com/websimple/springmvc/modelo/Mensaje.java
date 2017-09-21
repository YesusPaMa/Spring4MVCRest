package com.websimple.springmvc.modelo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement(name = "jugador")
public class Mensaje {
 
    String nombre;
    String texto;
 
    public Mensaje(){
         
    }
     
    public Mensaje(String nombre, String texto) {
        this.nombre = nombre;
        this.texto = texto;
    }
 
    @XmlElement
    public String getNombre() {
        return nombre;
    }
     
    @XmlElement
    public String getTexto() {
        return texto;
    }


}