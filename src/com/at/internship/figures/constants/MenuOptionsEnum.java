package com.at.internship.figures.constants;

public enum MenuOptionsEnum {
	REGISTER("Register a new figure calculation",1)
	,OPEN("Open file with calculation's contents", 2)
	,EXIT("Exit program", 3)
	,WRONG("WRONG", 4);
	
	private final String name;
    private final int option;

    MenuOptionsEnum(String name, int option) {
        this.name = name;
        this.option = option;
    }

    public String getName() {
        return name;
    }

    public int getOption() {
        return option;
    }

}
