public class BeachTrip extends Trip {

    private String beachName;
    private Boolean inflatableAnimal;
    private int temparature;


    public BeachTrip(String country,int duration, String city, String activities,String beachName)
    {
         this.country = country;
         this.duration = duration;
         this.city = city;
         this.activities = activities;
         this.beachName = beachName;
    }

    public String getBeachName()
    {
        return beachName;
    }

}
