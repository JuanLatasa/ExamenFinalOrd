package ufv.dis.final2021;

import com.google.gson.Gson;
import java.io.FileWriter;

// import java.io.IOException;
import java.util.List;

 class DatosPersonas {
     private Persona[] personas;
}
    class Persona {
        private long ip_from;
        private long ip_to;
        private String country_code;
        private String Spain;
        private String region_name;
        private String city_name;
        private int latitude;
        private int longitude;
        private long zip_code;
        private String time_zone;


        public long getIp_from() {
            return ip_from;
        }

        public void setIp_from(long ip_from) {
            this.ip_from = ip_from;
        }

        public long getIp_to() {
            return ip_to;
        }

        public void setIp_to(long ip_to) {
            this.ip_to = ip_to;
        }

        public String getCountry_code() {
            return country_code;
        }

        public void setCountry_code(String country_code) {
            this.country_code = country_code;
        }

        public String getSpain() {
            return Spain;
        }

        public void setSpain(String spain) {
            Spain = spain;
        }

        public String getRegion_name() {
            return region_name;
        }

        public void setRegion_name(String region_name) {
            this.region_name = region_name;
        }

        public String getCity_name() {
            return city_name;
        }

        public void setCity_name(String city_name) {
            this.city_name = city_name;
        }

        public int getLatitude() {
            return latitude;
        }

        public void setLatitude(int latitude) {
            this.latitude = latitude;
        }

        public int getLongitude() {
            return longitude;
        }

        public void setLongitude(int longitude) {
            this.longitude = longitude;
        }

        public long getZip_code() {
            return zip_code;
        }

        public void setZip_code(long zip_code) {
            this.zip_code = zip_code;
        }

        public String getTime_zone() {
            return time_zone;
        }

        public void setTime_zone(String time_zone) {
            this.time_zone = time_zone;
        }

    }
}