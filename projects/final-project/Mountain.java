
public class Mountain implements Comparable<Mountain> {
    private String mountainName;
    private String Country;
    private int Elevation;

    public void setName(String name) {
        mountainName = name;
    }
    public String getName() {
        return mountainName;
    }
    public void setCountry(String country) {
        Country = country;
    }
    public String getCountry() {
        return Country;
    }
    public void setElevation(int elevation) {
        Elevation = elevation;
    }
    public int getElevation() {
        return Elevation;
    }
    public double toMeters() {
        return Elevation / 3.2808;
    }
    @Override
    public int compareTo(Mountain diffMountain) {
        return Integer.compare(this.Elevation, diffMountain.Elevation); //Method found through external research
    }

}