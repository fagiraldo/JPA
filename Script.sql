/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  fabian.giraldo
 * Created: 4/03/2016
 */

create database mydb;
USE `mydb` ;


CREATE  TABLE IF NOT EXISTS `mydb`.`Tienda` (
  `id` INT NOT NULL ,
  `nit` VARCHAR(45) NOT NULL ,
  `nombre` VARCHAR(45) NULL ,
  `telefono` VARCHAR(45) NULL ,
  PRIMARY KEY (`id`) )
ENGINE = InnoDB;


CREATE  TABLE IF NOT EXISTS `mydb`.`FormaPago` (
  `id` INT NOT NULL ,
  `descripcion` VARCHAR(45) NULL ,
  `Tienda_id` INT NOT NULL ,
  PRIMARY KEY (`id`) ,
  CONSTRAINT `fk_FormaPago_Tienda`
    FOREIGN KEY (`Tienda_id` )
    REFERENCES `mydb`.`Tienda` (`id` )
)
ENGINE = InnoDB;

CREATE  TABLE IF NOT EXISTS `mydb`.`Producto` (
  `codigo` INT NOT NULL ,
  `descripcion` VARCHAR(45) NULL ,
  `precio` DOUBLE NULL ,
  `Tienda_id` INT NOT NULL ,
  PRIMARY KEY (`codigo`) ,
  CONSTRAINT `fk_Producto_Tienda1`
    FOREIGN KEY (`Tienda_id` )
    REFERENCES `mydb`.`Tienda` (`id` )
)
ENGINE = InnoDB;


select * from FormaPago;