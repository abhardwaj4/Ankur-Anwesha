package family.friends.fun.food.drink;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * WEDDING INVITATION.
 *
 * @author Ankur <3 Anwesha
 */
public class URL {
    public static void getVenueMap(String url) {
        if(Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(new URI(url));
            } catch (URISyntaxException | IOException ex) {
                // eat it. no errors or exceptions for this wedding
            }
        }
    }
}
