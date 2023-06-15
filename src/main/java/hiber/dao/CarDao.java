package hiber.dao;

import hiber.model.Car;

import java.util.List;

/**
 * \* Create by Prekrasnov Sergei
 * \
 */

public interface CarDao {
    void add(Car car);

    List<Car> listCars();
}