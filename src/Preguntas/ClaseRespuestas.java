package Preguntas;

import java.util.StringTokenizer;

public class ClaseRespuestas {
	
	
	String [] Respuestas = {
			"Sun","Cada 6 meses","For","Path","Objeto"
			
	};
	
	String [] RespuestasR = {
		   
			"Oracle,Eclipse fundation,Sun,Apache",
			"Cada año,Cada mes,Cada 3 meses,Cada 6 meses",
			"For,While,Do-While,Foreach",
			"ClassPath,Path,Java_Home,String",
			"Modelo,Plantilla,Esquema,Objeto"
			
			
	};
	public String getRespuestas(int Posicion) {
		
		return Respuestas[Posicion];
	}
	
	public String[] separar(String cadena,String separador) {
		StringTokenizer token = new StringTokenizer(cadena,separador);
		String[] a =new String[5];
		int i=0;
		while(token.hasMoreTokens()) {
			a[i]=token.nextToken();
			i++;
		}
		return a;
	}
	public String[] setRespuestas(int Posicion) {
		String s1=RespuestasR[Posicion];
		String[] s2=separar(s1,",");
		return s2;
	}

}
