package pr;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;

import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class FBParsing {

	public static void main(String[] args) throws URISyntaxException, JSONException, MalformedURLException, IOException {
		
		
		
		String content = new String(Files.readAllBytes(Paths.get("file.json")));
		
		File finishedText = new File("finished.txt"); 
		PrintWriter fWriter = new PrintWriter (new FileWriter(finishedText)); 
				
		
		 
		JSONObject o = new JSONObject(content);
		JSONArray t =  o.getJSONArray("data");
		for(int i = 0; i<t.length(); i++)
		{
			JSONObject a = t.getJSONObject(i);
			if (a.has("message"))
			{
			String w = a.getString("message");
			
			System.out.println(w);
			fWriter.println(w);

			}
			if(a.has("description"))
			{
				String d = a.getString("description");
				fWriter.println(d);
			}
			
			
			
		}
		
		
		
		

	

	

	}

}
