package edu.sergioArboleda.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


/**
 * @author Fabian Andres Giraldo.
 */
@Entity
public class FormaPago {
        @Id
        private int id;
        @Column(name = "descripcion")
	private String codigo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
		
	
	
	

}
