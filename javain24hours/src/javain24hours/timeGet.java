/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javain24hours;

import java.time.*;
import java.time.temporal.*;

/**
 *
 * @author bulletmagnet
 */
public class timeGet {
    
    int time;
    
    public int returnTime (int days, int month, int returnTime){
        LocalDateTime get = LocalDateTime.now();
        month = get.getMonthValue();
        days = get.getDayOfMonth();
        System.out.println(month + " month and they " + days +" day");
        
        returnTime = days + month;
        return returnTime;
    }
    
    public static void main (String[] args){
        
    }
    
}
