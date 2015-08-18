/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celestial.simplemavenwebapp;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author selvy_000
 */
public class TimeAndDateHandler
{
    private Date    theDate;
    private Time    theTime;
    private long    milliSecs;
    
    public  String  getDate()
    {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        theDate = new Date();
        System.out.println(dateFormat.format(theDate)); //2014/08/06 15:59:48
        
        return dateFormat.format(theDate);
    }
    
    public  String  getTime()
    {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        theDate = new Date();
        System.out.println(dateFormat.format(theDate)); //2014/08/06 15:59:48
        
        //return dateFormat.format(theDate);
        return "11:42";
    }
    
    static  public  void    main( String[] args )
    {
        TimeAndDateHandler tadh = new TimeAndDateHandler();
        
        tadh.getDate();
        tadh.getTime();
    }
}
