package proyecto_web;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.bryan.services.EmpleadoService;

import proyecto_web.entity.Empleado;

@ManagedBean
@ViewScoped
public class PrincipalBean {
	private List<Empleado> empleados;
	private EmpleadoService service = new EmpleadoService();

	@PostConstruct
	public void init() {
		this.consultarEmpleados();
	}
	
	public void consultarEmpleados() {
		this.empleados = this.service.consultarEmpleados();
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	
}
