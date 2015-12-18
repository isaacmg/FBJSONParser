package pr;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;

import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class FBParsing {

	public static void main(String[] args) throws URISyntaxException, JSONException, MalformedURLException, IOException {
		
		
		
		String content = new String(Files.readAllBytes(Paths.get("response.json")));
		System.out.println(content);
	
		
		 
		JSONObject o = new JSONObject(content);
		JSONArray t =  o.getJSONArray("data");
		for(int i = 0; i<t.length(); i++)
		{
			JSONObject a = t.getJSONObject(i);
			if (a.has("message"))
			{
			String w = a.getString("message");
			System.out.println(w);
			}
			
			
			
			
		}
		
		
		
		

	

	

	}

}
