/**
 * Created by chen4393 on 4/30/17.
 */
public class WeatherRecord {
    private String city;
    private String country;
    private double longitude;
    private double latitude;
    private double temperature;
    private double minimum;
    private double maximum;
    private String description;

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getMinimum() {
        return minimum;
    }

    public double getMaximum() {
        return maximum;
    }

    public String getDescription() {
        return description;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setMinimum(double minimum) {
        this.minimum = minimum;
    }

    public void setMaximum(double maximum) {
        this.maximum = maximum;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
