package model;

public class Empleado{
	
	private Servicio servmani;
	private Servicio servcorte;
	private Servicio servpedi;
	private String nombre;
	private String id;
	private String cargo;
	private int anhoIngreso;

	public Empleado(String nombre,String id,String cargo,int anhoIngreso){
		this.nombre=nombre;
		this.id=id;
		this.cargo=cargo;
		this.anhoIngreso=anhoIngreso;
		servmani=new Servicio(Servicio.MANICURE);
		servcorte=new Servicio(Servicio.CORTE);
		servpedi=new Servicio(Servicio.PEDICURE);
	}

	public double getPromIngreso(){
		double prom=servmani.getIngreso()+servcorte.getIngreso()+servpedi.getIngreso();
		int cont=3;
		if(servmani.getIngreso()==0){
			--cont;
		}
		if(servcorte.getIngreso()==0){
			--cont;
		}
		if(servpedi.getIngreso()==0){
			--cont;
		}
		prom=prom/cont;
		return prom;
	}

	public Servicio getServmani(){
		return servmani;
	}

	public Servicio getServpedi(){
		return servpedi;
	}

	public Servicio getServcorte(){
		return servcorte;
	}

	public String getNombre(){
		return nombre;
	}
}