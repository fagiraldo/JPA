package edu.sergioArboleda.vo;

import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * 
 * @author B106 PC-11
 *
 */
@Entity
public class Tienda {
        @Id
        private int id;
 	private int nit;
	private String nombre;
	private String telefono;

        @OneToMany(mappedBy="Producto")
    	private ArrayList<Producto> productos;
        
        @OneToMany(mappedBy="FormaPago")
  	private ArrayList<FormaPago> formaPago;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public ArrayList<FormaPago> getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(ArrayList<FormaPago> formaPago) {
        this.formaPago = formaPago;
    }


        
	
	
}
