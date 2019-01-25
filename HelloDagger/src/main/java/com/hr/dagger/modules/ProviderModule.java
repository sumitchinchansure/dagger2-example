package com.hr.dagger.modules;

import javax.inject.Singleton;

import com.hr.dagger.interfaces.Accelarate;
import com.hr.dagger.interfaces.Car;
import com.hr.dagger.service.AccelarateService;
import com.hr.dagger.service.CarService;

import dagger.Module;
import dagger.Provides;

@Module
public class ProviderModule {

	@Provides
	@Singleton
	public Accelarate accelerate() {
		return new AccelarateService();
	}

	@Provides
	@Singleton
	public Car car() {
		return new CarService();
	}

}
