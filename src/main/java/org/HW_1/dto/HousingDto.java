package org.HW_1.dto;


public class HousingDto {

    private double price;
    private int width;
    private int room;
    private int lounge;
    private String type;

    public HousingDto(double price, int width, int room, int lounge, String type) {
        this.price = price;
        this.width = width;
        this.room = room;
        this.lounge = lounge;
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public int getLounge() {
        return lounge;
    }

    public void setLounge(int lounge) {
        this.lounge = lounge;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
