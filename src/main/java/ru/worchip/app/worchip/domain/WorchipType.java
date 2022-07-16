package ru.worchip.app.worchip.domain;

public enum WorchipType {
    Watch("Часы"), Lityrgi("Литургия");
    private final String name;
    WorchipType(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

}
