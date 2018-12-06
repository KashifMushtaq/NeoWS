
/**
 * NeoWs class is Java Representation of JSON object returned by: Neo - Browse
 * Browse the overall Asteroid data-set GET
 * https://api.nasa.gov/neo/rest/v1/neo/browse/
 *
 * @author Kashif Mushtaq
 */
import java.util.Arrays;
import java.util.Comparator;

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

class Close_approach_data {

    private Miss_distance miss_distance;

    private Relative_velocity relative_velocity;

    private String close_approach_date;

    private String orbiting_body;

    private String epoch_date_close_approach;

    public Miss_distance getMiss_distance() {
        return miss_distance;
    }

    public void setMiss_distance(Miss_distance miss_distance) {
        this.miss_distance = miss_distance;
    }

    public Relative_velocity getRelative_velocity() {
        return relative_velocity;
    }

    public void setRelative_velocity(Relative_velocity relative_velocity) {
        this.relative_velocity = relative_velocity;
    }

    public String getClose_approach_date() {
        return close_approach_date;
    }

    public void setClose_approach_date(String close_approach_date) {
        this.close_approach_date = close_approach_date;
    }

    public String getOrbiting_body() {
        return orbiting_body;
    }

    public void setOrbiting_body(String orbiting_body) {
        this.orbiting_body = orbiting_body;
    }

    public String getEpoch_date_close_approach() {
        return epoch_date_close_approach;
    }

    public void setEpoch_date_close_approach(String epoch_date_close_approach) {
        this.epoch_date_close_approach = epoch_date_close_approach;
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName() + " [miss_distance = " + miss_distance + ", relative_velocity = " + relative_velocity + ", close_approach_date = " + close_approach_date + ", orbiting_body = " + orbiting_body + ", epoch_date_close_approach = " + epoch_date_close_approach + "]";
    }
}

class Relative_velocity {

    private String miles_per_hour;

    private String kilometers_per_second;

    private String kilometers_per_hour;

    public String getMiles_per_hour() {
        return miles_per_hour;
    }

    public void setMiles_per_hour(String miles_per_hour) {
        this.miles_per_hour = miles_per_hour;
    }

    public String getKilometers_per_second() {
        return kilometers_per_second;
    }

    public void setKilometers_per_second(String kilometers_per_second) {
        this.kilometers_per_second = kilometers_per_second;
    }

    public String getKilometers_per_hour() {
        return kilometers_per_hour;
    }

    public void setKilometers_per_hour(String kilometers_per_hour) {
        this.kilometers_per_hour = kilometers_per_hour;
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName() + " [miles_per_hour = " + miles_per_hour + ", kilometers_per_second = " + kilometers_per_second + ", kilometers_per_hour = " + kilometers_per_hour + "]";
    }
}

class Feet {

    private String estimated_diameter_min;

    private String estimated_diameter_max;

    public String getEstimated_diameter_min() {
        return estimated_diameter_min;
    }

    public void setEstimated_diameter_min(String estimated_diameter_min) {
        this.estimated_diameter_min = estimated_diameter_min;
    }

    public String getEstimated_diameter_max() {
        return estimated_diameter_max;
    }

    public void setEstimated_diameter_max(String estimated_diameter_max) {
        this.estimated_diameter_max = estimated_diameter_max;
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName() + " [estimated_diameter_min = " + estimated_diameter_min + ", estimated_diameter_max = " + estimated_diameter_max + "]";
    }
}

class Miles {

    private String estimated_diameter_min;

    private String estimated_diameter_max;

    public String getEstimated_diameter_min() {
        return estimated_diameter_min;
    }

    public void setEstimated_diameter_min(String estimated_diameter_min) {
        this.estimated_diameter_min = estimated_diameter_min;
    }

    public String getEstimated_diameter_max() {
        return estimated_diameter_max;
    }

    public void setEstimated_diameter_max(String estimated_diameter_max) {
        this.estimated_diameter_max = estimated_diameter_max;
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName() + " [estimated_diameter_min = " + estimated_diameter_min + ", estimated_diameter_max = " + estimated_diameter_max + "]";
    }
}

class Estimated_diameter {

    private Meters meters;

    private Feet feet;

    private Kilometers kilometers;

    private Miles miles;

    public Meters getMeters() {
        return meters;
    }

    public void setMeters(Meters meters) {
        this.meters = meters;
    }

    public Feet getFeet() {
        return feet;
    }

    public void setFeet(Feet feet) {
        this.feet = feet;
    }

    public Kilometers getKilometers() {
        return kilometers;
    }

    public void setKilometers(Kilometers kilometers) {
        this.kilometers = kilometers;
    }

    public Miles getMiles() {
        return miles;
    }

