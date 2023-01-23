package org.HW_1.dto;


public class HouseDto extends HousingDto {

    private int c;

    public HouseDto(double price, int width, int room, int lounge,String type,int c) {
        super(price, width, room, lounge, type);
        this.c=c;
    }




}
