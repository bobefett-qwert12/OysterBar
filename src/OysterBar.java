public class OysterBar {
    int peopleInBar;

    /**
     * creates a new instance of OysterBar
     * @param peopleInBar the number of people in the bar
     */
    public OysterBar(int peopleInBar) {
        this.peopleInBar = peopleInBar;
    }

    /**
     * adds to the number of people in the bar
     * @param peopleInParty the number of people in the party that is entering/leaving
     */
    public void addToBar(int peopleInParty){
        this.peopleInBar += peopleInParty;
    }

    /**
     * Gets the number of people in the bar
     * @return the number of people in the bar
     */
    public int getPeopleInBar(){
        return this.peopleInBar;
    }
}
