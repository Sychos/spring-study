package com.madg.spring;

import org.springframework.beans.factory.FactoryBean;

/**
 * @Author:Madg
 * @Date:2018/12/4/004 19:58
 */
public class CarFactoryBean implements FactoryBean<Car>
{
    private String carinfo;
    @Override
    public Car getObject() throws Exception
    {
        Car car=new Car();
        String[] infos=carinfo.split(",");

        car.setBrand(infos[0]);
        car.setMaxSpeed(Integer.valueOf(infos[1]));
        car.setPrice(Integer.valueOf(infos[2]));
        return car;
    }

    @Override
    public Class<Car> getObjectType()
    {
        return Car.class;
    }

    @Override
    public boolean isSingleton()
    {
        return false;
    }

    public String getCarinfo()
    {
        return carinfo;
    }

    public void setCarinfo(String carinfo)
    {
        this.carinfo = carinfo;
    }
}
