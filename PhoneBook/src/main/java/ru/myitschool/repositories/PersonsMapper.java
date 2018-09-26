package ru.myitschool.repositories;
 
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import ru.myitschool.entity.Persons;
 
public class PersonsMapper implements RowMapper<Persons> {
 
    public Persons mapRow(ResultSet rs, int rowNum) throws SQLException {
        Persons person = new Persons();
        person.setId(rs.getInt("id"));
        person.setName(rs.getString("name"));
        return person;
    }
}