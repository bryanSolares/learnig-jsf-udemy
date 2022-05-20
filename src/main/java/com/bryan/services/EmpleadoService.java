package com.bryan.services;

import java.util.ArrayList;
import java.util.List;

import proyecto_web.entity.Empleado;

public class EmpleadoService {
	public List<Empleado> empleados = new ArrayList<Empleado>();
	
	/*
	 * @return {@link Empleado} lista de empleados
	 * */
	public List<Empleado> consultarEmpleados(){
		Empleado a = new Empleado("Nombre 1", "Apellido Primero 1", "Apellido Segundo 1", "Puesto 1", true);
		Empleado b = new Empleado("Nombre 2", "Apellido Primero 2", "Apellido Segundo 2", "Puesto 2", false);
		Empleado c = new Empleado("Nombre 3", "Apellido Primero 3", "Apellido Segundo 3", "Puesto 3", true);
		
		this.empleados.add(a);
		this.empleados.add(b);
		this.empleados.add(c);
		
		return this.empleados;
	}
}
