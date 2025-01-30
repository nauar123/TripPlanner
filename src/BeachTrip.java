public class BeachTrip extends Trip {

    private String beachName;
    private Boolean inflatableAnimal;
    private int temparature;


    public BeachTrip(String country,int duration,String city, String activities,String beachName, Boolean inflatableAnimal, int temparature)
    {
        super(country, duration,city, activities);
        this.beachName = beachName;
        this.inflatableAnimal = inflatableAnimal;
        this.temparature = temparature;

    }

    public String getBeachName()
    {
        return beachName;
    }

}
