package family.friends.fun.food.drink;

import java.util.Calendar;
import java.util.TimeZone;

/**
 * WEDDING INVITATION This is fully cross platform compilable and runnable
 * invitation.
 *
 * @author Ankur <3 Anwesha
 */
public class Invitation {

    private static final boolean leavesApproved = true;

    /**
     * Hey Dear Super friends, I am going to extend my life with Anwesha. Here
     * are the details.
     *
     * @return Best Wishes to us.
     */
    public String lifeMainEvent() {
        // instantiate the newly wed couple
        Couple couple = new Couple();
        try {
            if (leavesApproved) {
                //  You are invited to our wedding
                String groom = new String("Ankur");
                String bride = new String("Anwesha");

                Calendar weddingDate = Calender.getShubMuhurutham();
                // 24-Jan-2018 20:00 hours Kolkata Time
                weddingDate.set(2018, 0, 24, 20, 00, 00);
                weddingDate.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));

                couple.wedLock(bride.concat(groom));

                // Venue TODO Sonar defect empty string literal
                URL.getVenueMap("");
            }
        } catch (WeekDayException ex) {
            Calendar receptionDate = Calendar.getInstance();
            // 28-Jan-2018 20:00 hours IST
            receptionDate.set(2018, 0, 28, 20, 00, 00);
            receptionDate.setTimeZone(TimeZone.getTimeZone("IST"));

            /**
             * Venue: Geet Govind, Haridwar Main Rd, Adarsh Nagar, Model Colony,
             * Jwalapur, Uttarakhand 249410, India
             */
            URL.getVenueMap("https://goo.gl/h6pEzp");
        } finally {
            formoredetails.launch("aanda4ever.vegas");
            contactus.at("ankurmahe@gmail.com");
            callus.at("+1-206-604-2182");
        }
        return "Best wishes to us - See you there!!!";
    }

    public static void main(String[] args) {
        System.out.println(new Invitation().lifeMainEvent());
    }
}
