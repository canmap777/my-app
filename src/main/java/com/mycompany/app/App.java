package com.mycompany.app;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println( " Welcome to Jenkins Demo!" );
        System.out.println( "Pipeline!" );
        System.out.println( "Multi-branch Pipeline" );
        System.out.println( " ****************************************************************************************************" );
        System.out.println( " Change 1 --> 21:01" );

        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Calendar calobj = Calendar.getInstance();
        System.out.println(df.format(calobj.getTime()));
        
        
    }
}