    public void setMiles(Miles miles) {
        this.miles = miles;
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName() + " [meters = " + meters + ", feet = " + feet + ", kilometers = " + kilometers + ", miles = " + miles + "]";
    }
}

class Near_earth_objects implements Comparable {

    private Orbital_data orbital_data;

    private String nasa_jpl_url;

    private String is_sentry_object;

    private String absolute_magnitude_h;

    private String name;

    private Estimated_diameter estimated_diameter;

    private String designation;

    private Links links;

    private String is_potentially_hazardous_asteroid;

    private String neo_reference_id;

    private Close_approach_data[] close_approach_data;

    public Orbital_data getOrbital_data() {
        return orbital_data;
    }

    public void setOrbital_data(Orbital_data orbital_data) {
        this.orbital_data = orbital_data;
    }

    public String getNasa_jpl_url() {
        return nasa_jpl_url;
    }

    public void setNasa_jpl_url(String nasa_jpl_url) {
        this.nasa_jpl_url = nasa_jpl_url;
    }

    public String getIs_sentry_object() {
        return is_sentry_object;
    }

    public void setIs_sentry_object(String is_sentry_object) {
        this.is_sentry_object = is_sentry_object;
    }

    public String getAbsolute_magnitude_h() {
        return absolute_magnitude_h;
    }

    public void setAbsolute_magnitude_h(String absolute_magnitude_h) {
        this.absolute_magnitude_h = absolute_magnitude_h;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Estimated_diameter getEstimated_diameter() {
        return estimated_diameter;
    }

    public void setEstimated_diameter(Estimated_diameter estimated_diameter) {
        this.estimated_diameter = estimated_diameter;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public String getIs_potentially_hazardous_asteroid() {
        return is_potentially_hazardous_asteroid;
    }

    public void setIs_potentially_hazardous_asteroid(String is_potentially_hazardous_asteroid) {
        this.is_potentially_hazardous_asteroid = is_potentially_hazardous_asteroid;
    }

    public String getNeo_reference_id() {
        return neo_reference_id;
    }

    public void setNeo_reference_id(String neo_reference_id) {
        this.neo_reference_id = neo_reference_id;
    }

    public Close_approach_data[] getClose_approach_data() {
        return close_approach_data;
    }

    public void setClose_approach_data(Close_approach_data[] close_approach_data) {
        this.close_approach_data = close_approach_data;
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName() + " [orbital_data = " + orbital_data + ", nasa_jpl_url = " + nasa_jpl_url + ", is_sentry_object = " + is_sentry_object + ", absolute_magnitude_h = " + absolute_magnitude_h + ", name = " + name + ", estimated_diameter = " + estimated_diameter + ", designation = " + designation + ", links = " + links + ", is_potentially_hazardous_asteroid = " + is_potentially_hazardous_asteroid + ", neo_reference_id = " + neo_reference_id + ", close_approach_data = " + Arrays.toString(close_approach_data) + "]";
    }

    /*Comparator for sorting the list by  getEstimated_diameter_max*/
    public static Comparator<Near_earth_objects> compDiameterInKM = new Comparator<>() {

        public int compare(Near_earth_objects s1, Near_earth_objects s2) {
            Double d1 = Double.parseDouble(s1.getEstimated_diameter().getKilometers().getEstimated_diameter_max());
            Double d2 = Double.parseDouble(s2.getEstimated_diameter().getKilometers().getEstimated_diameter_max());
            Double r = d2 - d1;
            return r.intValue();
        }
    };

    /*Comparator for sorting the list by  getEstimated_diameter_max*/
    public static Comparator<Near_earth_objects> compMiss_distance = new Comparator<>() {

        public int compare(Near_earth_objects s1, Near_earth_objects s2) {
            Close_approach_data[] c1 = s1.getClose_approach_data();
            Close_approach_data[] c2 = s1.getClose_approach_data();
            if(c1.length>0 && c2.length>0) {
                Double d1 = Double.parseDouble(c1[0].getMiss_distance().getKilometers());
                Double d2 = Double.parseDouble(c2[0].getMiss_distance().getKilometers());
                Double r = d2 - d1;
                return r.intValue();
            } else {
                return Integer.MAX_VALUE;
            }
        }
    };
    
    @Override
    public int compareTo(Object o) {
        Near_earth_objects s1 = (Near_earth_objects) o;
        Double d1 = Double.parseDouble(s1.getEstimated_diameter().getKilometers().getEstimated_diameter_max());
        Double d2 = Double.parseDouble(this.getEstimated_diameter().getKilometers().getEstimated_diameter_max());
        Double r = d2 - d1;
        return r.intValue();
    }
}

class Kilometers {

    private String estimated_diameter_min;

    private String estimated_diameter_max;

    public String getEstimated_diameter_min() {
        return estimated_diameter_min;
    }

    public void setEstimated_diameter_min(String estimated_diameter_min) {
        this.estimated_diameter_min = estimated_diameter_min;
    }

    public String getEstimated_diameter_max() {
        return estimated_diameter_max;
    }

    public void setEstimated_diameter_max(String estimated_diameter_max) {
        this.estimated_diameter_max = estimated_diameter_max;
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName() + " [estimated_diameter_min = " + estimated_diameter_min + ", estimated_diameter_max = " + estimated_diameter_max + "]";
    }
}

class Meters {

    private String estimated_diameter_min;

    private String estimated_diameter_max;

    public String getEstimated_diameter_min() {
        return estimated_diameter_min;
    }

    public void setEstimated_diameter_min(String estimated_diameter_min) {
        this.estimated_diameter_min = estimated_diameter_min;
    }

    public String getEstimated_diameter_max() {
        return estimated_diameter_max;
    }

    public void setEstimated_diameter_max(String estimated_diameter_max) {
        this.estimated_diameter_max = estimated_diameter_max;
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName() + " [estimated_diameter_min = " + estimated_diameter_min + ", estimated_diameter_max = " + estimated_diameter_max + "]";
    }
}

class Orbit_class {

    private String orbit_class_range;

    private String orbit_class_description;

    private String orbit_class_type;

    public String getOrbit_class_range() {
        return orbit_class_range;
    }

    public void setOrbit_class_range(String orbit_class_range) {
        this.orbit_class_range = orbit_class_range;
    }

    public String getOrbit_class_description() {
        return orbit_class_description;
    }

    public void setOrbit_class_description(String orbit_class_description) {
        this.orbit_class_description = orbit_class_description;
    }

    public String getOrbit_class_type() {
        return orbit_class_type;
    }

    public void setOrbit_class_type(String orbit_class_type) {
        this.orbit_class_type = orbit_class_type;
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName() + " [orbit_class_range = " + orbit_class_range + ", orbit_class_description = " + orbit_class_description + ", orbit_class_type = " + orbit_class_type + "]";
    }
}

class Links {

    private String self;
    private String next;

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName() + " [self = " + self + ", next = " + next + "]";
    }
}

class Miss_distance {

