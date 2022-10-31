package com.main.apiPeru;

public class JsonResponse {
	private String APE_PATERNO;
	private String APE_MATERNO;
	private String NOMBRES;
	private Integer DPTO;
	private Integer PROV;
	private String DIRECCION;
	private String FECHA_NACIMIENTO;
	private Integer EDAD;
	public JsonResponse(String aPE_PATERNO, String aPE_MATERNO, String nOMBRES, Integer dPTO, Integer pROV,
			String dIRECCION, String fECHA_NACIMIENTO, Integer eDAD) {
		super();
		APE_PATERNO = aPE_PATERNO;
		APE_MATERNO = aPE_MATERNO;
		NOMBRES = nOMBRES;
		DPTO = dPTO;
		PROV = pROV;
		DIRECCION = dIRECCION;
		FECHA_NACIMIENTO = fECHA_NACIMIENTO;
		EDAD = eDAD;
	}
	public String getAPE_PATERNO() {
		return APE_PATERNO;
	}
	public void setAPE_PATERNO(String aPE_PATERNO) {
		APE_PATERNO = aPE_PATERNO;
	}
	public String getAPE_MATERNO() {
		return APE_MATERNO;
	}
	public void setAPE_MATERNO(String aPE_MATERNO) {
		APE_MATERNO = aPE_MATERNO;
	}
	public String getNOMBRES() {
		return NOMBRES;
	}
	public void setNOMBRES(String nOMBRES) {
		NOMBRES = nOMBRES;
	}
	public Integer getDPTO() {
		return DPTO;
	}
	public void setDPTO(Integer dPTO) {
		DPTO = dPTO;
	}
	public Integer getPROV() {
		return PROV;
	}
	public void setPROV(Integer pROV) {
		PROV = pROV;
	}
	public String getDIRECCION() {
		return DIRECCION;
	}
	public void setDIRECCION(String dIRECCION) {
		DIRECCION = dIRECCION;
	}
	public String getFECHA_NACIMIENTO() {
		return FECHA_NACIMIENTO;
	}
	public void setFECHA_NACIMIENTO(String fECHA_NACIMIENTO) {
		FECHA_NACIMIENTO = fECHA_NACIMIENTO;
	}
	public Integer getEDAD() {
		return EDAD;
	}
	public void setEDAD(Integer eDAD) {
		EDAD = eDAD;
	}
	@Override
	public String toString() {
		return "\nAPELIDO PATERNO: " + APE_PATERNO + "\nAPELLIDO MATERNO: " + APE_MATERNO + "\nNOMBRES: " + NOMBRES
				+ "\nDPTO: " + DPTO + "\nPROV: " + PROV + "\nDIRECCION: " + DIRECCION + "\nFECHA NACIMIENTO: "
				+ FECHA_NACIMIENTO + "\nEDAD: " + EDAD;
	}
	
    

}
