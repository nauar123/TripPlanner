import java.util.ArrayList;

public class Trip {

    protected String country;
    protected int duration;
    protected String city;
    protected String activities;



    public Trip (String country, int duration, String city, String activities)
    {
        this.country = country;
        this.duration = duration;
        this.city = city;
        this.activities = activities;

    }

    public String getCountry()
    {
        return country;
    }
    public int getDuration()
    {
        return duration;
    }
    public String getCity()
    {
        return city;
    }
    public String getActivities()
    {
        return activities;
    }












}
