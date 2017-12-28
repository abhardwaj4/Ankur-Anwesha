/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package family.friends.fun.food.drink;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 *
 * @author abhardw7
 */
public class URL {
    public static void getVenueMap(String url) {
        if(Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(new URI("https://www.google.com"));
            } catch (URISyntaxException | IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
