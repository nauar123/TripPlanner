public class SkiTrip extends Trip {

    private String location;
    private String typeOfGear;
    private String liftCardPrice;

    public SkiTrip(String country, int duration, String city, String activities,String location,String typeOfGear,String liftCardPrice)
    {
        super(country, duration, city, activities);
        this.location = location;
        this.typeOfGear = typeOfGear;
        this.liftCardPrice = liftCardPrice;
    }



}
