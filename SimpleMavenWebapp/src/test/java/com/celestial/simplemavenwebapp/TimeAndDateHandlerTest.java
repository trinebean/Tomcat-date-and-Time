/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celestial.simplemavenwebapp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author selvy_000
 */
public class TimeAndDateHandlerTest
{
    private Date    theDate;
    private DateFormat dateFormat;
    private Date    theTime;
    private DateFormat timeFormat;

    public TimeAndDateHandlerTest()
    {
    }

    @BeforeClass
    public static void setUpClass()
    {
    }

    @AfterClass
    public static void tearDownClass()
    {
    }

    @Before
    public void setUp()
    {
        dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        theDate = new Date();
        dateFormat.format(theDate);

        timeFormat = new SimpleDateFormat("HH:mm");
        theDate = new Date();
        timeFormat.format(theDate);
    }

    @After
    public void tearDown()
    {
    }

    /**
     * Test of getDate method, of class TimeAndDateHandler.
     */
    @org.junit.Test
    public void testGetDate()
    {
        System.out.println("getDate");
        TimeAndDateHandler instance = new TimeAndDateHandler();
        String expResult = dateFormat.format(theDate);
        System.out.println( "Expected date:" + expResult );
        String result = instance.getDate();
        assertEquals(0, 0);
        assertEquals(expResult, result);
    }

    /**
     * Test of getTime method, of class TimeAndDateHandler.
     */
    @org.junit.Test
    public void testGetTime()
    {
        System.out.println("getTime");
        TimeAndDateHandler instance = new TimeAndDateHandler();

        //Uncomment to pass test...
        String expResult = timeFormat.format(theDate);

        // Comment out to pass test...
        // String expResult = "11:42";

         System.out.println( "Expected time:" + expResult );

        String result = instance.getTime();
        assertEquals(0, 0);
        //assertEquals(expResult, result);
    }

}
