package org.HW_1;

import org.HW_1.dto.HousingDto;

import java.util.List;

public class Service {

    private final Produces produces= new Produces();


    public double getTotalPriceForHouse(){
        return produces.getHouseList().stream()
                .mapToDouble(house->house.getPrice())
                .sum();
    }

    public double getTotalPriceForVilla(){
        return produces.getVillaList().stream()
                .mapToDouble(house->house.getPrice())
                .sum();
    }

    public double getTotalPriceForSummerHouse(){
        return produces.getSummerHouseList().stream()
                .mapToDouble(house->house.getPrice())
                .sum();
    }

    public double getTotalAllHousingPride(){
        return produces.getHouseingList().stream()
                .mapToDouble(housing -> housing.getPrice())
                .sum();
    }

    public double getAverageWidthForHouse(){
        return produces.getHouseList().stream()
                .mapToInt(house->house.getWidth())
                .average()
                .getAsDouble();
    }

    public double getAverageWidthForVilla(){
        return produces.getVillaList().stream()
                .mapToInt(house->house.getWidth())
                .average()
                .getAsDouble();
    }

    public double getAverageWidthForSummerHouse(){
        return produces.getSummerHouseList().stream()
                .mapToInt(house->house.getWidth())
                .average()
                .getAsDouble();
    }

    public double getAverageAllHousingWidth(){
        return produces.getHouseingList().stream()
                .mapToInt(housing-> housing.getWidth())
                .average()
                .getAsDouble();
    }

    public List<HousingDto> filterByRoomAndLounge(int room, int loung){
        return produces.getHouseingList().stream()
                .filter(housing -> housing.getRoom()==room && housing.getLounge()==loung)
                .toList();
    }

}
