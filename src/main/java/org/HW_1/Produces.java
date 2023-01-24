package org.HW_1;



import org.HW_1.dto.HouseDto;
import org.HW_1.dto.HousingDto;
import org.HW_1.dto.SummerHouseDto;
import org.HW_1.dto.VillaDto;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Produces {

    //House Objects

    private HouseDto house1 = new HouseDto(200000.0,65,1,1,"house");
    private HouseDto house2 = new HouseDto(350000.0,90,2,1,"house");
    private HouseDto house3 = new HouseDto(500000.0,120,3,1,"house");

    //Villa Objects
    private VillaDto villa1 = new VillaDto(1000000.0,150,3,1,"villa");
    private VillaDto villa2 = new VillaDto(1500000.0,160,4,1,"villa");
    private VillaDto villa3 = new VillaDto(1700000.0,210,5,1,"villa");


    //Summer House Objects
    private SummerHouseDto summerHouse1 = new SummerHouseDto(900000.0,90,2,1,"summer house");
    private SummerHouseDto summerHouse2 = new SummerHouseDto(1200000.0,115,3,1,"summer house");
    private SummerHouseDto summerHouse3 = new SummerHouseDto(1000000.0,70,2,1,"summer house");


    public List<HouseDto> getHouseList(){
        return Arrays.asList(house1,house2,house3);
    }

    public List<VillaDto> getVillaList(){
        return Arrays.asList(villa1,villa2,villa3);
    }

    public List<SummerHouseDto> getSummerHouseList(){
        return Arrays.asList(summerHouse1,summerHouse2,summerHouse3);
    }

    public List<HousingDto> getHouseingList(){
        List<HousingDto> housingDtoList = Stream.
                of(getHouseList(),getSummerHouseList(),getVillaList())
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        return housingDtoList;
    }



}
