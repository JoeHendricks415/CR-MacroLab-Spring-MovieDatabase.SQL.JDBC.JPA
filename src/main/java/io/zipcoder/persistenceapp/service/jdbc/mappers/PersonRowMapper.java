package io.zipcoder.persistenceapp.service.jdbc.mappers;

import io.zipcoder.persistenceapp.domain.Person;
import org.springframework.jdbc.core.RowMapper;
import javax.swing.tree.TreePath;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonRowMapper implements RowMapper {

    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        Person person = new Person();
        person.setId(rs.getInt("ID"));
        person.setFirstName(rs.getString("FIRST_NAME"));
        person.setSurName(rs.getString("LAST_NAME"));
        person.setMobileNumber(rs.getString("MOBILE"));
        //person.setBirthDate(rs.getDate("BIRTHDAY"));
        //person.setHomeId(rs.getInt("HOME_ID"));

        return person;
    }
}