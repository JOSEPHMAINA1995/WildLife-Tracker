package models;

import DAO.EndangeredAnimalDao;
import DAO.NonEndangeredAnimalDao;
import DAO.SightingDao;
import org.junit.Rule;
import org.junit.Test;

import java.security.Timestamp;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SightingsTest {
    @Rule
    public DatabaseRule database = new DatabaseRule();
//
@Test
public void Sighting_instantiatesgetName_true() {
    Sighting sighting = new Sighting("LION","ZONE A","AFRED");
    SightingDao sightingDao = new SightingDao();
    assertEquals("LION", sighting.getName());
}
    @Test
    public void Sighting_instantiatesgetLocation_true() {
        Sighting sighting = new Sighting("LION","ZONE A","AFRED");
        SightingDao sightingDao = new SightingDao();
        assertEquals("ZONE A", sighting.getLocation());
    }
    @Test
    public void Sighting_instantiatesgetStrangerName_true() {
        Sighting sighting = new Sighting("LION","ZONE A","AFRED");
        SightingDao sightingDao = new SightingDao();
        assertEquals("AFRED", sighting.getRanger());
    }










































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































//    public void save_recordsTimeOfCreationInDatabase() {
//        Sighting sighting = new Sighting("Zone A","Bubbles", 1);
//        SightingDao sightingDao = new SightingDao();
//        sightingDao.add(sighting);
//        Timestamp savedSightingSeen = Sighting.find(sighting.getId()).getSeen();
//        Timestamp rightNow = new Timestamp(new Date().getTime());
//        assertEquals(rightNow, savedMonsterBirthday);
//    }
}
