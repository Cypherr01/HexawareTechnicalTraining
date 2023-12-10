package com.hexaware.fastXBus.service;

import java.time.LocalDate;
import java.util.List;

import com.hexaware.fastXBus.dto.BusesDTO;
import com.hexaware.fastXBus.entity.Buses;

public interface IBusesService {

	public Buses createBuses(BusesDTO busesdto);
	public Buses updateBuses(BusesDTO busesdto,Long busId);
	public void  deleteBuses(Long busId);
	public BusesDTO getBusById(Long busId);
	 List<Buses> getAllBusesByCitiesAndDate(String sourceCity, String destinationCity, LocalDate date);
	
	public List<Buses>getAllBuses();
}
