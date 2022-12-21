package com.main.apiPeru;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class JavaPe {
	
	private static BufferedReader br;
	private static int dniCn;
	private static String json;

	public static void main(String[] args) throws NumberFormatException, IOException {
		br = new BufferedReader(new InputStreamReader(System.in)); 
	    System.out.print("Ingresa el dni => ");
	    dniCn = Integer.parseInt(br.readLine());
	    sendRequestsPost();

	}
	public static final void sendRequestsPost() throws IOException{
	    String url_Send = String.format("http://app17.susalud.gob.pe:8081/webservices/ws_procesos/obtenerDatosReniec?numero=%d", dniCn);
	    URL url = new URL(url_Send);
            HttpURLConnection httpConnect = (HttpURLConnection) url.openConnection();
            httpConnect.setRequestMethod("GET");
            httpConnect.setRequestProperty("User-Agent", "Mozilla/5.0");
            httpConnect.setRequestProperty("Content-Type", "application/json");
            httpConnect.connect();
           int respuestaCode = httpConnect.getResponseCode();
           System.out.printf("CODE SERVER => [%d]", respuestaCode);
           if(respuestaCode == HttpURLConnection.HTTP_OK) {
        	BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
                String inputLine;
         
            while ((inputLine = in .readLine()) != null) {
                  json = inputLine;
                 
            }
            
            in .close();
            
            jsonParsing(json);
        }else {
        	System.out.printf("Ocurrio un error, CODE SERVER => [%d]", respuestaCode);
        }
      		
	}
	private static void jsonParsing(String data) {
		Gson gson = new Gson();
		JsonResponse p = gson.fromJson(data, JsonResponse.class);
		System.out.println(p.toString());
		
	}
	

}