    private String astronomical;

    private String kilometers;

    private String lunar;

    private String miles;

    public String getAstronomical() {
        return astronomical;
    }

    public void setAstronomical(String astronomical) {
        this.astronomical = astronomical;
    }

    public String getKilometers() {
        return kilometers;
    }

    public void setKilometers(String kilometers) {
        this.kilometers = kilometers;
    }

    public String getLunar() {
        return lunar;
    }

    public void setLunar(String lunar) {
        this.lunar = lunar;
    }

    public String getMiles() {
        return miles;
    }

    public void setMiles(String miles) {
        this.miles = miles;
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName() + " [astronomical = " + astronomical + ", kilometers = " + kilometers + ", lunar = " + lunar + ", miles = " + miles + "]";
    }
}

class Orbital_data {

    private String mean_motion;

    private String aphelion_distance;

    private String last_observation_date;

    private String mean_anomaly;

    private String inclination;

    private String orbit_uncertainty;

    private String eccentricity;

    private Orbit_class orbit_class;

    private String perihelion_time;

    private String data_arc_in_days;

    private String minimum_orbit_intersection;

    private String perihelion_argument;

    private String epoch_osculation;

    private String jupiter_tisserand_invariant;

    private String orbital_period;

    private String orbit_id;

    private String ascending_node_longitude;

    private String orbit_determination_date;

    private String semi_major_axis;

    private String first_observation_date;

    private String equinox;

    private String observations_used;

    private String perihelion_distance;

    public String getMean_motion() {
        return mean_motion;
    }

    public void setMean_motion(String mean_motion) {
        this.mean_motion = mean_motion;
    }

    public String getAphelion_distance() {
        return aphelion_distance;
    }

    public void setAphelion_distance(String aphelion_distance) {
        this.aphelion_distance = aphelion_distance;
    }

    public String getLast_observation_date() {
        return last_observation_date;
    }

    public void setLast_observation_date(String last_observation_date) {
        this.last_observation_date = last_observation_date;
    }

    public String getMean_anomaly() {
        return mean_anomaly;
    }

    public void setMean_anomaly(String mean_anomaly) {
        this.mean_anomaly = mean_anomaly;
    }

    public String getInclination() {
        return inclination;
    }

    public void setInclination(String inclination) {
        this.inclination = inclination;
    }

    public String getOrbit_uncertainty() {
        return orbit_uncertainty;
    }

    public void setOrbit_uncertainty(String orbit_uncertainty) {
        this.orbit_uncertainty = orbit_uncertainty;
    }

    public String getEccentricity() {
        return eccentricity;
    }

