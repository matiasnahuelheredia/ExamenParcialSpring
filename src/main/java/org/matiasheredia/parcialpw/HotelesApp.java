package org.matiasheredia.parcialpw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HotelesApp {

	/**
	 * @param args
	 */
	public static ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	public static BeanFactory factory = context;
	
	public static String Preguntar(String preguntar) throws IOException
	{
		System.out.println(preguntar);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String linea = br.readLine(); 
		return linea;
	}
	public static boolean isInteger(String str) {
	    try {
	        Integer.parseInt(str);
	        return true;
	    } catch (NumberFormatException nfe) {}
	    return false;
	}
	public static int PreguntaEntero(String preguntar) throws IOException
	{
		String linea;
		do{
		System.out.println(preguntar);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		 linea = br.readLine();
		
		}while (isInteger(linea)==false);
		return Integer.parseInt(linea);
	}
	
	public static void main(String[] args) throws IOException {
	
		IHoteles hotel;
		String tipoHotel;
        do{
        tipoHotel = Preguntar("que tipo de hotel quiere");
        }while(!tipoHotel.equals("Lujo")&&!tipoHotel.equals("Economico"));
        
        
        hotel = (IHoteles) factory.getBean(tipoHotel);//instancia del objeto
        hotel.setNombre(Preguntar("ingrese el nombre de quien realiza la reserva"));
        hotel.setApellido(Preguntar("ingrese el apellido de quien realiza la reserva"));
        hotel.setTiempoEstimado(PreguntaEntero("indique ¿cuanto tiempo desea quedarse? en semanas"));
        hotel.setCantCamas(PreguntaEntero("indique ¿cuantas camas va a nesecitar?"));
        if (tipoHotel.equals("Lujo"))
        {
        	HotelesLujo hotLuj = (HotelesLujo) hotel;
        	String cifras;
        	do{
        		cifras = Preguntar("ingrese las cifras de La targeta gold");
        	}while(!hotLuj.checkSum(cifras));
        	hotLuj.setCifras(cifras);
        }
        if (tipoHotel.equals("Economico"))
        {
            HotelesEconomicos hotelEcon = (HotelesEconomicos) hotel;
            do
            {
            hotelEcon.setEstrellas(PreguntaEntero("cuantas estrellas desea"));
            }while (hotelEcon.getEstrellas()<0 && hotelEcon.getEstrellas()>3);
            String serviciohabit;
            do
            {
            serviciohabit = Preguntar("¿desea servicio a la habitacion?");
            }while(!serviciohabit.equals("si")&&!serviciohabit.equals("no"));
            
            if (serviciohabit.equals("si"))
            {
            	hotelEcon.setServicioHabitacion(true);
            }
            else
            {
            	hotelEcon.setServicioHabitacion(false);
            }
            
        }
	}

}
