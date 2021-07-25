package com.javaproject.coronavirustracker.models;

public class LocationStats {
    private String state;
    private String country;
    private int latestTotalCases;
    private int diffFromPrevDay;

    public int getDiffFromPrevDay() {
        return diffFromPrevDay;
    }
    public int getLatestTotalCases() {
        return latestTotalCases;
    }
    public void setLatestTotalCases(int latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }
    public void setDiffFromPrevDay(int diffFromPrevDay) {
        this.diffFromPrevDay = diffFromPrevDay;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    
    @Override
    public String toString() {
        return "LocationStats [country=" + country + ", diffFromPrevDay=" + diffFromPrevDay + ", latestTotalCases="
                + latestTotalCases + ", state=" + state + "]";
    }

    
    
    
    
}
