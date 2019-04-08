package model;

public class Empresa{
	
	private Empleado e1;
	private Empleado e2;
	private String nombre;

	public Empresa(String n){
		nombre=n;
		e1=new Empleado("CAPUCHO-MAN","14551245","PAPEROMBERO",2018);
		e2=new Empleado("EL HECHICERO","121545845","GRAN HECHICERO",1999);
	}

	public String generarReporte(Empleado e,double serv,String nombreserv){
		String salida="";
		Servicio servicio=null;
		if(serv==Servicio.MANICURE){
			servicio=e.getServmani();
		}
		else if(serv==Servicio.CORTE){
			servicio=e.getServcorte();
		}
		else if(serv==Servicio.PEDICURE){
			servicio=e.getServpedi();
		}
		if(servicio.getIngreso()==0){
			salida+="El empleado "+e.getNombre()+" no presta el servicio de "+nombreserv+".";
		}
		else if(servicio.getVeces()>10){
			salida+="El empleado "+e.getNombre()+" tiene "+servicio.getImpuesto()+" pesos de impuestos acumulados por concepto del servicio de "+nombreserv+".";
		}
		else if(servicio.getVeces()>=10&&servicio.getVeces()<=20){
			salida+="El empleado "+e.getNombre()+" con el servicio "+nombreserv+" tiene "+servicio.getIngreso()+" pesos de ingreso acumulado.";
		}
		else if(servicio.getVeces()>20&&servicio.getVeces()%10==0){
			salida+="-	Felictaciones a "+e.getNombre()+"!!! La sala cubrirá el valor de su impuesto.";
		}
		else{
			salida="ERROR!";
		}
		return salida;
	}

	public Empleado getE1(){
		return e1;
	}

	public Empleado getE2(){
		return e2;
	}

	public String getNombre(){
		return nombre;
	}
}