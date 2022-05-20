package proyecto_web;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class LoginBean {

	private String username;
	private String password;

	public void ingresar() {

		if (this.username.equals("solares") && this.password.equals("solares")) {
			FacesContext.getCurrentInstance().addMessage("formLogin:txtUsername",
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario Correcto", ""));
			this.redireccionar("principal.xhtml");
		} else {
			FacesContext.getCurrentInstance().addMessage("formLogin:txtUsername",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Password or Username incorrect!	", ""));
		}

		System.out.println("Username: " + this.username);
		System.out.println("Password: " + this.password);
	}
	
	private void redireccionar(String pagina) {
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		try {
			externalContext.redirect(pagina);
		} catch (IOException e) {
			System.out.println("No se pudo redireccionar");
			FacesContext.getCurrentInstance().addMessage("formLogin:txtUsername",
					new FacesMessage(FacesMessage.SEVERITY_FATAL, "Page not exists!	", ""));
			
		}
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
