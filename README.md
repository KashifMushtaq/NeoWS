# NewWS Client Program (created as a job test)

Java application to get a list of “Near Earth Objects” using the NASA RESTful Web Service 
# https://api.nasa.gov/api.html#NeoWS

Identifies which NEO is the largest in size and which is the closest to Earth.
Outputs the total number of NEOs as well And the details are retrieved for both the largest and closest NEOs identified.


# Dependencies:
1. JDK (Compile)
2. GSON (https://repo1.maven.org/maven2/com/google/code/gson/gson/2.8.5/gson-2.8.5.jar)

# Gradle:
```gradle
dependencies {
  implementation 'com.google.code.gson:gson:2.8.5'
}
```

# Maven:
```Maven
<dependency>
  <groupId>com.google.code.gson</groupId>
  <artifactId>gson</artifactId>
  <version>2.8.5</version>
</dependency>
```

# To build:
On Windows, please correct the path in build.bat file <C:\Program Files\Java\jdk1.8.0_162\bin> and to point it to the correct JDK's bin intallation folder:

The batch file looks like:

# Windows Batch
```bat
rmdir /S /Q %cd%\build
mkdir %cd%\build
cmd /c "C:\Program Files\Java\jdk1.8.0_162\bin\javac" -cp ./lib/gson-2.8.5.jar -d ./build ./src/*.java
cd %cd%\build
cmd /c "C:\Program Files\Java\jdk1.8.0_162\bin\jar" -cvfe NeoBrowser.jar *.class
cd ..
```
On Linux, if JDK is installed, run this shell script:

# Linux Bash:
```bash
#!/bin/sh
rm -r ./build
mkdir -m777 ./build
javac -cp ./lib/gson-2.8.5.jar -d ./build ./src/*.java
cd ./build
jar -cvfe NeoBrowser.jar *.class
cd ..
```

This will build all the java classes and pack them as NeoBrowser.jar


# To Run:
1. Copy  gson-2.8.5.jar and NeoBrowser.jar in same folder
2. From within the same folder:

java -cp ./gson-2.8.5.jar:./NeoBrowser.jar NeoBrowser

or use test.bat or test.sh

```
# NeoBrowser.jar Output
# Output Sample:

Total Near Earth Objects: 19898
Page Size: 20
Total Pages: 995

From the List Received after Allowed Calls (30 in an hour, page size is 20 and can not get more)
Largest Near Earth Object: Name = 21277 (1996 TO5), Diameter = 3.5812940302 (KM)
```

# Details
```
Largest Near Earth Object Details:
Near_earth_objects [orbital_data = Orbital_data [mean_motion = .2689306786316806, aphelion_distance = 3.614766324039048, last_observation_date = 2018-11-03, mean_anomaly = 29.01121049077523, inclination = 20.95132925359687, orbit_uncertainty = 0, eccentricity = .5206796828759547, orbit_class = Orbit_class [orbit_class_range = 1.017 AU < q (perihelion) < 1.3 AU, orbit_class_description = Near-Earth asteroid orbits similar to that of 1221 Amor, orbit_class_type = AMO], perihelion_time = 2458492.623834147951, data_arc_in_days = 10499, minimum_orbit_intersection = .312604, perihelion_argument = 250.1936926848355, epoch_osculation = 2458600.5, jupiter_tisserand_invariant = 3.267, orbital_period = 1338.634929386562, orbit_id = 146, ascending_node_longitude = 167.3838959931591, orbit_determination_date = 2018-11-22 06:27:21, semi_major_axis = 2.377072808129253, first_observation_date = 1990-02-04, equinox = J2000, observations_used = 582, perihelion_distance = 1.139379292219459], nasa_jpl_url = http://ssd.jpl.nasa.gov/sbdb.cgi?sstr=2021277, is_sentry_object = false, absolute_magnitude_h = 16.1, name = 21277 (1996 TO5), estimated_diameter = Estimated_diameter [meters = Meters [estimated_diameter_min = 1601.6033797856, estimated_diameter_max = 3581.2940301941], feet = Feet [estimated_diameter_min = 5254.6044325359, estimated_diameter_max = 11749.652706022], kilometers = Kilometers [estimated_diameter_min = 1.6016033798, estimated_diameter_max = 3.5812940302], miles = Miles [estimated_diameter_min = 0.9951898937, estimated_diameter_max = 2.2253122528]], designation = 21277, links = Links [self = https://api.nasa.gov/neo/rest/v1/neo/2021277?api_key=DEMO_KEY, next = null], is_potentially_hazardous_asteroid = false, neo_reference_id = 2021277, close_approach_data = [Close_approach_data [miss_distance = Miss_distance [astronomical = 0.0334252168, kilometers = 5000341, lunar = 13.0024089813, miles = 3107068], relative_velocity = Relative_velocity [miles_per_hour = 34693.209610712, kilometers_per_second = 15.5095040506, kilometers_per_hour = 55834.214582039], close_approach_date = 1945-06-07, orbiting_body = Mars, epoch_date_close_approach = -775328400000]]]




Near Earth Object List Sorted by Maximum Estimated Diameter (Kilometers - Descending)
Near Earth Object: Name = 21277 (1996 TO5), Diameter = 3.5812940302 (KM)
Near Earth Object: Name = 162038 (1996 DH), Diameter = 2.844722965 (KM)

```


```
From the List Received after Allowed Calls (30 in an hour, page size is 20 and can not get more)
Nearest Object by Miss Distance: Name = 21277 (1996 TO5), Miss Distance = 5000341 (Kilometers)
```

# Details:

```
Near_earth_objects [orbital_data = Orbital_data [mean_motion = .2689306786316806, aphelion_distance = 3.614766324039048, last_observation_date = 2018-11-03, mean_anomaly = 29.01121049077523, inclination = 20.95132925359687, orbit_uncertainty = 0, eccentricity = .5206796828759547, orbit_class = Orbit_class [orbit_class_range = 1.017 AU < q (perihelion) < 1.3 AU, orbit_class_description = Near-Earth asteroid orbits similar to that of 1221 Amor, orbit_class_type = AMO], perihelion_time = 2458492.623834147951, data_arc_in_days = 10499, minimum_orbit_intersection = .312604, perihelion_argument = 250.1936926848355, epoch_osculation = 2458600.5, jupiter_tisserand_invariant = 3.267, orbital_period = 1338.634929386562, orbit_id = 146, ascending_node_longitude = 167.3838959931591, orbit_determination_date = 2018-11-22 06:27:21, semi_major_axis = 2.377072808129253, first_observation_date = 1990-02-04, equinox = J2000, observations_used = 582, perihelion_distance = 1.139379292219459], nasa_jpl_url = http://ssd.jpl.nasa.gov/sbdb.cgi?sstr=2021277, is_sentry_object = false, absolute_magnitude_h = 16.1, name = 21277 (1996 TO5), estimated_diameter = Estimated_diameter [meters = Meters [estimated_diameter_min = 1601.6033797856, estimated_diameter_max = 3581.2940301941], feet = Feet [estimated_diameter_min = 5254.6044325359, estimated_diameter_max = 11749.652706022], kilometers = Kilometers [estimated_diameter_min = 1.6016033798, estimated_diameter_max = 3.5812940302], miles = Miles [estimated_diameter_min = 0.9951898937, estimated_diameter_max = 2.2253122528]], designation = 21277, links = Links [self = https://api.nasa.gov/neo/rest/v1/neo/2021277?api_key=DEMO_KEY, next = null], is_potentially_hazardous_asteroid = false, neo_reference_id = 2021277, close_approach_data = [Close_approach_data [miss_distance = Miss_distance [astronomical = 0.0334252168, kilometers = 5000341, lunar = 13.0024089813, miles = 3107068], relative_velocity = Relative_velocity [miles_per_hour = 34693.209610712, kilometers_per_second = 15.5095040506, kilometers_per_hour = 55834.214582039], close_approach_date = 1945-06-07, orbiting_body = Mars, epoch_date_close_approach = -775328400000]]]



Near Earth Object List Sorted by Miss Distance (Kilometers - Ascending)
Near Earth Object: Name = 21277 (1996 TO5), Miss Distance = 5000341 (Kilometers)
Near Earth Object: Name = (1999 JO6), Miss Distance = 74194080 (Kilometers)

```

# Code
The code comprise of 2 java files:
1. NeoBrowser.java (Simple console application which makes recursive calls to fetch pagged JSON payload)


```java
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

            for (long i = 1; i <= pageSize; ++i) {
                String nextURL = neoWS.getLinks().getNext();
                if (nextURL != null && !nextURL.trim().equals("")) {
                    neoWS = getNeoWs(nextURL);
                    if (neoWS != null) {
                        addToList(neoWS);
                        //Comment me to get all objects
                        //break; //Note Code gets only 40 as getting all the data with demo key cause server to throw error 429 after few requests. Too many requests
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }

            System.out.println(String.format("Total NEO(s) Received: %s", listNear_earth_objects.size()));

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

        } catch (NumberFormatException ex) {
            System.out.println(String.format("Error:%n%s%n", ex.getMessage()));
        }
    }

    private static NeoWs getNeoWs(String requestURL) {
        try(Scanner scanner = new Scanner(new URL(requestURL).openStream())) {
            String response = scanner.useDelimiter("\\Z").next();
            //System.out.println(response);
            return new Gson().fromJson(response, NeoWs.class);
        } catch (IOException ex) {
            System.out.println(String.format("Error:%n%s%n", ex.getMessage()));
        }
        return null;
    }

    private static void addToList(NeoWs neoWS) {
        for (Near_earth_objects o : neoWS.getNear_earth_objects()) {
            listNear_earth_objects.add(o);
        }
    }
}
```


2. NeoWs.java (Wraps one public class and all other support class - not created in separate files)


```java
public class NeoWs {

    private Page page;

    private Links links;

    private Near_earth_objects[] near_earth_objects;

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public Near_earth_objects[] getNear_earth_objects() {
        return near_earth_objects;
    }

    public void setNear_earth_objects(Near_earth_objects[] near_earth_objects) {
        this.near_earth_objects = near_earth_objects;
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName() + " [page = " + page + ", links = " + links + ", near_earth_objects = " + near_earth_objects + "]";
    }
}
```

The JSON response provided by the **Neo Service** contains the URL to get next page of objects **(max returns 20 may be just with demo key)**.

Code below makes the actual call to the service:
This code also deserialize the JSON payload in NeoWS Object:

```java
    private static NeoWs getNeoWs(String requestURL) {
        try(Scanner scanner = new Scanner(new URL(requestURL).openStream())) {
            String response = scanner.useDelimiter("\\Z").next();
            //System.out.println(response);
            return new Gson().fromJson(response, NeoWs.class);
        } catch (IOException ex) {
            System.out.println(String.format("Error:%n%s%n", ex.getMessage()));
        }
        return null;
    }
```

The data is kept in an ArrayList. This ArrayList is then sorted using object comparators in **Near_earth_objects** class by implementing **Comparable** interface to get Largest and Nearest Object:

```java
    /**
     * Comparator for sorting the list by getEstimated_diameter_max Parameters:
     * o1 - the first object to be compared. o2 - the second object to be
     * compared. Returns: A negative integer, zero, or a positive integer as the
     * first argument is less than, equal to, or greater than the second.
     */
    public static Comparator<Near_earth_objects> compDiameterInKM = new Comparator<Near_earth_objects>() {

        public int compare(Near_earth_objects s1, Near_earth_objects s2) {
            Double d1 = Double.parseDouble(s1.getEstimated_diameter().getKilometers().getEstimated_diameter_max());
            Double d2 = Double.parseDouble(s2.getEstimated_diameter().getKilometers().getEstimated_diameter_max());
            Double r = d2 - d1;
            return r.intValue();
        }
    };

    /**
     * Comparator for sorting the list by getMiss_distance().getKilometers()
     * Returned JSON payload does not always has data miss distance data for the
     * NEO
     */
    public static Comparator<Near_earth_objects> compMiss_distance = new Comparator<Near_earth_objects>() {

        public int compare(Near_earth_objects s1, Near_earth_objects s2) {
            Close_approach_data[] c1 = s1.getClose_approach_data();
            Close_approach_data[] c2 = s1.getClose_approach_data();
            if (c1.length > 0 && c2.length > 0) {
                Double d1 = Double.parseDouble(c1[0].getMiss_distance().getKilometers());
                Double d2 = Double.parseDouble(c2[0].getMiss_distance().getKilometers());
                Double r = d2 - d1;
                return r.intValue();
            } else {
                return Integer.MAX_VALUE;
            }
        }
    };
```
