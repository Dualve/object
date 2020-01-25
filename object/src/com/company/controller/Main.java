package com.company.controller;

import com.company.data.House;
import com.company.logic.Sorter;
import com.company.utils.UserInput;
import com.company.view.Printer;

public class Main {

	private static final String MSG = "Input amount of items: ";
	private static final String MSG_ERR = "Exception: ";

	private static final int TEST_ROOMS = 3;
	private static final int TEST_LOWEST_FLOOR = 9;
	private static final int TEST_HIGHEST_FLOOR = 21;
	private static final int TEST_SQUARE = 85;

    public static void main(String[] args) {
    	int amount = 0;

		try{
			amount = UserInput.input(MSG);
		}
		catch(Exception e){
			System.err.println(MSG_ERR + e);
		}

		House[] houses = House.createHouses(amount);

		House[] appropriateHousesByRooms = Sorter.sortByRooms(TEST_ROOMS, houses);
		House[] appropriateHousesByFloor = Sorter.sortByFloor(TEST_LOWEST_FLOOR, TEST_HIGHEST_FLOOR, houses);
		House[] appropriateHousesBySquare = Sorter.sortBySquare(TEST_SQUARE, houses);

		for(House house : appropriateHousesByRooms){
			Printer.printHouse(house);
		}

		Printer.printDivider();

		for(House house : appropriateHousesByFloor){
			Printer.printHouse(house);
		}

		Printer.printDivider();

		for(House house : appropriateHousesBySquare){
			Printer.printHouse(house);
		}
    }
}
