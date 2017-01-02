package mock.automation;

/**
 * Created by Tunde on 21/12/2016.
 */
public class GovernmentCrownCourt {
    private final Government gov;

    public GovernmentCrownCourt(Government gov) {
        this.gov = gov;
    }

    public void resumeWorkForLawyers(){
        if(gov.getPmName().contains("Theresa")){
            System.out.println("We are going on back to work...");
        }else {
            System.out.println("We are still on strike...");
        }
    }
}
