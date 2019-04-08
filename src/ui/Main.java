package ui;

import model.Empresa;
import java.util.Scanner;

public class Main{
	
	public static void main(String [] args){
		Main m=new Main();
	}

	public Main(){
		menu();
	}

	Scanner read=new Scanner(System.in);
	Empresa em=new Empresa("Nombre empresa.");

	public void menu(){
		System.out.println("=====================================");
		System.out.println("Que quiere hacer hoy?\n1. Actualizar servicios de un empleado.\n2. Promedio de ingresos de un empleado.\n3. Ganancia de empleado por servicio especifico.\n4. Generar un reporte.\n5. Salir.");
		int op=read.nextInt();
		switch(op){
			case 1:actualizar();
				break;
			case 2:promedio();
				break;
			case 3:gananciaServ();
				break;
			case 4:reporte();
				break;
			case 5:System.exit(0);
		}		
	}

	public void actualizar(){
		System.out.println("Seleccione el empleado.\n1. "+em.getE1().getNombre()+"\n2. "+em.getE2().getNombre());
		int empleado=read.nextInt();
		System.out.println("Seleccione el servicio.\n1. Manicure.\n2. Pedicure.\n3. Corte de cabello.");
		int servicio=read.nextInt();
		if(empleado==1){
			if(servicio==1){
				em.getE1().getServmani().actualizar();
			}
			else if(servicio==2){
				em.getE1().getServpedi().actualizar();
			}
			else if(servicio==3){
				em.getE1().getServcorte().actualizar();
			}
		}
		if(empleado==2){
			if(servicio==1){
				em.getE2().getServmani().actualizar();
			}
			else if(servicio==2){
				em.getE2().getServpedi().actualizar();
			}
			else if(servicio==3){
				em.getE2().getServcorte().actualizar();
			}
		}
		menu();
	}

	public void promedio(){
		System.out.println("Seleccione el empleado.\n1. "+em.getE1().getNombre()+"\n2. "+em.getE2().getNombre());
		int empleado=read.nextInt();
		if(empleado==1){
			System.out.println("El promedio es: "+em.getE1().getPromIngreso());
		}
		else{
			System.out.println("El promedio es: "+em.getE2().getPromIngreso());
		}
		menu();
	}

	public void gananciaServ(){
		System.out.println("Seleccione el empleado.\n1. "+em.getE1().getNombre()+"\n2. "+em.getE2().getNombre());
		int empleado=read.nextInt();
		System.out.println("Seleccione el servicio.\n1. Manicure.\n2. Pedicure.\n3. Corte de cabello.");
		int servicio=read.nextInt();
		if(empleado==1){
			if(servicio==1){
				System.out.println(em.getE1().getServmani().getIngreso());
			}
			else if(servicio==2){
				System.out.println(em.getE1().getServpedi().getIngreso());
			}
			else if(servicio==3){
				System.out.println(em.getE1().getServcorte().getIngreso());
			}
		}
		if(empleado==2){
			if(servicio==1){
				System.out.println(em.getE2().getServmani().getIngreso());
			}
			else if(servicio==2){
				System.out.println(em.getE2().getServpedi().getIngreso());
			}
			else if(servicio==3){
				System.out.println(em.getE2().getServcorte().getIngreso());
			}
		}
		menu();
	}

	public void reporte(){
		System.out.println("Seleccione el empleado.\n1. "+em.getE1().getNombre()+"\n2. "+em.getE2().getNombre());
		int empleado=read.nextInt();
		System.out.println("Seleccione el servicio.\n1. Manicure.\n2. Pedicure.\n3. Corte de cabello.");
		int servicio=read.nextInt();
		if(empleado==1){
			if(servicio==1){
				System.out.println(em.generarReporte(em.getE1(),0.35,"manicure"));
			}
			else if(servicio==2){
				System.out.println(em.generarReporte(em.getE1(),0.25,"pedicure"));
			}
			else if(servicio==3){
				System.out.println(em.generarReporte(em.getE1(),0.2,"corte de cabello"));
			}
		}
		if(empleado==2){
			if(servicio==1){
				System.out.println(em.generarReporte(em.getE2(),0.35,"manicure"));
			}
			else if(servicio==2){
				System.out.println(em.generarReporte(em.getE2(),0.25,"pedicure"));
			}
			else if(servicio==3){
				System.out.println(em.generarReporte(em.getE2(),0.2,"corte de cabello"));
			}
		}
		menu();
	}
}