    public void setEccentricity(String eccentricity) {
        this.eccentricity = eccentricity;
    }

    public Orbit_class getOrbit_class() {
        return orbit_class;
    }

    public void setOrbit_class(Orbit_class orbit_class) {
        this.orbit_class = orbit_class;
    }

    public String getPerihelion_time() {
        return perihelion_time;
    }

    public void setPerihelion_time(String perihelion_time) {
        this.perihelion_time = perihelion_time;
    }

    public String getData_arc_in_days() {
        return data_arc_in_days;
    }

    public void setData_arc_in_days(String data_arc_in_days) {
        this.data_arc_in_days = data_arc_in_days;
    }

    public String getMinimum_orbit_intersection() {
        return minimum_orbit_intersection;
    }

    public void setMinimum_orbit_intersection(String minimum_orbit_intersection) {
        this.minimum_orbit_intersection = minimum_orbit_intersection;
    }

    public String getPerihelion_argument() {
        return perihelion_argument;
    }

    public void setPerihelion_argument(String perihelion_argument) {
        this.perihelion_argument = perihelion_argument;
    }

    public String getEpoch_osculation() {
        return epoch_osculation;
    }

    public void setEpoch_osculation(String epoch_osculation) {
        this.epoch_osculation = epoch_osculation;
    }

    public String getJupiter_tisserand_invariant() {
        return jupiter_tisserand_invariant;
    }

    public void setJupiter_tisserand_invariant(String jupiter_tisserand_invariant) {
        this.jupiter_tisserand_invariant = jupiter_tisserand_invariant;
    }

    public String getOrbital_period() {
        return orbital_period;
    }

    public void setOrbital_period(String orbital_period) {
        this.orbital_period = orbital_period;
    }

    public String getOrbit_id() {
        return orbit_id;
    }

    public void setOrbit_id(String orbit_id) {
        this.orbit_id = orbit_id;
    }

    public String getAscending_node_longitude() {
        return ascending_node_longitude;
    }

    public void setAscending_node_longitude(String ascending_node_longitude) {
        this.ascending_node_longitude = ascending_node_longitude;
    }

    public String getOrbit_determination_date() {
        return orbit_determination_date;
    }

    public void setOrbit_determination_date(String orbit_determination_date) {
        this.orbit_determination_date = orbit_determination_date;
    }

    public String getSemi_major_axis() {
        return semi_major_axis;
    }

    public void setSemi_major_axis(String semi_major_axis) {
        this.semi_major_axis = semi_major_axis;
    }

    public String getFirst_observation_date() {
        return first_observation_date;
    }

    public void setFirst_observation_date(String first_observation_date) {
        this.first_observation_date = first_observation_date;
    }

    public String getEquinox() {
        return equinox;
    }

    public void setEquinox(String equinox) {
        this.equinox = equinox;
    }

    public String getObservations_used() {
        return observations_used;
    }

    public void setObservations_used(String observations_used) {
        this.observations_used = observations_used;
    }

    public String getPerihelion_distance() {
        return perihelion_distance;
    }

    public void setPerihelion_distance(String perihelion_distance) {
        this.perihelion_distance = perihelion_distance;
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName() + " [mean_motion = " + mean_motion + ", aphelion_distance = " + aphelion_distance + ", last_observation_date = " + last_observation_date + ", mean_anomaly = " + mean_anomaly + ", inclination = " + inclination + ", orbit_uncertainty = " + orbit_uncertainty + ", eccentricity = " + eccentricity + ", orbit_class = " + orbit_class + ", perihelion_time = " + perihelion_time + ", data_arc_in_days = " + data_arc_in_days + ", minimum_orbit_intersection = " + minimum_orbit_intersection + ", perihelion_argument = " + perihelion_argument + ", epoch_osculation = " + epoch_osculation + ", jupiter_tisserand_invariant = " + jupiter_tisserand_invariant + ", orbital_period = " + orbital_period + ", orbit_id = " + orbit_id + ", ascending_node_longitude = " + ascending_node_longitude + ", orbit_determination_date = " + orbit_determination_date + ", semi_major_axis = " + semi_major_axis + ", first_observation_date = " + first_observation_date + ", equinox = " + equinox + ", observations_used = " + observations_used + ", perihelion_distance = " + perihelion_distance + "]";
    }
}

class Page {

    private String total_elements;

    private String total_pages;

    private String number;

    private String size;

    public String getTotal_elements() {
        return total_elements;
    }

    public void setTotal_elements(String total_elements) {
        this.total_elements = total_elements;
    }

    public String getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(String total_pages) {
        this.total_pages = total_pages;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName() + " [total_elements = " + total_elements + ", total_pages = " + total_pages + ", number = " + number + ", size = " + size + "]";
    }
}
