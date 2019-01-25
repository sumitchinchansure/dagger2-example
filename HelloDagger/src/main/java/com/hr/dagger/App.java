package com.hr.dagger;

import com.hr.dagger.component.AccelerateComponent;
import com.hr.dagger.component.CarComponent;
import com.hr.dagger.component.DaggerAccelerateComponent;
import com.hr.dagger.component.DaggerCarComponent;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
      AccelerateComponent  AccComponent = DaggerAccelerateComponent.create();
      CarComponent carComponent = DaggerCarComponent.create();
      AccComponent.accelerate().speedUp();
      carComponent.car().runCar();
    }
}
