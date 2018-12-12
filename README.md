# NewWS Client Program (created for ... as a test)

Java application to get a list of “Near Earth Objects” using the NASA RESTful Web Service 
# https://api.nasa.gov/api.html#NeoWS

Identifies which NEO is the largest in size And which is the closest to Earth.
Outputs the total number of NEOs as well And the details are retrieved for both the largest and closest NEOs identified.


# Dependencies:
1. JDK (Compile)
2. GSON (https://repo1.maven.org/maven2/com/google/code/gson/gson/2.8.5/gson-2.8.5.jar)

# Gradle:
```gradle
Gradle:
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
Please correct path <C:\Program Files\Java\jdk1.8.0_162\bin> to point to the JDK in build.bat and run it on Windows:
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

This will pack build and pack it as NeoBrowser.jar


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


Largest Near Earth Object: Name = 21277 (1996 TO5), Diameter = 3.5812940302 (KM)

Near_earth_objects [orbital_data = Orbital_data [mean_motion = .2689306786316806, aphelion_distance = 3.614766324039048, last_observation_date = 2018-11-03, mean_anomaly = 29.01121049077523, inclination = 20.95132925359687, orbit_uncertainty = 0, eccentricity = .5206796828759547, orbit_class = Orbit_class [orbit_class_range = 1.017 AU < q (perihelion) < 1.3 AU, orbit_class_description = Near-Earth asteroid orbits similar to that of 1221 Amor, orbit_class_type = AMO], perihelion_time = 2458492.623834147951, data_arc_in_days = 10499, minimum_orbit_intersection = .312604, perihelion_argument = 250.1936926848355, epoch_osculation = 2458600.5, jupiter_tisserand_invariant = 3.267, orbital_period = 1338.634929386562, orbit_id = 146, ascending_node_longitude = 167.3838959931591, orbit_determination_date = 2018-11-22 06:27:21, semi_major_axis = 2.377072808129253, first_observation_date = 1990-02-04, equinox = J2000, observations_used = 582, perihelion_distance = 1.139379292219459], nasa_jpl_url = http://ssd.jpl.nasa.gov/sbdb.cgi?sstr=2021277, is_sentry_object = false, absolute_magnitude_h = 16.1, name = 21277 (1996 TO5), estimated_diameter = Estimated_diameter [meters = Meters [estimated_diameter_min = 1601.6033797856, estimated_diameter_max = 3581.2940301941], feet = Feet [estimated_diameter_min = 5254.6044325359, estimated_diameter_max = 11749.652706022], kilometers = Kilometers [estimated_diameter_min = 1.6016033798, estimated_diameter_max = 3.5812940302], miles = Miles [estimated_diameter_min = 0.9951898937, estimated_diameter_max = 2.2253122528]], designation = 21277, links = Links [self = https://api.nasa.gov/neo/rest/v1/neo/2021277?api_key=DEMO_KEY, next = null], is_potentially_hazardous_asteroid = false, neo_reference_id = 2021277, close_approach_data = [Close_approach_data [miss_distance = Miss_distance [astronomical = 0.0334252168, kilometers = 5000341, lunar = 13.0024089813, miles = 3107068], relative_velocity = Relative_velocity [miles_per_hour = 34693.209610712, kilometers_per_second = 15.5095040506, kilometers_per_hour = 55834.214582039], close_approach_date = 1945-06-07, orbiting_body = Mars, epoch_date_close_approach = -775328400000]]]




Near Earth Object List Sorted by Maximum Estimated Diameter (Kilometers - Descending)
Near Earth Object: Name = 21277 (1996 TO5), Diameter = 3.5812940302 (KM)
Near Earth Object: Name = 162038 (1996 DH), Diameter = 2.844722965 (KM)

```



```
Nearest Object by Miss Distance: Name = 21277 (1996 TO5), Miss Distance = 5000341 (Kilometers)

Near_earth_objects [orbital_data = Orbital_data [mean_motion = .2689306786316806, aphelion_distance = 3.614766324039048, last_observation_date = 2018-11-03, mean_anomaly = 29.01121049077523, inclination = 20.95132925359687, orbit_uncertainty = 0, eccentricity = .5206796828759547, orbit_class = Orbit_class [orbit_class_range = 1.017 AU < q (perihelion) < 1.3 AU, orbit_class_description = Near-Earth asteroid orbits similar to that of 1221 Amor, orbit_class_type = AMO], perihelion_time = 2458492.623834147951, data_arc_in_days = 10499, minimum_orbit_intersection = .312604, perihelion_argument = 250.1936926848355, epoch_osculation = 2458600.5, jupiter_tisserand_invariant = 3.267, orbital_period = 1338.634929386562, orbit_id = 146, ascending_node_longitude = 167.3838959931591, orbit_determination_date = 2018-11-22 06:27:21, semi_major_axis = 2.377072808129253, first_observation_date = 1990-02-04, equinox = J2000, observations_used = 582, perihelion_distance = 1.139379292219459], nasa_jpl_url = http://ssd.jpl.nasa.gov/sbdb.cgi?sstr=2021277, is_sentry_object = false, absolute_magnitude_h = 16.1, name = 21277 (1996 TO5), estimated_diameter = Estimated_diameter [meters = Meters [estimated_diameter_min = 1601.6033797856, estimated_diameter_max = 3581.2940301941], feet = Feet [estimated_diameter_min = 5254.6044325359, estimated_diameter_max = 11749.652706022], kilometers = Kilometers [estimated_diameter_min = 1.6016033798, estimated_diameter_max = 3.5812940302], miles = Miles [estimated_diameter_min = 0.9951898937, estimated_diameter_max = 2.2253122528]], designation = 21277, links = Links [self = https://api.nasa.gov/neo/rest/v1/neo/2021277?api_key=DEMO_KEY, next = null], is_potentially_hazardous_asteroid = false, neo_reference_id = 2021277, close_approach_data = [Close_approach_data [miss_distance = Miss_distance [astronomical = 0.0334252168, kilometers = 5000341, lunar = 13.0024089813, miles = 3107068], relative_velocity = Relative_velocity [miles_per_hour = 34693.209610712, kilometers_per_second = 15.5095040506, kilometers_per_hour = 55834.214582039], close_approach_date = 1945-06-07, orbiting_body = Mars, epoch_date_close_approach = -775328400000]]]



Near Earth Object List Sorted by Miss Distance (Kilometers - Ascending)
Near Earth Object: Name = 21277 (1996 TO5), Miss Distance = 5000341 (Kilometers)
Near Earth Object: Name = (1999 JO6), Miss Distance = 74194080 (Kilometers)

```
