package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImp implements CarDao{
    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("VAZ 2101","White",1979,80000));
        carList.add(new Car("VAZ 2103", "Red", 1983,100000));
        carList.add(new Car("VAZ 2113","Black",2010,120000));
        carList.add(new Car("VAZ 2114","Silver" ,2011,140000));
        carList.add(new Car("VAZ 2115", "Blue", 2013,150000));
        carList.add(new Car("Buhanka", "Green", 1974,500000));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
