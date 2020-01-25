package com.company.data;

import java.util.Random;

public class House {

    private static final int MIN_VALUE = 1;
    private static final int MIN_ID = 100000;
    private static final int MAX_ID = 900000;
    private static final int MAX_NUM_OF_FLAT = 300;
    private static final int MIN_SQUARE = 15;
    private static final int MAX_SQUARE = 200;
    private static final int MAX_ROOM = 5;
    private static final int MAX_FLOOR = 30;
    private static final String[] STREETS = {"st.Petrovka", "st.Valnichka", "st.Galicino", "st.Bogdanos"};

    private int id;
    private int numOfFlat;
    private int square;
    private int amountOfRooms;
    private int floor;
    private String street;

    {
        numOfFlat = MIN_VALUE;
        floor = MIN_VALUE;
    }

    House(int id, int numOfFlat, int square, int amountOfRooms, int floor, String street) {
        this.id = id;
        this.numOfFlat = numOfFlat;
        this.square = square;
        this.amountOfRooms = amountOfRooms;
        this.street = street;
        this.floor = floor;
    }

    House(int id, int numOfFlat, int square, int amountOfRooms, String street) {
        this.id = id;
        this.numOfFlat = numOfFlat;
        this.square = square;
        this.amountOfRooms = amountOfRooms;
        this.street = street;
    }

    House(int id, int square, int amountOfRooms, String street) {
        this.id = id;
        this.square = square;
        this.amountOfRooms = amountOfRooms;
        this.street = street;
    }

    public int getId() {
        return id;
    }

    public int getNumOfFlat() {
        return numOfFlat;
    }

    public int getSquare() {
        return square;
    }

    public int getAmountOfRooms() {
        return amountOfRooms;
    }

    public int getFloor() {
        return floor;
    }

    public String getStreet() {
        return street;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumOfFlat(int numOfFlat) {
        this.numOfFlat = numOfFlat;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public void setAmountOfRooms(int amountOfRooms) {
        this.amountOfRooms = amountOfRooms;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", numOfFlat=" + numOfFlat +
                ", square=" + square +
                ", amountOfRooms=" + amountOfRooms +
                ", floor=" + floor +
                ", street='" + street + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return getId() == house.getId() &&
                getNumOfFlat() == house.getNumOfFlat() &&
                getSquare() == house.getSquare() &&
                getAmountOfRooms() == house.getAmountOfRooms() &&
                getFloor() == house.getFloor() &&
                getStreet().equals(house.getStreet());
    }

    public static House[] createHouses(int amount) {
        Random rand = new Random();
        House[] houses = new House[amount];

        for (int i = 0; i < amount; i++) {
            int id = MIN_ID + rand.nextInt(MAX_ID);
            int numOfFlat = MIN_VALUE + rand.nextInt(MAX_NUM_OF_FLAT);
            int square = MIN_SQUARE + rand.nextInt(MAX_SQUARE);
            int amountOfRooms = MIN_VALUE + rand.nextInt(MAX_ROOM);
            int floor = MIN_VALUE + rand.nextInt(MAX_FLOOR);
            String street = STREETS[rand.nextInt(STREETS.length - MIN_VALUE)];

            houses[i] = new House(id, numOfFlat, square, amountOfRooms, floor, street);
        }

        return houses;
    }

}

