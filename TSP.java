package com.example.alexhinkle.travelingsalesman;

import java.util.LinkedList;
import java.util.Random;

/**
 * Created by AlexHinkle on 5/2/16.
 */
public class TSP
{
    public static LinkedList<String> createCiy(String[] cities,String[] boarders)
    {
        LinkedList<String> cityList = new LinkedList<String>();
        Random rand = new Random();

        int  c = rand.nextInt(cities.length) + 0;
        int b = rand.nextInt(boarders.length) + 0;
        for(int i = 0; i <= boarders.length; i++)
        {
            if (cityList == null)
            {
                cityList.add(i, cities[i]);
                cityList.add(i +1,boarders[i]);
            }
            else if (i == boarders.length)
            {
              cityList.addLast(cityList.getFirst());

            }
            else {
                cityList.addLast(cities[i]);
                cityList.addLast(boarders[i]);
            }











        }
        System.out.println(cityList);
        return cityList;
    }


}
