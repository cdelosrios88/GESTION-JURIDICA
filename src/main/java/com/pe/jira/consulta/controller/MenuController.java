package com.pe.jira.consulta.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="menuController")
@SessionScoped
public class MenuController implements Serializable{
	
	private static final long serialVersionUID = 1L;

	public String irReporteEstado(){
		return "reporteEstado";
	}
	
	public String irReporteFecha(){
		return "reporteFecha";
	}
	
	public String irReporteFechaImplementada(){
		return "reporteFechaImplementada";
	}
	
	public String irReporteAreaInvoclucrada(){
		return "reporteAreaInvoclucrada";
	}
	
	public String irPantalla5(){
		return "pantalla5";
	}
	
	public String irPantalla6(){
		return "pantalla6";
	}

}
