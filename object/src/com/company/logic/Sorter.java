package com.company.logic;

import com.company.data.House;

import java.util.LinkedList;

public class Sorter {

    public static House[] sortByRooms(int lowestBorderOfRooms, House[] houses) {

        LinkedList<House> appropriateHouses = new LinkedList<House>();
        for (House house : houses) {
            if (house.getAmountOfRooms() == lowestBorderOfRooms) {
                appropriateHouses.add(house);
            }
        }

        return appropriateHouses.toArray(new House[0]);
    }

    public static House[] sortByFloor(int lowestBorderOfFloor, int highestBorderOfFloor, House[] houses) {

        LinkedList<House> appropriateHouses = new LinkedList<House>();
        for (House house : houses) {
            if (house.getFloor() > lowestBorderOfFloor && house.getFloor() < highestBorderOfFloor) {
                appropriateHouses.add(house);
            }
        }

        return appropriateHouses.toArray(new House[0]);
    }

    public static House[] sortBySquare(int lowestBorderOfSquare, House[] houses) {

        LinkedList<House> appropriateHouses = new LinkedList<House>();

        for (House house : houses) {
            if (house.getSquare() > lowestBorderOfSquare) {
                appropriateHouses.add(house);
            }
        }

        return appropriateHouses.toArray(new House[0]);
    }
}
