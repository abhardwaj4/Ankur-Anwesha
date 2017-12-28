/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package family.friends.fun.food.drink;

/**
 *
 * @author abhardw7
 */
public class WeekDayException extends RuntimeException {
    
    public WeekDayException() {
        super();
    }
    
    public WeekDayException(String message) {
        super(message);
    }
    
    public WeekDayException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public WeekDayException(Throwable cause) {
        super(cause);
    }
    
}
