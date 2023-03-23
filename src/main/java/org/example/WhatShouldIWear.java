package org.example;
import java.util.Scanner;
public class WhatShouldIWear {
    public static void main(String[] args) {
        System.out.println("First Question: What's the weather like today?");
        System.out.println("Second Question: What is the temperature outside today?");

        Scanner reader = new Scanner(System.in);
        String randomWeather = reader.nextLine();
        int randomTemp = reader.nextInt();


        if (randomWeather.equalsIgnoreCase("cloudy") && randomTemp < 25 && randomTemp >10) {
            System.out.println("Wear a hoodie or jacket");
        } else if (randomWeather.equalsIgnoreCase("cloudy") && randomTemp < 10) {
            System.out.println("Its too cold, wear thick clothes, jacket and gloves");
        } else if (randomWeather.equalsIgnoreCase("cloudy") && randomTemp > 25 && randomTemp < 37) {
            System.out.println("Wear lighter clothing");
        } else if (randomWeather.equalsIgnoreCase("cloudy") && randomTemp > 37 ) {
            System.out.println("Dress light  (e.g. vest) and stay indoors, its too hot!");
        }
        else if (randomWeather.equalsIgnoreCase("windy") && randomTemp < 25 && randomTemp > 10) {
            System.out.println("Wear a hoodie or jacket");
        } else if (randomWeather.equalsIgnoreCase("windy") && randomTemp > 25 && randomTemp < 37) {
            System.out.println("Wear lighter clothing");
        }else if (randomWeather.equalsIgnoreCase("windy") && randomTemp < 10) {
            System.out.println("Its too cold, wear thick clothes, jacket and gloves lest the wind punish you!");
        } else if (randomWeather.equalsIgnoreCase("windy") && randomTemp > 37 ) {
            System.out.println("Dress light  (e.g. vest) and stay indoors, its too hot despite the wind");
        }
        else if (randomWeather.equalsIgnoreCase("sunny") && randomTemp < 25 && randomTemp > 10) {
            System.out.println("Wear a light hoodie");
        } else if (randomWeather.equalsIgnoreCase("sunny") && randomTemp > 25 && randomTemp < 37) {
            System.out.println("Wear lighter clothing like a vest or shirt and enjoy the sun!");
        } else if (randomWeather.equalsIgnoreCase("sunny") && randomTemp < 10) {
            System.out.println("Its too cold, wear thick clothes, jacket and gloves");
        } else if (randomWeather.equalsIgnoreCase("sunny") && randomTemp > 37 ) {
            System.out.println("Dress light  (e.g. vest) and stay indoors, its way too hot!");
        }
        else if (randomWeather.equalsIgnoreCase("snowing") && randomTemp > 25 && randomTemp < 37) {
            System.out.println("Wear a light hoodie, gloves, and go have a snow fight!");
        } else if (randomWeather.equalsIgnoreCase("snowing") && randomTemp < 25 && randomTemp > 10) {
            System.out.println("Definitely Wear a Jacket, gloves and thick clothing it's cold!");
        } else if (randomWeather.equalsIgnoreCase("Snowing") && randomTemp < 10) {
            System.out.println("Its too cold, wear thick clothes, jacket and gloves");
        } else if (randomWeather.equalsIgnoreCase("Snowing") && randomTemp > 37 ) {
            System.out.println("Dress light  (e.g. vest) and stay indoors, its too hot and snow has probably melted");
        }
        else if (randomWeather.equalsIgnoreCase("raining") && randomTemp < 25 && randomTemp > 10) {
            System.out.println("Wear a hoodie or jacket it's cold and wet");
        } else if (randomWeather.equalsIgnoreCase("raining") && randomTemp > 25 && randomTemp < 37) {
            System.out.println("Wear lighter clothing like a jumper, shirt and or bring an umbrella");
        } else if (randomWeather.equalsIgnoreCase("Raining") && randomTemp < 10) {
            System.out.println("Its too cold, wear thick clothes, jacket and gloves");
        } else if (randomWeather.equalsIgnoreCase("Raining") && randomTemp > 37 ) {
            System.out.println("Dress light  (e.g. vest) and stay indoors, its too hot");
        }
    }
}

