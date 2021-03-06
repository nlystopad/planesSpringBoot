package com.lystopad.planes.service;

import com.lystopad.planes.domain.Pilot;
import com.lystopad.planes.domain.Plane;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;


public interface PlaneService {
    Plane create(Plane plane);

    List<Plane> getAll();

    Plane getById(Integer id);

    Plane updateById(Plane plane, Integer id);

    void removeById(Integer id);


    Plane findPlaneByName(String name);

    Collection<Plane> findPlaneByFighter();

    void updateDate(Integer id, LocalDateTime dateTime);

    Pilot getPilotByPlaneId(Integer id);

    Plane addMainPilot(Integer id, Pilot pilot);
}
