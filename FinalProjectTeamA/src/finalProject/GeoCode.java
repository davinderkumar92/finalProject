package finalProject;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.net.URISyntaxException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;






public class GeoCode {

	private static final String GOOGLE_API_KEY = "AIzaSyARiki0HBLlyR7xH0K3e4eifaSLzx8b-7E";
	private final static HttpClient client = HttpClientBuilder.create().build();
	public static void performSearch(String address) throws Exception{
	//public static void performSearch( String number,String streetName,String direction,String city,String country) throws Exception {
		final URIBuilder builder = new URIBuilder().setScheme("https").setHost("maps.googleapis.com").setPath("/maps/api/geocode/json");
		builder.addParameter("address",address);
		//builder.addParameter("number",number);
		//builder.addParameter("streetName",streetName);
		//builder.addParameter("direction",direction);
		//builder.addParameter("city",city);
		//builder.addParameter("country",country);
		//builder.addParameter("key",GeoCode.GOOGLE_API_KEY);
		final HttpUriRequest request = new HttpGet(builder.build());
		System.out.print(request);
		
		final HttpResponse execute = client.execute(request);
		final String response = EntityUtils.toString(execute.getEntity());
		System.out.println(response);
		JSONObject results = JSONObject.fromObject(response);
		
		JSONArray resultsArray = results.getJSONArray("results");
		for (int i = 0; i<resultsArray.size(); i++)
		{
		
			JSONObject resultObject = resultsArray.getJSONObject(i);
			
			JSONObject geometry = resultObject.getJSONObject("geometry");
			//System.out.println(geometry);
			
			JSONObject location = geometry.getJSONObject("location");
			
			String lat = location.getString("lat");
			String lng = location.getString("lng");
			
			System.out.println("the latitude is " + lat);
			System.out.println("the longitude is " +lng);
			String types = resultObject.getString("types");
			System.out.println("the type is " + types);
			
			
			
			
			
			
		}
		}
}
