/*
•            Write a Java application to get a list of “Near Earth Objects” using the NASA RESTful Web Service https://api.nasa.gov/api.html#NeoWS 
•            Identify which NEO is the largest in size and which is the closest to Earth – this requires your judgment. Output the total number of NEOs, and the details retrieved for both the largest and closest NEOs identified.
•            Provide proof that code is functional. It must be possible to download, build and run the application on any platform where Java is installed.
 */

import com.google.gson.Gson;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Hourly Limit: 30 requests per IP address per hour
 * Daily Limit: 50 requests per IP address per day
 * With demo key server will throw error 429.
 *
 * @author root
 */
public class NeoBrowser {

    private static String NEO_SERVICE_URL = "https://api.nasa.gov/neo/rest/v1/neo/browse?api_key=DEMO_KEY";
    private static ArrayList<Near_earth_objects> listNear_earth_objects = new ArrayList<Near_earth_objects>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {

            //final JsonReader reader = new JsonReader(new FileReader("/root/NetBeansProjects/javatest/browse.json"));
            String requestURL = NEO_SERVICE_URL;

            //get first batch of NEOs (default page size is 20
            NeoWs neoWS = getNeoWs(requestURL);
            if(neoWS==null) {
                System.out.println(String.format("System appears to be down at URL: %s", requestURL));
                return;
            }
            
            Page p = neoWS.getPage();
            long totalElements = Long.parseLong(p.getTotal_elements());
            System.out.println(String.format("Total Near Earth Objects: %d", totalElements));

            long pageSize = Long.parseLong(p.getSize());
            System.out.println(String.format("Page Size: %d", pageSize));

            long totalPages = Long.parseLong(p.getTotal_pages());
            System.out.println(String.format("Total Pages: %d", totalPages));

            addToList(neoWS);

            for (long i = 1; i < pageSize; ++i) {
                String nextURL = neoWS.getLinks().getNext();
                if (nextURL != null && nextURL != "") {
                    neoWS = getNeoWs(nextURL);
                    if (neoWS != null) {
                        addToList(neoWS);
                        //Comment me to get all objects
                        //break; //Note Code gets only 40 as getting all the data with demo key cause server to throw error 429 after few requests. Too many requests
                        
                    } else {
                        break;
                    }
                }
            }

            System.out.println();
            System.out.println();
            
            Collections.sort(listNear_earth_objects, Near_earth_objects.compDiameterInKM);
            System.out.println(String.format("Largest Near Earth Object: Name = %s, Diameter = %s (KM)", listNear_earth_objects.get(0).getName(), listNear_earth_objects.get(0).getEstimated_diameter().getKilometers().getEstimated_diameter_max()));
            System.out.println(String.format("%s", listNear_earth_objects.get(0)));
            
            System.out.println();
            System.out.println();
            System.out.println(String.format("Near Earth Object List Sorted by Maximum Estimated Diameter (Kilometers - Descending)"));
            for (Near_earth_objects o : listNear_earth_objects) {
                System.out.println(String.format("Near Earth Object: Name = %s, Diameter = %s (KM)", o.getName(), o.getEstimated_diameter().getKilometers().getEstimated_diameter_max()));
            }

            
            Collections.sort(listNear_earth_objects, Near_earth_objects.compMiss_distance);
            
            System.out.println();
            System.out.println();
            for (Near_earth_objects o : listNear_earth_objects) {
                Close_approach_data[] c1 = o.getClose_approach_data();
                if(c1.length>0) {
                    System.out.println(String.format("Nearest Object by Miss Distance: Name = %s, Miss Distance = %s (Kilometers)", o.getName(), c1[0].getMiss_distance().getKilometers()));
                    System.out.println(String.format("%s", o));
                    break;
                }
            }  
            
            System.out.println();
            System.out.println();
            
            System.out.println(String.format("Near Earth Object List Sorted by Miss Distance (Kilometers - Ascending)"));            
            for (Near_earth_objects o : listNear_earth_objects) {
                Close_approach_data[] c1 = o.getClose_approach_data();
                if(c1.length>0) {
                    System.out.println(String.format("Near Earth Object: Name = %s, Miss Distance = %s (Kilometers)", o.getName(), c1[0].getMiss_distance().getKilometers()));
                } else {
                    //System.out.println(String.format("Near Earth Object: Name = %s, Miss Distance = %s (KM)", o.getName(), "Data Not Available"));
                }
            }            

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static NeoWs getNeoWs(String requestURL) {
        try {
            URL neoRequest = new URL(requestURL);

            Scanner scanner = new Scanner(neoRequest.openStream());
            String response = scanner.useDelimiter("\\Z").next();
            
            //System.out.println(response);
            
            NeoWs neoWS = new Gson().fromJson(response, NeoWs.class);
            scanner.close();
            return neoWS;
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    private static void addToList(NeoWs neoWS) {
        for (Near_earth_objects o : neoWS.getNear_earth_objects()) {
            listNear_earth_objects.add(o);
        }
    }
}
