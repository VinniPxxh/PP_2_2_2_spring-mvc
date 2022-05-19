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
        carList.add(new Car("ВАЗ 2101","Белая",1979,80000));
        carList.add(new Car("ВАЗ 2103", "Красная", 1983,100000));
        carList.add(new Car("ВАЗ 2113","Черная",2010,120000));
        carList.add(new Car("ВАЗ 2114","Серебристая" ,2011,140000));
        carList.add(new Car("ВАЗ 2115", "Синяя", 2013,150000));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
