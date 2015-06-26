package com.pe.jira.consulta.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import com.pe.jira.consulta.model.Documento;
import com.pe.jira.consulta.service.DocumentoService;

@ManagedBean(name="documentoController")
@SessionScoped
public class DocumentoController implements Serializable{

	private static final long serialVersionUID = 1L;
		
	@ManagedProperty("#{documentoService}")
	private DocumentoService documentoService;
	
	public DocumentoService getDocumentoService() {
		return documentoService;
	}

	public void setDocumentoService(DocumentoService documentoService) {
		this.documentoService = documentoService;
	}

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
	
	public String irOtraPantalla(){
		System.out.println("xxxxxxxx");
		List<Documento> documentos = documentoService.getListadoDocumentos();
		System.out.println("size:" + documentos.size());
		return "";
	}
}