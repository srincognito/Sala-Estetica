package model;

public class Servicio{
	
	public static double IVA=0.19;
	public static double PEDICURE=0.25;
	public static double CORTE=0.20;
	public static double MANICURE=0.35;
	private double serv;
	private int veces;
	private double ingreso;
	private double impuesto;
	private double precio;

	public Servicio(double x){
		serv=x;
		veces=0;
		ingreso=0;
		setPrecio();
		impuesto=0;
	}

	public double getImpuesto(){
		return impuesto;
	}

	public double getIngreso(){
		return ingreso;
	}

	public double getServ(){
		return serv;
	}

	public int getVeces(){
		return veces;
	}

	public void setPrecio(){
		if(serv==MANICURE){
			precio=7000;	
		}
		else if(serv==PEDICURE){
			precio=9000;
		}
		else{
			precio=8000;
		}
	}

	public void actualizar(){
		ingreso+=precio*serv;
		impuesto+=precio*IVA;
		veces++;
	}
}